package Revision_Exams.Intra_2.Exercice_3;

import Revision_Exams.Intra_2.Exercice_3.Exceptions.*;

/**
 * Cette classe représente un compte bancaire avec des fonctionnalités de retrait et de virement.
 */
public class CompteBancaire {
    /**
     * La limite maximale pour un virement.
     */
    public static final double MAX_VIREMENT = 1000;

    private String numCompte;
    private double solde;

    /**
     * Constructeur de la classe CompteBancaire.
     *
     * @param numCompte Le numéro de compte.
     * @param solde     Le solde initial du compte.
     */
    public CompteBancaire(String numCompte, double solde) {
        this.numCompte = numCompte;
        this.solde = solde;
    }

    /**
     * Effectue un retrait du montant spécifié.
     *
     * @param montant Le montant à retirer.
     * @throws SoldeInsuffisantException Si le solde est insuffisant pour effectuer le retrait.
     */
    public void retrait(double montant) throws SoldeInsuffisantException {
        if (solde < montant)
            throw new SoldeInsuffisantException("Solde insuffisant!");

        solde -= montant;
    }

    /**
     * Effectue un virement vers un compte destinataire.
     *
     * @param montant          Le montant à virer.
     * @param cmptDestinataire Le numéro de compte destinataire.
     * @throws SoldeInsuffisantException Si le solde est insuffisant pour effectuer le virement.
     * @throws LimiteDepasseeException   Si le montant excède la limite de virement.
     */
    public void virement(double montant, String cmptDestinataire)
            throws SoldeInsuffisantException, LimiteDepasseeException {
        if (solde < montant)
            throw new SoldeInsuffisantException("Solde insuffisant!");

        if (montant > MAX_VIREMENT)
            throw new LimiteDepasseeException("Limite de virement dépassée!");

        // On évite les virements vers soi-même
        if (cmptDestinataire.equals(numCompte))
            throw new IllegalArgumentException("Impossible d'effectuer un virement vers le même compte!");

        this.retrait(montant);

        // On suppose que l'argent est transféré magiquement
    }
}
