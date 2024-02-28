package Cours_2;

import java.util.Scanner;

/**
 * Ce programme calcule la somme d'une série de fractions jusqu'à un certain terme 'n'.
 */
public class Exercice_4_SommeSerieFraction {
    /**
     * Méthode principale du programme.
     * Demande à l'utilisateur d'entrer la valeur 'n' de fin de la série,
     * puis calcule la somme de la série de fractions jusqu'à ce terme 'n'.
     * @param args Les arguments de la ligne de commande (non utilisés dans ce programme)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la valeur 'n' de fin de la série : ");
        int nFin = scanner.nextInt();

        // Vérifie si la valeur de 'n' est invalide (inférieure à 1)
        if (nFin < 1) {
            scanner.close();
            throw new Error("Valeur invalide!");
        }

        double somme = 0.0;

        // Calcule la somme de la série de fractions jusqu'au terme 'n'
        for (double i = 1.0; i <= nFin; i++) {
            somme += 1 / i;
        }

        // Affiche la somme finale
        System.out.println("La valeur finale est : " + somme);

        scanner.close();
    }
}
