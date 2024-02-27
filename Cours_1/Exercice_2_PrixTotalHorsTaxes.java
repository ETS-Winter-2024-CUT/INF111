package Cours_1;

import java.util.Scanner;

public class Exercice_2_PrixTotalHorsTaxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le prix du produit : ");
        double prixProduit = scanner.nextDouble();

        System.out.print("Entrez la quantité vendue : ");
        int quantiteVendue = scanner.nextInt();

        double prixHorsTaxes = prixProduit * quantiteVendue;

        System.out.println("Le prix total hors taxes est : " + prixHorsTaxes + "$.");

        scanner.close();
    }
}
