package Cours_2;

import java.util.Scanner;

public class Exercice_6_Factorielle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la valeur 'n' de la factorielle a calculer : ");
        int nFin = scanner.nextInt();

        // Vérifie si la valeur de 'n' est invalide (inférieure à 1)
        if (nFin < 1) {
            scanner.close();
            throw new Error("Valeur invalide!");
        }

        int factorielle = 1;

        for (int i = 2; i <= nFin; i++) {
            factorielle *= i;
        }

        // Affiche la somme finale
        System.out.println("La valeur de la factorielle est : " + factorielle);

        scanner.close();
    }
}
