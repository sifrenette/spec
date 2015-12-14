import java.util.ArrayList;

/**
 * Created by Mathieu on 14/12/15.
 */
public class Cours {
    private String sigle;
    private int niveau;
    private int indicateurOffre;
    private boolean comporteProjet;
    private ArrayList<String> prealables;

    public Cours() {
        sigle = "";
        niveau = 0;
        indicateurOffre = 0;
        comporteProjet = false;
        prealables = new ArrayList<>();
    }
}
