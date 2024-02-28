package Cours_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercice_2_SerieNombres {
    public static void main(String[] args) {
        String unInput; // Donnée introduite par l'utilisateur
        Scanner clavier;
        float unNombre; // la valeur numérique de l'input

        List<Float> valeurs = new ArrayList<>();

        clavier = new Scanner(System.in);

        System.out.print("Introduire une valeur numérique (ou # pour terminer)) : ");
        // Lecture du nombre sous la forme d'une chaine de caractères
        unInput = clavier.nextLine();

        // On boucle tant que ce n'est pas "#"
        while (!unInput.equals("#")) {

            // Transformation de la chaine de caractère en un nombre
            // Attention, il y aura une erreur si la chaine de caractères n'est pas un nombre
            unNombre = Float.parseFloat(unInput);

            // Affichage de la valeur numérique (non indispensable)
            System.out.println("La nouvelle valeur : " + unNombre);

            valeurs.add(unNombre);

            // Lecture d'un nouveau nombre
            System.out.print("Introduire une valeur numérique (ou # pour terminer)) : ");
            unInput = clavier.nextLine();

        } // fin du while

        // Affichage du nombre de valeurs
        System.out.println(valeurs.size() + " valeurs introduites.");

        // Affichage de la somme des valeurs
        float somme = 0.0f;

        for (float nombre : valeurs) {
            somme += nombre;
        }

        System.out.println("La somme des valeurs vaut : " + somme);

        // Affichage de la somme des valeurs au carré
        System.out.println("La somme au carré vaut : " + Math.pow(somme, 2));

        // Affichage des valeurs paires
        System.out.print("Les valeurs paires sont : ");

        for (float nombre : valeurs) {
            if (nombre % 2 == 0) {
                System.out.print(nombre + ", ");
            }
        }

        System.out.println();

        // Affichage du produit (des valeurs non-nulles)
        float produit = 1;

        for (float nombre : valeurs) {
            if (nombre != 0) {
                produit *= nombre;
            }
        }

        System.out.println("Le produit des valeurs non-nulles est : " + produit);

        // Fin du programme
        System.out.println("Au revoir !");
        clavier.close();
    }
}
