package spec.tp3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

// Simon Frenette 111 104 101 IFT
// Mathieu Larue 111 098 142 IFT
public class Cas
{
    private Repertoire repertoire;
    private Set<Cours> coursReussis;
    private int prochaineSession;
    private List<CheminementPersonnaliseSession> sessions;

    public Cas(Repertoire repertoire, String path)
    {
        this.coursReussis = new HashSet<>();
        this.prochaineSession = 0;
        this.sessions = new ArrayList<>();
        this.repertoire = repertoire;

        remplirCas(path);
    }

    public Set<Cours> getCoursReussis()
    {
        return coursReussis;
    }

    public int getProchaineSession()
    {
        return prochaineSession;
    }

    public List<CheminementPersonnaliseSession> getSessions()
    {
        return sessions;
    }

    private void remplirCas(String path)
    {
        coursReussis.clear();
        sessions.clear();

        try (BufferedReader br = new BufferedReader(new FileReader(path)))
        {
            String line;

            line = br.readLine();
            String[] ligneCoursReussis = line.split("\\ ");
            final List<String> siglesCoursReussis = Arrays.asList(ligneCoursReussis[1].split("\\,"));
            siglesCoursReussis.stream()
                    .map(s -> this.repertoire.getCoursAvecSigle(s))
                    .forEach(o -> o.ifPresent(c -> coursReussis.add(c)));

            line = br.readLine();
            String[] ligneProchaineSession = line.split("\\ ");
            this.prochaineSession = Integer.parseInt(ligneProchaineSession[1]);

            while ((line = br.readLine()) != null)
            {
                String[] data = line.split("\\ ");

                int numeroSession = Integer.parseInt(data[0]);

                final List<String> siglesDesCours = Arrays.asList(data[1].split("\\,"));
                final Set<Cours> cours = new HashSet<>();
                siglesDesCours.stream()
                        .map(s -> this.repertoire.getCoursAvecSigle(s))
                        .forEach(o -> o.ifPresent(cours::add));

                this.sessions.add(new CheminementPersonnaliseSession(numeroSession, cours));
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
