/**
 * Created by Mathieu on 14/12/15.
 */
public class Main {
    public static void main(String[] args) {
        Repertoire rep = new Repertoire("fichiers/repertoire.txt");
        Programme prog = new Programme("fichiers/programme.txt");
        Cas cas1 = new Cas("fichiers/cas1.txt");
        Cas cas2 = new Cas("fichiers/cas2.txt");
        Cas cas3 = new Cas("fichiers/cas3.txt");
    }
}
