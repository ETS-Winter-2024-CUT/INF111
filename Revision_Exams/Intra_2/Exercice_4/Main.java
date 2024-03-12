package Revision_Exams.Intra_2.Exercice_4;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Etudiant unEtudiant = new Etudiant("AB123CD", "Quelqu'un");
        Cours coursA = new Cours("INF110");
        Cours coursB = new Cours("INF111");

        for (int i = 0; i < 4; i++) {
            Examen nouvExamen = new Examen(TypeExamen.TEST, new Date(), 0.15, coursA);
            unEtudiant.ajouterExamen(nouvExamen);
        }

        for (int i = 0; i < 2; i++) {
            Examen nouvExamen = new Examen(TypeExamen.TEST, new Date(), 0.1, coursB);
            unEtudiant.ajouterExamen(nouvExamen);
        }

        unEtudiant.afficheBulletin(coursA.getSigle());
        unEtudiant.afficheBulletin(coursB.getSigle());
    }
}
