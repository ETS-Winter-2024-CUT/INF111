package Revision_Exams.Intra_2.Exercice_1.composants;

import Revision_Exams.Intra_2.Exercice_1.graphiques.Point;

/**
 * La classe Rectangle représente un rectangle dans un plan cartésien.
 */
public class Rectangle {
    private final double longueur;
    private final double largeur;

    private Point origine;
    private boolean visible = true;

    /**
     * Constructeur pour initialiser un rectangle avec un point d'origine,
     * une longueur et une largeur.
     *
     * @param origine  Le point d'origine du rectangle
     * @param longueur La longueur du rectangle
     * @param largeur  La largeur du rectangle
     */
    public Rectangle(Point origine, double longueur, double largeur) {
        this.origine = origine;
        this.longueur = longueur;
        this.largeur = largeur;
    }

    /**
     * Constructeur pour initialiser un carré avec un point d'origine et une longueur.
     * La largeur sera la même que la longueur.
     *
     * @param origine  Le point d'origine du rectangle
     * @param longueur La longueur du rectangle (et la largeur)
     */
    public Rectangle(Point origine, double longueur) {
        this(origine, longueur, longueur);
    }

    /**
     * Vérifie si le rectangle est visible.
     *
     * @return true si le rectangle est visible, sinon false
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * Définit la visibilité du rectangle.
     *
     * @param visible true pour rendre le rectangle visible, sinon false
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    /**
     * Obtient la largeur du rectangle.
     *
     * @return La largeur du rectangle
     */
    public double getLargeur() {
        return this.largeur;
    }

    /**
     * Obtient la longueur du rectangle.
     *
     * @return La longueur du rectangle
     */
    public double getLongueur() {
        return this.longueur;
    }

    /**
     * Calcule et obtient la surface du rectangle.
     *
     * @return La surface du rectangle
     */
    public double getSurface() {
        return largeur * longueur;
    }

    /**
     * Obtient le point d'origine du rectangle.
     *
     * @return Le point d'origine du rectangle
     */
    public Point getOrigine() {
        return origine;
    }

    /**
     * Définit le point d'origine du rectangle.
     *
     * @param origine Le nouveau point d'origine du rectangle
     */
    public void setOrigine(Point origine) {
        this.origine = origine;
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères du rectangle.
     *
     * @return Une chaîne de caractères représentant le rectangle
     */
    public String toString() {
        return "[" + longueur + ";" + largeur + "]";
    }
}
