package spec.tp3;

public class Main
{
    public static void main(String[] args)
    {
        Repertoire rep = new Repertoire("fichiers/repertoire.txt");
        Programme prog = new Programme(rep, "fichiers/programme.txt");
        Cas cas1 = new Cas(rep, "fichiers/cas1.txt");
        Cas cas2 = new Cas(rep, "fichiers/cas2.txt");
        Cas cas3 = new Cas(rep, "fichiers/cas3.txt");

        final VerifChemPers verifChemPers = new VerifChemPers(prog);
        System.out.println("---------- Cas 1 ----------");
        System.out.println(verifChemPers.verifierCas(cas1));
        System.out.println("---------- Cas 2 ----------");
        System.out.println(verifChemPers.verifierCas(cas2));
        System.out.println("---------- Cas 3 ----------");
        System.out.println(verifChemPers.verifierCas(cas3));
    }
}
