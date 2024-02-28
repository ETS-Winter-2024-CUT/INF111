package Cours_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Ce programme permet à l'utilisateur d'entrer une série de nombres,
 * puis affiche le maximum de ces nombres.
 */
public class Exercice_3_MaximumSerieNombres {
    /**
     * Méthode principale du programme.
     * Demande à l'utilisateur d'entrer une série de nombres, puis affiche le maximum de ces nombres
     * @param args Les arguments de la ligne de commande (non utilisés dans ce programme)
     */
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

        // Affichage du maximum
        if (valeurs.isEmpty()) {
            System.out.println("Aucune valeur entrée.");
        } else {
            float extremum = valeurs.get(0);

            for (int i = 0; i < valeurs.size(); i++) {
                float nouvelleValeur = valeurs.get(i);

                if (nouvelleValeur > extremum) {
                    extremum = nouvelleValeur;
                }
            }

            System.out.println("Le maximum est : " + extremum);
        }

        // Fin du programme
        System.out.println("Au revoir !");
        clavier.close();
    }
}
