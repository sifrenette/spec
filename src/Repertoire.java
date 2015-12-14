import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Mathieu on 14/12/15.
 */
public class Repertoire {
    private ArrayList<Cours> cours;

    public Repertoire(String path) {
        cours = new ArrayList<>();
        remplirRepertoire(path);
    }

    public ArrayList<Cours> getCours() {
        return this.cours;
    }

    private void remplirRepertoire(String path) {
        cours.clear();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.charAt(0) != '#') {
                    String[] data = line.split("\\ ");

                    String sigle = data[0];
                    int niveau = Integer.parseInt(data[1]);
                    int indicateurOffre = Integer.parseInt(data[2]);
                    boolean comporteProjet = false;
                    if (data[3].compareTo("Vrai") == 0) {
                        comporteProjet = true;
                    }

                    ArrayList<String> prealables;

                    if (data.length > 4) {
                        prealables = new ArrayList<String>(Arrays.asList(data[4].split("\\,")));
                    } else {
                        prealables = new ArrayList<>();
                    }

                    this.cours.add(new Cours(sigle, niveau, indicateurOffre, comporteProjet, prealables));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
