package Cours_1;

import java.util.Scanner;

/**
 * Ce programme permet de convertir une température donnée en degrés Celsius en degrés Fahrenheit.
 */
public class Exercice_10_ConversionTemperature {
    /**
     * Méthode principale du programme.
     * Permet à l'utilisateur d'entrer une température en degrés Celsius, puis convertit cette 
     * température en degrés Fahrenheit et l'affiche.
     * @param args Les arguments de la ligne de commande (non utilisés dans ce programme)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une température en degrés Celcius : ");
        double temperatureC = scanner.nextDouble();

        // Conversion de la température de Celsius en Fahrenheit
        double temperatureF = temperatureC * 9 / 5 + 32;

        // Affichage du résultat de la conversion
        System.out.printf("Cela équivaud à %.2f degrés Fahrenheit\n", temperatureF);

        scanner.close();
    }
}
