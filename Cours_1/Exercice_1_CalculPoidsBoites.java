package Cours_1;

import java.util.Scanner;

public class Exercice_1_CalculPoidsBoites {
    static final int NOMBRE_ARTICLES_PAR_BOITE = 36;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le poids d'un article (en kilogrammes) : ");
        double poidsArticle = scanner.nextDouble();

        System.out.print("Entrez le nombre de boîtes : ");
        int nombreBoites = scanner.nextInt();

        double poidsBoites = poidsArticle * NOMBRE_ARTICLES_PAR_BOITE * nombreBoites;

        System.out.println("Le poids total des boîtes est : " + poidsBoites + " kilogrammes.");

        scanner.close();
    }
}
