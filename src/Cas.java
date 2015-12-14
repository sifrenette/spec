import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Mathieu on 14/12/15.
 */
public class Cas {
    private ArrayList<String> coursReussis;
    private int prochaineSession;
    private ArrayList<CheminementPersonnaliseSession> cheminementPersonnalise;

    public Cas(String path) {
        this.coursReussis = new ArrayList<>();
        this.prochaineSession = 0;
        this.cheminementPersonnalise = new ArrayList<>();

        remplirCas(path);
    }

    private void remplirCas(String path) {
        coursReussis.clear();
        cheminementPersonnalise.clear();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;

            line = br.readLine();
            String[] ligneCoursReussis = line.split("\\ ");
            this.coursReussis = new ArrayList<String>(Arrays.asList(ligneCoursReussis[1].split("\\,")));

            line = br.readLine();
            String[] ligneProchaineSession = line.split("\\ ");
            this.prochaineSession = Integer.parseInt(ligneProchaineSession[1]);

            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\ ");

                int numeroSession = Integer.parseInt(data[0]);

                ArrayList<String> cours = new ArrayList<String>(Arrays.asList(data[1].split("\\,")));

                this.cheminementPersonnalise.add(new CheminementPersonnaliseSession(numeroSession, cours));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
