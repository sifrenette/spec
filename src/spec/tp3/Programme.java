package spec.tp3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

// Simon Frenette 111 104 101 IFT
// Mathieu Larue 111 098 142 IFT
public class Programme
{
    private final Repertoire repertoire;
    private final Set<Cours> obligatoires;
    private final Set<Cours> optionnels;

    public Programme(Repertoire repertoire, String path)
    {
        this.obligatoires = new HashSet<>();
        this.optionnels = new HashSet<>();
        this.repertoire = repertoire;

        this.remplirProgramme(path);
    }

    /**
     * @param cours
     * @return si le programme contient cours
     */
    public boolean contientCours(final Cours cours)
    {
        return this.obligatoires.contains(cours) || this.optionnels.contains(cours);
    }

    private void remplirProgramme(String path)
    {
        obligatoires.clear();
        optionnels.clear();

        try (BufferedReader br = new BufferedReader(new FileReader(path)))
        {
            String line = br.readLine();
            String[] data = line.split("\\ ");
            final List<String> siglesCoursObligatoires = Arrays.asList(data[1].split("\\,"));
            siglesCoursObligatoires.stream()
                    .map(repertoire::getCoursAvecSigle)
                    .forEach(o -> o.ifPresent(this.obligatoires::add));

            line = br.readLine();
            data = line.split("\\ ");
            final List<String> siglesCoursOptionnels = Arrays.asList(data[1].split("\\,"));
            siglesCoursOptionnels.stream()
                    .map(repertoire::getCoursAvecSigle)
                    .forEach(o -> o.ifPresent(this.optionnels::add));

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public Set<Cours> getObligatoires()
    {
        return this.obligatoires;
    }

    public Set<Cours> getOptionnels()
    {
        return this.optionnels;
    }
}
