import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Mathieu on 14/12/15.
 */
public class Repertoire {
    private ArrayList<Cours> cours;

    public Repertoire() {
        cours = new ArrayList<>();
    }

    public ArrayList<Cours> getCours() {
        return this.cours;
    }
}
