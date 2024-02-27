package Cours_1;

import java.util.Scanner;

/**
 * Ce programme permet à l'utilisateur d'entrer deux valeurs, puis calcule leur somme.
 */
public class Exercice_5_ComparaisonNombres {
    /**
     * Méthode principale du programme.
     * Permet à l'utilisateur d'entrer deux valeurs, puis calcule leur somme et l'affiche.
     *
     * @param args Les arguments de la ligne de commande (non utilisés dans ce programme)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la première valeur : ");
        double valeur1 = scanner.nextDouble();

        System.out.print("Entrez la deuxième valeur : ");
        double valeur2 = scanner.nextDouble();

        // Calcul de la somme des deux valeurs
        double somme = valeur1 + valeur2;

        // Affichage de la somme des deux valeurs
        System.err.println("La somme des deux valeurs est : " + somme);

        scanner.close();
    }
}
