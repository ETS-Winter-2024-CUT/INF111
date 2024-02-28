package Cours_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Ce programme trouve le prochain nombre premier supérieur à un nombre donné.
 */
public class Exercice_10_ProchainNombrePremier {
    /**
     * Méthode principale du programme.
     * Demande à l'utilisateur d'entrer un nombre,
     * puis trouve le prochain nombre premier supérieur à ce nombre.
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

        // Tant que le nombre actuel n'a pas le bon nombre de diviseurs, l'incrémente
        while (listeDiviseurs(++nombre).size() > 1) {}

        // Affiche le prochain nombre premier trouvé
        System.out.println("Le prochain premier est : " + nombre);

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
