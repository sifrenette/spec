package spec.tp3;

import java.util.Set;

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
