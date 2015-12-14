import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Mathieu on 14/12/15.
 */
public class Repertoire {
    private ArrayList<Cours> cours;

    public Repertoire() {
        cours = new ArrayList<>();
        remplirRepertoire();
    }

    public ArrayList<Cours> getCours() {
        return this.cours;
    }

    private void remplirRepertoire() {
        cours.clear();

        try (BufferedReader br = new BufferedReader(new FileReader("fichiers/repertoire.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.charAt(0) != '#') {
                    String[] data = line.split("\\ ");

                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
