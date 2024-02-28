package Cours_2;

import java.util.Scanner;

/**
 * Ce programme calcule la factorielle d'un nombre entier positif 'n'.
 */
public class Exercice_6_Factorielle {
    /**
     * Méthode principale du programme.
     * Demande à l'utilisateur d'entrer la valeur 'n' de la factorielle à calculer,
     * puis calcule et affiche la factorielle de cette valeur.
     * @param args Les arguments de la ligne de commande (non utilisés dans ce programme)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la valeur 'n' de la factorielle à calculer : ");
        int nFin = scanner.nextInt();

        // Vérifie si la valeur de 'n' est invalide (inférieure à 1)
        if (nFin < 1) {
            scanner.close();
            throw new Error("Valeur invalide!");
        }

        int factorielle = 1;

        // Calcule la factorielle de 'n'
        for (int i = 2; i <= nFin; i++) {
            factorielle *= i;
        }

        // Affiche la valeur de la factorielle
        System.out.println("La valeur de la factorielle est : " + factorielle);

        scanner.close();
    }
}
