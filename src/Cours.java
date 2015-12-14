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

    public Cours(String sigle, int niveau, int indicateurOffre, boolean comporteProjet, ArrayList<String> prealables) {
        this.sigle = sigle;
        this.niveau = niveau;
        this.indicateurOffre = indicateurOffre;
        this.comporteProjet = comporteProjet;
        this.prealables = prealables;
    }

    public String getSigle() {
        return sigle;
    }

    public int getNiveau() {
        return niveau;
    }

    public int getIndicateurOffre() {
        return indicateurOffre;
    }

    public boolean comporteProjet() {
        return comporteProjet;
    }

    public ArrayList<String> getPrealables() {
        return prealables;
    }
}
