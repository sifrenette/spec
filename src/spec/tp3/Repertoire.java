package spec.tp3;

import spec.tp3.Cours.Offre;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Repertoire
{
    private Set<Cours> cours;

    public Repertoire(String path)
    {
        cours = new HashSet<>();
        remplirRepertoire(path);
    }

    public Set<Cours> getCours()
    {
        return this.cours;
    }

    public Optional<Cours> getCoursAvecSigle(final String sigle)
    {
        return this.cours.stream().filter(c -> c.getSigle().equals(sigle)).findAny();
    }

    private void remplirRepertoire(String path)
    {
        final Map<Cours, List<String>> prealables = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path)))
        {
            String line;
            while ((line = br.readLine()) != null)
            {
                if (line.charAt(0) != '#')
                {
                    String[] data = line.split("\\ ");

                    String sigle = data[0];
                    int niveau = Integer.parseInt(data[1]);
                    int indicateurOffre = Integer.parseInt(data[2]);
                    boolean comporteProjet = false;
                    if (data[3].compareTo("Vrai") == 0)
                    {
                        comporteProjet = true;
                    }

                    ArrayList<String> siglesDesPrealables;

                    if (data.length > 4)
                    {
                        siglesDesPrealables = new ArrayList<>(Arrays.asList(data[4].split("\\,")));
                    }
                    else
                    {
                        siglesDesPrealables = new ArrayList<>();
                    }

                    final Cours cours = new Cours(sigle, niveau, Offre.fromInt(indicateurOffre), comporteProjet);
                    this.cours.add(cours);
                    prealables.put(cours, siglesDesPrealables);
                }
            }

            for(final Cours cours : this.cours)
            {
                final List<String> siglesDesPrealables = prealables.get(cours);
                cours.setPrealables(this.cours.stream().filter(c -> siglesDesPrealables.contains(c.getSigle())).collect(Collectors.toSet()));
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
