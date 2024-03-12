package Revision_Exams.Intra_2.Exercice_3;

import Revision_Exams.Intra_2.Exercice_3.Exceptions.*;

public class CompteBancaire {
    public static final double MAX_VIREMENT = 1000;

    private String numCompte;
    private double solde;

    public CompteBancaire(String numCompte, double solde) {
        this.numCompte = numCompte;
        this.solde = solde;
    }

    /**
     * Fait le retrait de montant et lance l'exception
     * SoldeInsuffisantException si le solde est insuffisant
     *
     * @param montant
     */
    public void retrait(double montant) throws SoldeInsuffisantException {
        if (solde < montant)
            throw new SoldeInsuffisantException("Solde insuffisant!");

        solde -= montant;
    }

    /**
     * Fait (simule) un virement vers un compte destinatiare,
     * lance l'exception SoldeInsuffisantException si le solde est insuffisant,
     * et l'exception LimiteDepasseeException si le montant est plus que MAX_VIREMENT
     *
     * @param montant
     */
    public void virement(double montant, String cmptDestinataire)
            throws SoldeInsuffisantException, LimiteDepasseeException {
        if (solde < montant)
            throw new SoldeInsuffisantException("Solde insuffisant!");

        if (montant > MAX_VIREMENT)
            throw new LimiteDepasseeException("Limite de virement dépassé!");

        // On évite les virements vers soi-même
        if (cmptDestinataire.equals(numCompte))
            throw new IllegalArgumentException("Impossible d'effectuer un virement vers le même compte!");

        this.retrait(montant);

        // On suppose que l'argent est transféré magiquement
    }
}
