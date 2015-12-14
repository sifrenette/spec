import java.util.ArrayList;

/**
 * Created by Mathieu on 14/12/15.
 */
public class CheminementPersonnaliseSession {
    private int numeroSession;
    private ArrayList<String> cours;

    public CheminementPersonnaliseSession(int numeroSession, ArrayList<String> cours) {
        this.numeroSession = numeroSession;
        this.cours = cours;
    }

    public int getNumeroSession() {
        return numeroSession;
    }

    public ArrayList<String> getCours() {
        return cours;
    }
}
