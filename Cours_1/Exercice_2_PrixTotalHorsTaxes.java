package Cours_1;

import java.util.Scanner;

/**
 * Ce programme calcule le prix total hors taxes en fonction du prix d'un produit
 * et de la quantité vendue.
 */
public class Exercice_2_PrixTotalHorsTaxes {
    /**
     * Méthode principale du programme.
     * Permet à l'utilisateur d'entrer le prix d'un produit et la quantité vendue,
     * puis calcule le prix total hors taxes.
     *
     * @param args Les arguments de la ligne de commande (non utilisés dans ce programme)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le prix du produit : ");
        double prixProduit = scanner.nextDouble();

        System.out.print("Entrez la quantité vendue : ");
        int quantiteVendue = scanner.nextInt();

        double prixHorsTaxes = prixProduit * quantiteVendue;

        System.out.printf("Le prix total hors taxes est : %.2f$.\n", prixHorsTaxes);

        scanner.close();
    }
}
