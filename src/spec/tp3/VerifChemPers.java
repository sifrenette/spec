package spec.tp3;

import spec.tp3.Cours.Offre;

import java.util.HashSet;
import java.util.Set;

public class VerifChemPers
{
    private final Programme programme;

    public VerifChemPers(final Programme programme)
    {
        this.programme = programme;
    }

    /**
     * Verifie le cas passé en paramètre. Si le cas n'est pas valide, retourne un message d'erreur.
     */
    public String verifierCas(final Cas cas)
    {
        final StringBuilder result = new StringBuilder();
        if (!this.verifierCoursDejaReussi(cas))
            result.append("Non conformité - Des sessions futures contiennent des cours déjà réussis.\n");
        if (!this.verifierCoursHorsProgramme(cas))
            result.append("Non conformité - Certains cours du cheminement ne se trouvent pas dans le programme.\n");
        if (!this.verifierCoursProjet(cas))
            result.append("Non conformité - Certaines sessions contiennent plus qu'un cours à projet.\n");
        if (!this.verifierNombreDeCours(cas))
            result.append("Non conformité - Certaines sessions contiennent plus que 5 cours.\n");
        if (!this.verifierOffreCours(cas))
            result.append("Non conformité - Certaines sessions contiennent des cours qui ne sont pas offert à cette session.\n");
        if (!this.verifierPrealables(cas))
            result.append("Non conformité - Certaines sessions contiennent des cours dont les préalables ne seront pas réussis rendu à cette session.\n");

        if (result.length() == 0) return "Le cas est conforme.";
        else
        {
            result.setLength(result.length() - 1);
            return result.toString();
        }
    }

    /**
     * Verifie que le cas passé en paramètre ne possède pas des sessions futures contenant des cours qui ne sont pas dans le programme.
     *
     * @param cas
     * @return si le cas ne possède pas des sessions futures contenant des cours qui ne sont pas dans le programme.
     */
    private boolean verifierCoursHorsProgramme(final Cas cas)
    {
        for (CheminementPersonnaliseSession session : cas.getSessions())
        {
            if (session.getNumeroSession() >= cas.getProchaineSession())
            {
                for (Cours cours : session.getCours())
                {
                    if (!programme.contientCours(cours)) return false;
                }
            }
        }

        return true;
    }

    /**
     * Verifie que le cas passé en paramètre ne possède pas des sessions futures contenant des cours qui sont déjà réussis.
     *
     * @param cas
     * @return si le cas ne possède pas des sessions futures contenant des cours qui sont déjà réussis.
     */
    private boolean verifierCoursDejaReussi(final Cas cas)
    {
        for (CheminementPersonnaliseSession session : cas.getSessions())
        {
            if (session.getNumeroSession() >= cas.getProchaineSession())
            {
                for (Cours cours : session.getCours())
                {
                    if (cas.getCoursReussis().contains(cours)) return false;
                }
            }
        }

        return true;
    }

    /**
     * Verifie que le cas passé en paramètre ne possède pas des sessions futures contenant des cours qui sont déjà réussis.
     *
     * @param cas
     * @return si le cas ne possède pas des sessions futures contenant des cours qui sont déjà réussis.
     */
    private boolean verifierPrealables(final Cas cas)
    {
        for (CheminementPersonnaliseSession session : cas.getSessions())
        {
            final Set<Cours> coursSessionsPrecedentes = cas.getSessions().stream()
                    .filter(s -> s.getNumeroSession() < session.getNumeroSession())
                    .map(CheminementPersonnaliseSession::getCours)
                    .reduce(new HashSet<>(), (previous, current) ->
                    {
                        previous.addAll(current);
                        return previous;
                    });


            for (Cours cours : session.getCours())
            {
                for (Cours prealable : cours.getPrealables())
                {
                    if (!cas.getCoursReussis().contains(prealable) && !coursSessionsPrecedentes.contains(prealable))
                    {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    /**
     * Verifie que les cours du cas passé en paramètre sont offert à leur session.
     *
     * @param cas
     * @return si les cours du cas passé en paramètre sont offert à leur session.
     */
    private boolean verifierOffreCours(final Cas cas)
    {
        for (CheminementPersonnaliseSession session : cas.getSessions())
        {
            for (Cours cours : session.getCours())
            {
                if (session.getNumeroSession() % 2 == 0 && cours.getIndicateurOffre() == Offre.AUTOMNE) return false;
                else if (session.getNumeroSession() % 2 == 1 && cours.getIndicateurOffre() == Offre.HIVER) return false;
            }
        }

        return true;
    }

    /**
     * Verifie que le cas passé en paramètre ne comporte pas plus que 5 cours.
     *
     * @param cas
     * @return si le cas passé en paramètre ne comporte pas plus que 5 cours.
     */
    private boolean verifierNombreDeCours(final Cas cas)
    {
        for (CheminementPersonnaliseSession session : cas.getSessions())
        {
            if (session.getCours().size() > 5) return false;
        }

        return true;
    }

    /**
     * Verifie que le cas passé en paramètre ne comporte pas plus qu'un cours à projet.
     *
     * @param cas
     * @return si le cas passé en paramètre ne comporte pas plus qu'un cours à projet.
     */
    private boolean verifierCoursProjet(final Cas cas)
    {
        for (CheminementPersonnaliseSession session : cas.getSessions())
        {
            if (session.getCours().stream().filter(Cours::comporteProjet).count() > 1) return false;
        }

        return true;
    }
}
