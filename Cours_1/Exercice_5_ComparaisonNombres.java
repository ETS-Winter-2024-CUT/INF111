package Cours_1;

import java.util.Scanner;

public class Exercice_5_ComparaisonNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la première valeur : ");
        double valeur1 = scanner.nextDouble();

        System.out.print("Entrez la deuxième valeur : ");
        double valeur2 = scanner.nextDouble();

        double somme = valeur1 + valeur2;

        System.err.println("La somme des deux valeurs est : " + somme);

        scanner.close();
    }
}
