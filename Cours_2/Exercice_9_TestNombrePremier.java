package Cours_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Ce programme teste si un nombre donné est premier en vérifiant s'il a exactement deux diviseurs.
 */
public class Exercice_9_TestNombrePremier {
    /**
     * Méthode principale du programme.
     * Demande à l'utilisateur d'entrer un nombre,
     * puis teste si ce nombre est premier en vérifiant s'il a exactement deux diviseurs.
     * @param args Les arguments de la ligne de commande (non utilisés dans ce programme)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre : ");
        int nombre = scanner.nextInt();

        // Vérifie si le nombre est négatif
        if (nombre < 1) {
            scanner.close();
            throw new Error("Le nombre doit être un entier positif!");
        }

        // Obtient la liste des diviseurs du nombre
        List<Integer> diviseurs = listeDiviseurs(nombre);

        // Si le nombre a exactement deux diviseurs (1 et lui-même), il est premier
        if (diviseurs.size() == 1) {
            System.out.println(nombre + " est premier.");
        } else {
            System.out.println(nombre + " n'est pas premier.");
        }

        scanner.close();
    }

    /**
     * Méthode pour obtenir une liste de diviseurs d'un nombre.
     * @param valeur Le nombre dont on veut obtenir les diviseurs
     * @return Une liste des diviseurs du nombre donné
     */
    private static List<Integer> listeDiviseurs(int valeur) {
        List<Integer> diviseurs = new ArrayList<>();

        // Parcours tous les nombres de 1 à valeur/2 inclus
        for (int i = 1; i <= valeur / 2; i++) {
            // Vérifie si i est un diviseur de valeur
            if (valeur % i == 0) {
                // Si i est un diviseur, l'ajouter à la liste
                diviseurs.add(i);
            }
        }

        return diviseurs;
    }
}
