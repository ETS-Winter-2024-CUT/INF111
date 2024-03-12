package Revision_Exams.Intra_2.Exercice_1.graphiques;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 * La classe Dessin représente un ensemble de figures graphiques à dessiner.
 */
public class Dessin {
    private final String nom;
    private ArrayList<FigureGraphique> listeFigures = new ArrayList<>();

    /**
     * Constructeur pour initialiser un dessin avec un nom et une liste de figures.
     *
     * @param nom          Le nom du dessin
     * @param listeFigures La liste des figures à dessiner
     */
    Dessin(String nom, ArrayList<FigureGraphique> listeFigures) {
        this.nom = nom;
        this.listeFigures = listeFigures;
    }

    /**
     * Constructeur pour initialiser un dessin avec un nom et une liste de figures vide.
     *
     * @param nom Le nom du dessin
     */
    Dessin(String nom) {
        this(nom, new ArrayList<>());
    }

    /**
     * Ajoute une figure à la liste des figures du dessin.
     *
     * @param figure La figure à ajouter
     */
    public void ajouterFigure(FigureGraphique figure) {
        this.listeFigures.add(figure);
    }

    /**
     * Dessine toutes les figures du dessin en utilisant le contexte graphique spécifié.
     *
     * @param g Le contexte graphique où dessiner les figures
     */
    public void dessine(Graphics g) {
        for (FigureGraphique figure : listeFigures) {
            figure.dessine(g);
        }
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères du dessin.
     *
     * @return Le nom du dessin
     */
    public String toString() {
        return this.nom;
    }
}
