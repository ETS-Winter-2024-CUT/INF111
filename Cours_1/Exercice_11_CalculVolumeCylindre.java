package Cours_1;

import java.util.Scanner;

/**
 * Ce programme permet de calculer le volume d'un cylindre en fonction de la mesure de son rayon
 * et de sa hauteur.
 */
public class Exercice_11_CalculVolumeCylindre {
    /**
     * Méthode principale du programme.
     * Permet à l'utilisateur d'entrer la mesure du rayon et de la hauteur d'un cylindre,
     * puis calcule son volume et l'affiche.
     * @param args Les arguments de la ligne de commande (non utilisés dans ce programme)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la mesure du rayon du cylindre : ");
        double rayon = scanner.nextDouble();

        System.out.print("Entrez la mesure de la hauteur du cylindre : ");
        double hauteur = scanner.nextDouble();

        // Calcul du volume du cylindre en utilisant la formule : volume = π * rayon^2 * hauteur
        double volume = Math.PI * Math.pow(rayon, 2) * hauteur;

        // Affichage du volume du cylindre avec deux décimales
        System.out.printf("Le volume du cylindre est : %.2f\n", volume);

        scanner.close();
    }
}
