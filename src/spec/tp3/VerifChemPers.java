package spec.tp3;

import spec.tp3.Cours.Offre;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

// Simon Frenette 111 104 101 IFT
// Mathieu Larue 111 098 142 IFT
public class VerifChemPers
{
    private final Programme programme;

    public VerifChemPers(final Programme programme)
    {
        this.programme = programme;
    }

    /**
     * Verifie le cas passé en paramètre. Si le cas n'est pas valide, retourne un message d'erreur.
     * @return le message représentant le résultat de la vérification
     */
    public String verifierCas(final Cas cas)
    {
        final StringBuilder result = new StringBuilder();
        this.verifierCoursDejaReussi(cas).ifPresent(s -> result.append("Non conformité - ").append(s).append("\n"));
        this.verifierCoursHorsProgramme(cas).ifPresent(s -> result.append("Non conformité - ").append(s).append("\n"));
        this.verifierCoursProjet(cas).ifPresent(s -> result.append("Non conformité - ").append(s).append("\n"));
        this.verifierNombreDeCours(cas).ifPresent(s -> result.append("Non conformité - ").append(s).append("\n"));
        this.verifierOffreCours(cas).ifPresent(s -> result.append("Non conformité - ").append(s).append("\n"));
        this.verifierPrealables(cas).ifPresent(s -> result.append("Non conformité - ").append(s).append("\n"));

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
     * @return si le cas ne possède pas des sessions futures contenant des cours qui ne sont pas dans le programme, retourne un message d'erreur
     */
    private Optional<String> verifierCoursHorsProgramme(final Cas cas)
    {
        for (CheminementPersonnaliseSession session : cas.getSessions())
        {
            if (session.getNumeroSession() >= cas.getProchaineSession())
            {
                for (Cours cours : session.getCours())
                {
                    if (!programme.contientCours(cours))
                        return Optional.of("Le cours " + cours + " ne se trouve pas dans le programme.");
                }
            }
        }

        return Optional.empty();
    }

    /**
     * Verifie que le cas passé en paramètre ne possède pas des sessions futures contenant des cours qui sont déjà réussis.
     *
     * @param cas
     * @return si le cas ne possède pas des sessions futures contenant des cours qui sont déjà réussis, retourne un message d'erreur
     */
    private Optional<String> verifierCoursDejaReussi(final Cas cas)
    {
        for (CheminementPersonnaliseSession session : cas.getSessions())
        {
            if (session.getNumeroSession() >= cas.getProchaineSession())
            {
                for (Cours cours : session.getCours())
                {
                    if (cas.getCoursReussis().contains(cours))
                        return Optional.of("Le cours " + cours + " dans la session " + session.getNumeroSession() + " est déjà réussi.");
                }
            }
        }

        return Optional.empty();
    }

    /**
     * Verifie que le cas passé en paramètre ne possède pas des sessions futures contenant des cours qui sont déjà réussis.
     *
     * @param cas
     * @return si le cas ne possède pas des sessions futures contenant des cours qui sont déjà réussis, retourne un message d'erreur
     */
    private Optional<String> verifierPrealables(final Cas cas)
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
                        return Optional.of("Le préalable " + prealable + " du cours " + cours + " à la session " + session.getNumeroSession() + " ne sera pas réussi rendu à cette session.");
                    }
                }
            }
        }

        return Optional.empty();
    }

    /**
     * Verifie que les cours du cas passé en paramètre sont offert à leur session.
     *
     * @param cas
     * @return si les cours du cas passé en paramètre sont offert à leur session, retourne un message d'erreur
     */
    private Optional<String> verifierOffreCours(final Cas cas)
    {
        for (CheminementPersonnaliseSession session : cas.getSessions())
        {
            for (Cours cours : session.getCours())
            {
                if ((session.getNumeroSession() % 2 == 0 && cours.getIndicateurOffre() == Offre.AUTOMNE) ||
                (session.getNumeroSession() % 2 == 1 && cours.getIndicateurOffre() == Offre.HIVER))
                    return Optional.of("Le cours " + cours + " à la session " + session.getNumeroSession() + " n'est pas offert à cette session.");
            }
        }

        return Optional.empty();
    }

    /**
     * Verifie que le cas passé en paramètre ne comporte pas plus que 5 cours.
     *
     * @param cas
     * @return si le cas passé en paramètre ne comporte pas plus que 5 cours, retourne un message d'erreur
     */
    private Optional<String> verifierNombreDeCours(final Cas cas)
    {
        for (CheminementPersonnaliseSession session : cas.getSessions())
        {
            if (session.getCours().size() > 5)
                return Optional.of("La session " + session.getNumeroSession() + " contient plus que 5 cours.");
        }

        return Optional.empty();
    }

    /**
     * Verifie que le cas passé en paramètre ne comporte pas plus qu'un cours à projet.
     *
     * @param cas
     * @return si le cas passé en paramètre ne comporte pas plus qu'un cours à projet, retourne un message d'erreur
     */
    private Optional<String> verifierCoursProjet(final Cas cas)
    {
        for (CheminementPersonnaliseSession session : cas.getSessions())
        {
            if (session.getCours().stream().filter(Cours::comporteProjet).count() > 1)
                return Optional.of("La session " + session.getNumeroSession() + " comporte plus d'un cours avec projet.");
        }

        return Optional.empty();
    }
}
