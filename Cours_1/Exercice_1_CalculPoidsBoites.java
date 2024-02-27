package Cours_1;

import java.util.Scanner;

/**
 * Ce programme calcule le poids total des boîtes en fonction du poids d'un article 
 * et du nombre de boîtes.
 */
public class Exercice_1_CalculPoidsBoites {
    // Nombre d'articles par boîte
    static final int NOMBRE_ARTICLES_PAR_BOITE = 36;

    /**
     * Méthode principale du programme.
     * Permet à l'utilisateur d'entrer le poids d'un article et le nombre de boîtes,
     * puis calcule le poids total des boîtes.
     *
     * @param args Les arguments de la ligne de commande (non utilisés dans ce programme)
     */
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
