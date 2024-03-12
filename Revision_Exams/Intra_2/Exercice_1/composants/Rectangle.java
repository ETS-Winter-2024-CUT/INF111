package Revision_Exams.Intra_2.Exercice_1.composants;

public class Rectangle {
    private final double longueur;
    private final double largeur;
    private boolean visible = true;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    Rectangle(double longueur) {
        this(longueur, longueur);
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

    public String toString() {
        return "[" + longueur + ";" + largeur + "]";
    }
}
