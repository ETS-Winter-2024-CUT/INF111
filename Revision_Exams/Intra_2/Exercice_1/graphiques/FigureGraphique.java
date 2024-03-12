package Revision_Exams.Intra_2.Exercice_1.graphiques;

import java.awt.Color;
import java.awt.Graphics;

public abstract class FigureGraphique {
    private final Color couleur;

    FigureGraphique(Color couleur) {
        this.couleur = couleur;
    }

    public abstract void dessine(Graphics g);

    public Color getCouleur() {
        return this.couleur;
    }
}
