package Cours_2;

import java.util.Scanner;

/**
 * Ce programme décompose un nombre en ses chiffres individuels et les affiche séparément.
 */
public class Exercice_7_DecompositionNombre {
    /**
     * Méthode principale du programme.
     * Demande à l'utilisateur d'entrer un nombre à décomposer,
     * puis décompose ce nombre en ses chiffres individuels et les affiche séparément.
     * @param args Les arguments de la ligne de commande (non utilisés dans ce programme)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre à décomposer : ");
        int nombre = scanner.nextInt();

        // Tant que le nombre est supérieur à 0, on continue la décomposition
        while (nombre > 0) {
            // On récupère le chiffre des unités en prenant le reste de la division par 10
            int chiffre = nombre % 10;
            // On divise le nombre par 10 pour "retirer" le chiffre des unités
            nombre /= 10;

            // Affiche le chiffre des unités
            System.out.println(chiffre);
        }

        scanner.close();
    }
}
