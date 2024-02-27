package Cours_1;

import java.util.Scanner;

public class Exercice_3_CalculSurfaceCercle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la mesure du rayon du cercle : ");
        double rayon = scanner.nextDouble();

        double surface = Math.PI * Math.pow(rayon, 2);

        System.out.println("La surface du cercle est : " + surface + ".");

        scanner.close();
    }
}
