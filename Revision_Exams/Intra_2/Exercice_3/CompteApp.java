package Revision_Exams.Intra_2.Exercice_3;

import Revision_Exams.Intra_2.Exercice_3.Exceptions.*;

public class CompteApp {
    public static void main(String[] args) {
        // Création d'un compte bancaire
        CompteBancaire compte = new CompteBancaire("123456789", 2000);

        // Opérations de retrait
        try {
            compte.retrait(500);
            System.out.println("Retrait effectué avec succès.");
        } catch (SoldeInsuffisantException e) {
            System.out.println("Échec du retrait: " + e.getMessage());
        }

        try {
            compte.retrait(2000);
            System.out.println("Retrait effectué avec succès.");
        } catch (SoldeInsuffisantException e) {
            System.out.println("Échec du retrait: " + e.getMessage());
        }

        // Opération de virement
        try {
            compte.virement(1500, "987654321"); // Montant plus grand que MAX_VIREMENT
            System.out.println("Virement effectué avec succès.");
        } catch (SoldeInsuffisantException | LimiteDepasseeException | IllegalArgumentException e) {
            System.out.println("Échec du virement: " + e.getMessage());
        }
    }
}
