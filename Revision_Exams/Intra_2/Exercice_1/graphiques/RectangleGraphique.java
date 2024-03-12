package Revision_Exams.Intra_2.Exercice_1.graphiques;

import java.awt.Color;
import java.awt.Graphics;

public class RectangleGraphique {
    private Color couleur;
    private double largeur;
    private double longueur;

    public RectangleGraphique(double longueur, double largeur, Color couleur) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.couleur = couleur;
    }

    public RectangleGraphique(double longueur) {
        this(longueur, longueur, Color.RED);
    }

    public RectangleGraphique(double longueur, Color couleur) {
        this(longueur, longueur, couleur);
    }

    public RectangleGraphique(double longueur, double largeur) {
        this(longueur, largeur, Color.RED);
    }

    public void dessine(Graphics g) {
        g.setColor(couleur);
        g.drawRect(0, 0, (int) largeur, (int) longueur);
    }
}
