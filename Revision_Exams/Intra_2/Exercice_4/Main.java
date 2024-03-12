package Revision_Exams.Intra_2.Exercice_4;

import java.util.Date;

/**
 * Cette classe représente un point d'entrée pour exécuter le programme.
 */
public class Main {
    /**
     * Méthode principale pour tester la classe Etudiant et ses fonctionnalités.
     *
     * @param args Les arguments de la ligne de commande (non utilisés dans cette application)
     */
    public static void main(String[] args) {
        Etudiant unEtudiant = new Etudiant("AB123CD", "Quelqu'un");
        Cours coursA = new Cours("INF110");
        Cours coursB = new Cours("INF111");

        // Ajouter des examens pour le cours A
        for (int i = 0; i < 4; i++) {
            Examen nouvExamen = new Examen(TypeExamen.TEST, new Date(), 0.15, coursA);
            unEtudiant.ajouterExamen(nouvExamen);
        }

        // Ajouter des examens pour le cours B
        for (int i = 0; i < 2; i++) {
            Examen nouvExamen = new Examen(TypeExamen.TEST, new Date(), 0.1, coursB);
            unEtudiant.ajouterExamen(nouvExamen);
        }

        // Afficher le bulletin pour le cours A
        unEtudiant.afficheBulletin(coursA.getSigle());

        // Afficher le bulletin pour le cours B
        unEtudiant.afficheBulletin(coursB.getSigle());
    }
}
