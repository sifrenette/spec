package spec.tp3;

import java.util.Set;

// Simon Frenette 111 104 101 IFT
// Mathieu Larue 111 098 142 IFT
public class CheminementPersonnaliseSession
{
    private int numeroSession;
    private Set<Cours> cours;

    public CheminementPersonnaliseSession(int numeroSession, Set<Cours> cours)
    {
        this.numeroSession = numeroSession;
        this.cours = cours;
    }

    public int getNumeroSession()
    {
        return numeroSession;
    }

    public Set<Cours> getCours()
    {
        return cours;
    }
}
