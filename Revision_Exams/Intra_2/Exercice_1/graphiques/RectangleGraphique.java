package Revision_Exams.Intra_2.Exercice_1.graphiques;

import java.awt.Color;
import java.awt.Graphics;

import Revision_Exams.Intra_2.Exercice_1.composants.Rectangle;

/**
 * La classe RectangleGraphique représente graphiquement un rectangle dans un plan cartésien.
 */
public class RectangleGraphique extends FigureGraphique {
    private Rectangle rectangle;

    private boolean visible = true;

    /**
     * Constructeur pour initialiser un RectangleGraphique avec un rectangle et une couleur.
     * 
     * @param rectangle Le rectangle à représenter graphiquement
     * @param couleur   La couleur du rectangle
     */
    public RectangleGraphique(Rectangle rectangle, Color couleur) {
        super(couleur);
        this.rectangle = rectangle;
    }

    /**
     * Constructeur pour initialiser un RectangleGraphique avec un rectangle 
     * et une couleur par défaut (rouge).
     * 
     * @param rectangle Le rectangle à représenter graphiquement
     */
    public RectangleGraphique(Rectangle rectangle) {
        this(rectangle, Color.RED);
    }

    /**
     * Méthode pour dessiner le rectangle graphiquement sur un contexte graphique donné.
     * 
     * @param g Le contexte graphique où dessiner le rectangle
     */
    public void dessine(Graphics g) {
        if (!visible)
            return;

        int x = (int) rectangle.getOrigine().getAbscisse();
        int y = (int) rectangle.getOrigine().getOrdonnee();

        g.setColor(getCouleur());
        g.drawRect(x, y, (int) rectangle.getLongueur(), (int) rectangle.getLargeur());
    }
}
