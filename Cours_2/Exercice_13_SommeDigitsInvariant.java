package Cours_2;

import java.util.Scanner;

/**
 * Ce programme calcule la somme des chiffres d'une suite de nombres de manière itérative
 * jusqu'à ce que la somme devienne invariante.
 */
public class Exercice_13_SommeDigitsInvariant {
    /**
     * Méthode principale du programme.
     * Demande à l'utilisateur d'entrer une suite de nombres, puis calcule la somme des chiffres
     * de manière itérative jusqu'à ce que la somme devienne invariante.
     * @param args Les arguments de la ligne de commande (non utilisés dans ce programme)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une suite de nombres : ");
        int suite = scanner.nextInt();

        int valeurDerniereIteration = 0;

        // Calcule la somme des chiffres de manière itérative jusqu'à ce que la somme ne varie plus
        while (suite != valeurDerniereIteration) {
            // Stocke la valeur de la suite avant la dernière itération
            valeurDerniereIteration = suite;

            int somme = 0;

            // Calcule la somme des chiffres de la suite
            while (suite > 0) {
                somme += suite % 10;
                suite /= 10;
            }

            // Met à jour la suite avec la somme des chiffres calculée
            suite = somme;
            System.out.println(suite); // Affiche la somme des chiffres calculée à chaque itération
        }

        scanner.close();
    }
}
