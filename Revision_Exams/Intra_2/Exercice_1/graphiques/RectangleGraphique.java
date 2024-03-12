package Revision_Exams.Intra_2.Exercice_1.graphiques;

import java.awt.Color;
import java.awt.Graphics;

import Revision_Exams.Intra_2.Exercice_1.composants.Rectangle;

public class RectangleGraphique extends FigureGraphique {
    private Rectangle rectangle;

    private boolean visible = true;

    public RectangleGraphique(Rectangle rectangle, Color couleur) {
        super(couleur);
        this.rectangle = rectangle;
    }

    public RectangleGraphique(Rectangle rectangle) {
        this(rectangle, Color.RED);
    }

    public void dessine(Graphics g) {
        if (!visible)
            return;

        g.setColor(getCouleur());
        g.drawRect(0, 0, (int) rectangle.getLongueur(), (int) rectangle.getLargeur());
    }
}
