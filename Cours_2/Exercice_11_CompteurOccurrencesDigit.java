package Cours_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Ce programme compte le nombre d'occurrences d'un chiffre donné dans une suite de nombres.
 */
public class Exercice_11_CompteurOccurrencesDigit {
    /**
     * Méthode principale du programme.
     * Demande à l'utilisateur d'entrer une suite de nombres et une valeur à trouver,
     * puis compte le nombre d'occurrences de cette valeur dans la suite de nombres.
     * @param args Les arguments de la ligne de commande (non utilisés dans ce programme)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int compteur = 0;

        System.out.print("Entrez une suite de nombres : ");
        int suite = scanner.nextInt();

        System.out.print("Entrez la valeur à trouver : ");
        int valeur = scanner.nextInt();

        // Parcourt les chiffres de la suite de nombres et compte le nombre d'occurrences
        for (int chiffre : decomposer(suite)) {
            if (chiffre == valeur) {
                compteur++;
            }
        }

        // Affiche le nombre d'occurrences de la valeur donnée dans la suite de nombres
        System.out.println("Il y a " + compteur + " occurences de " + valeur + " dans " + suite);

        scanner.close();
    }

    /**
     * Méthode pour décomposer un nombre en ses chiffres individuels.
     * @param nombre Le nombre à décomposer
     * @return Une liste des chiffres individuels du nombre
     */
    private static List<Integer> decomposer(int nombre) {
        List<Integer> valeurs = new ArrayList<>();

        // Décompose le nombre en ses chiffres individuels et les ajoute à la liste
        while (nombre > 0) {
            // On récupère le chiffre des unités en prenant le reste de la division par 10
            int chiffre = nombre % 10;
            // On divise le nombre par 10 pour "retirer" le chiffre des unités
            nombre /= 10;

            valeurs.add(chiffre);
        }

        return valeurs;
    }
}
