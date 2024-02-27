package Cours_1;

import java.util.Scanner;

/**
 * Ce programme vérifie si une personne est majeure ou mineure en fonction de son âge.
 */
public class Exercice_4_VerificationAge {
    /**
     * Méthode principale du programme.
     * Permet à l'utilisateur d'entrer l'âge d'une personne, 
     * puis détermine si elle est majeure ou mineure.
     *
     * @param args Les arguments de la ligne de commande (non utilisés dans ce programme)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez l'âge de la personne : ");
        int age = scanner.nextInt();

        // Vérification si la personne est mineure ou majeure, puis affichage du résultat
        System.out.println("La personne est " + (age < 18 ? "mineure." : "majeure."));

        scanner.close();
    }
}
