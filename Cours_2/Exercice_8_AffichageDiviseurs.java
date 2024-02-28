package Cours_2;

import java.util.Scanner;

/**
 * Ce programme affiche tous les diviseurs d'un nombre donné (autres que 1 et le nombre lui-même).
 */
public class Exercice_8_AffichageDiviseurs {
    /**
     * Méthode principale du programme.
     * Demande à l'utilisateur d'entrer une valeur,
     * puis affiche tous ses diviseurs (autres que 1 et le nombre lui-même).
     * @param args Les arguments de la ligne de commande (non utilisés dans ce programme)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une valeur : ");
        int valeur = scanner.nextInt();

        // Parcours tous les nombres de 1 à valeur/2 inclus
        for (int i = 1; i <= valeur / 2; i++) {
            // Vérifie si i est un diviseur de valeur
            if (valeur % i == 0) {
                // Si i est un diviseur, l'affiche
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
