package Revision_Exams.Intra_2.Exercice_1.graphiques;

import java.awt.Color;
import java.awt.Graphics;

import Revision_Exams.Intra_2.Exercice_1.composants.Cercle;

/**
 * Represente l'objet graphique Cercle
 */
public class CercleGraphique extends FigureGraphique {
	private Cercle cercle;

	private boolean visible = true;

	public CercleGraphique(Cercle cercle, Color couleur) {
		super(couleur);
		this.cercle = cercle;
	}

	public CercleGraphique(Cercle cercle) {
		this(cercle, Color.blue);
	}

	public void dessine(Graphics g) {
		if (!visible)
			return;

		int r = (int) cercle.getRayon();
		int xc = (int) cercle.getCentre().getAbscisse();
		int yc = (int) cercle.getCentre().getOrdonnee();

		g.setColor(getCouleur());
		g.drawOval(xc - r, yc - r, 2 * r, 2 * r);
	}
}
