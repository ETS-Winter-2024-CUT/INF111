package Cours_2;

import java.util.Scanner;

/**
 * Ce programme permet de lire un numérateur et un dénominateur à partir de l'entrée standard
 * et d'afficher la fraction correspondante simplifiée si possible.
 */
public class Exercice_1_Fraction {
    /**
     * Méthode principale du programme.
     * Demande à l'utilisateur d'entrer le numérateur et le dénominateur d'une fraction,
     * puis affiche la fraction simplifiée si possible.
     * @param args Les arguments de la ligne de commande (non utilisés dans ce programme)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le numérateur de la fraction : ");
        int numerateur = scanner.nextInt();

        System.out.print("Entrez le dénominateur de la fraction : ");
        int denominateur = scanner.nextInt();

        if (denominateur == 0) {
            System.out.println("Impossible");
        } else if (denominateur == 1) {
            System.out.println(numerateur);
        } else if (numerateur == 0) {
            System.out.println("0");
        } else {
            if (denominateur < 0) {
                numerateur *= -1;
                denominateur *= -1;
            }

            System.out.printf("%d/%d\n", numerateur, denominateur);
        }

        scanner.close();
    }
}
