package Cours_2;

import java.util.Scanner;

/**
 * Ce programme extrait les chiffres impairs d'une suite de nombres donnée et les compose
 * pour former un nouveau nombre entier.
 */
public class Exercice_12_ExtraireImpairs {
    /**
     * Méthode principale du programme.
     * Demande à l'utilisateur d'entrer une suite de nombres, puis extrait les chiffres impairs
     * de cette suite pour former un nouveau nombre entier.
     * @param args Les arguments de la ligne de commande (non utilisés dans ce programme)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une suite de nombres : ");
        int suite = scanner.nextInt();

        int resultat = 0;
        int nbImpairs = 0;

        // Parcourt les chiffres de la suite de nombres
        while (suite > 0) {
            // Extrait le chiffre des unités
            int chiffre = suite % 10;
            // Divise la suite de nombres par 10 pour "retirer" le chiffre des unités
            suite /= 10;

            // Ajoute un chiffree impair au résultat et met à jour le nombre de chiffres impairs
            if (chiffre % 2 != 0) {
                resultat += chiffre * Math.pow(10, nbImpairs++);
            }
        }

        // Affiche le nombre entier composé des chiffres impairs
        System.out.println("Le nombre entier composé des chiffres impairs est " + resultat);

        scanner.close();
    }
}
