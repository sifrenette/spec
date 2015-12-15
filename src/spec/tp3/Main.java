package spec.tp3;

// Simon Frenette 111 104 101 IFT
// Mathieu Larue 111 098 142 IFT
public class Main
{
    // COMMENTAIRE INDIQUANT SI LES SPÉCIFICATIONS NOUS ONT AIDÉ
    // Oui, les spécifications nous ont définitivement aidé à implémenter plus rapidement
    // les vérifications, puisque nous avions déjà en tête quelles conditions vérifier.

    public static void main(String[] args)
    {
        Repertoire rep = new Repertoire("fichiers/repertoire.txt");
        Programme prog = new Programme(rep, "fichiers/programme.txt");
        Cas cas1 = new Cas(rep, "fichiers/cas1.txt");
        Cas cas2 = new Cas(rep, "fichiers/cas2.txt");
        Cas cas3 = new Cas(rep, "fichiers/cas3.txt");
        Cas cas4 = new Cas(rep, "fichiers/cas4.txt");
        Cas cas5 = new Cas(rep, "fichiers/cas5.txt");
        Cas cas6 = new Cas(rep, "fichiers/cas6.txt");
        Cas cas7 = new Cas(rep, "fichiers/cas7.txt");

        final VerifChemPers verifChemPers = new VerifChemPers(prog);
        System.out.println("---------- Cas 1 ----------");
        System.out.println(verifChemPers.verifierCas(cas1));
        System.out.println("---------- Cas 2 ----------");
        System.out.println(verifChemPers.verifierCas(cas2));
        System.out.println("---------- Cas 3 ----------");
        System.out.println(verifChemPers.verifierCas(cas3));
        System.out.println("---------- Cas 4 ----------");
        System.out.println(verifChemPers.verifierCas(cas4));
        System.out.println("---------- Cas 5 ----------");
        System.out.println(verifChemPers.verifierCas(cas5));
        System.out.println("---------- Cas 6 ----------");
        System.out.println(verifChemPers.verifierCas(cas6));
        System.out.println("---------- Cas 7 ----------");
        System.out.println(verifChemPers.verifierCas(cas7));
    }
}
