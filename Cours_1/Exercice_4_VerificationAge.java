package Cours_1;

import java.util.Scanner;

public class Exercice_4_VerificationAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez l'âge de la personne : ");
        int age = scanner.nextInt();

        // Note: Oui je me suis amusé a faire "n'importe quoi"
        System.out.println("La personne est m" + (age < 18 ? "in" : "aj") + "eure.");

        scanner.close();
    }
}
