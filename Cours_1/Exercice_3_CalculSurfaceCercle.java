package Cours_1;

import java.util.Scanner;

/**
 * Ce programme calcule la surface d'un cercle en fonction de la mesure de son rayon.
 */
public class Exercice_3_CalculSurfaceCercle {
    /**
     * Méthode principale du programme.
     * Permet à l'utilisateur d'entrer la mesure du rayon d'un cercle,
     * puis calcule la surface du cercle.
     *
     * @param args Les arguments de la ligne de commande (non utilisés dans ce programme)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la mesure du rayon du cercle : ");
        double rayon = scanner.nextDouble();

        // Calcul de la surface du cercle en utilisant la formule : surface = π * rayon^2
        double surface = Math.PI * Math.pow(rayon, 2);

        System.out.printf("La surface du cercle est : %.2f\n", surface);

        scanner.close();
    }
}
