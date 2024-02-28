package Cours_1;

import java.util.Scanner;

/**
 * Ce programme permet de convertir une durée donnée en secondes en un format d'heure, minute 
 * et seconde.
 */
public class Exercice_12_ConversionDuree {
    static final int SEC_PAR_MIN = 60; // Nombre de secondes par minute
    static final int MIN_PAR_HEURE = 60; // Nombre de minutes par heure

    /**
     * Méthode principale du programme.
     * Permet à l'utilisateur d'entrer une durée en secondes, 
     * puis convertit cette durée en un format d'heure, minute et seconde et l'affiche.
     * @param args Les arguments de la ligne de commande (non utilisés dans ce programme)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une durée en secondes : ");
        int secondes = scanner.nextInt();

        // Calcul du nombre de minutes dans la durée en secondes
        int minutes = secondes / SEC_PAR_MIN;
        secondes %= SEC_PAR_MIN; // Reste des secondes après avoir calculé les minutes

        // Calcul du nombre d'heures dans la durée en minuted
        int heures = minutes / MIN_PAR_HEURE;
        minutes %= MIN_PAR_HEURE; // Reste des minutes après avoir calculé les heures

        // Affichage du résultat sous forme d'heure, minute et seconde avec un formatage correct
        System.out.printf("Cela équivaut à %02d:%02d:%02d.\n", heures, minutes, secondes);

        scanner.close();
    }
}
