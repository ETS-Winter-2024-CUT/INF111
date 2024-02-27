package Cours_1;

import java.util.Scanner;

public class Exercice_10_ConversionTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une température en degrés Celcius : ");
        double temperatureC = scanner.nextDouble();

        double temperatureF = temperatureC * 9 / 5 + 32;

        System.out.println("Cela équivaud à " + temperatureF + " degrés Fahrenheit");

        scanner.close();
    }
}
