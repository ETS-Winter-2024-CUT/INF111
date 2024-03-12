package Revision_Exams.Intra_2.Exercice_1.composants;

import Revision_Exams.Intra_2.Exercice_1.graphiques.Point;

public class Rectangle {
    private final double longueur;
    private final double largeur;

    private Point origine;
    private boolean visible = true;

    public Rectangle(Point origine, double longueur, double largeur) {
        this.origine = origine;
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Rectangle(Point origine, double longueur) {
        this(origine, longueur, longueur);
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public double getLargeur() {
        return this.largeur;
    }

    public double getLongueur() {
        return this.longueur;
    }

    public double getSurface() {
        return largeur * longueur;
    }

    public Point getOrigine() {
        return origine;
    }

    public void setOrigine(Point origine) {
        this.origine = origine;
    }

    public String toString() {
        return "[" + longueur + ";" + largeur + "]";
    }
}
