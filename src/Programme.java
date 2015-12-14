import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Mathieu on 14/12/15.
 */
public class Programme {
    private ArrayList<String> obligatoires;
    private ArrayList<String> optionnels;

    public Programme(String path) {
        this.obligatoires = new ArrayList<>();
        this.optionnels = new ArrayList<>();

        remplirProgramme(path);
    }

    private void remplirProgramme(String path) {
        obligatoires.clear();
        optionnels.clear();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            String[] data = line.split("\\ ");
            this.obligatoires = new ArrayList<String>(Arrays.asList(data[1].split("\\,")));

            line = br.readLine();
            data = line.split("\\ ");
            this.optionnels = new ArrayList<String>(Arrays.asList(data[1].split("\\,")));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> getObligatoires() {
        return this.obligatoires;
    }

    public ArrayList<String> getOptionnels() {
        return this.optionnels;
    }
}
