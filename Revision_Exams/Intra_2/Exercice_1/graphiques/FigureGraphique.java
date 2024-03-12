package Revision_Exams.Intra_2.Exercice_1.graphiques;

import java.awt.Color;
import java.awt.Graphics;

/**
 * La classe FigureGraphique est une classe abstraite représentant une figure graphique.
 */
public abstract class FigureGraphique {
    private final Color couleur; // La couleur de la figure

    /**
     * Constructeur pour initialiser une figure graphique avec une couleur.
     * 
     * @param couleur La couleur de la figure
     */
    FigureGraphique(Color couleur) {
        this.couleur = couleur;
    }

    /**
     * Méthode abstraite pour dessiner la figure graphique.
     * 
     * @param g Le contexte graphique où dessiner la figure
     */
    public abstract void dessine(Graphics g);

    /**
     * Obtient la couleur de la figure.
     * 
     * @return La couleur de la figure
     */
    public Color getCouleur() {
        return this.couleur;
    }
}
