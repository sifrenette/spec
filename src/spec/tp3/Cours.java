package spec.tp3;

import java.util.Set;

public class Cours
{
    public enum Offre
    {
        HIVER,
        AUTOMNE,
        HIVER_ET_AUTOMNE;

        public static Offre fromInt(final int indicateur)
        {
            return indicateur == 1 ? AUTOMNE :
                    indicateur == 2 ? HIVER :
                    HIVER_ET_AUTOMNE;
        }
    }

    private String sigle;
    private int niveau;
    private Offre offre;
    private boolean comporteProjet;
    private Set<Cours> prealables;

    public Cours(String sigle, int niveau, Offre offre, boolean comporteProjet)
    {
        this.sigle = sigle;
        this.niveau = niveau;
        this.offre = offre;
        this.comporteProjet = comporteProjet;
    }

    public void setPrealables(final Set<Cours> prealables)
    {
        this.prealables = prealables;
    }

    public String getSigle()
    {
        return sigle;
    }

    public int getNiveau()
    {
        return niveau;
    }

    public Offre getIndicateurOffre()
    {
        return offre;
    }

    public boolean comporteProjet()
    {
        return comporteProjet;
    }

    public Set<Cours> getPrealables()
    {
        return prealables;
    }

    @Override
    public String toString()
    {
        return this.getSigle();
    }
}
