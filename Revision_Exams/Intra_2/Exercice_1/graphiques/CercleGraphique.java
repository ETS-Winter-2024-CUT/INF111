package Revision_Exams.Intra_2.Exercice_1.graphiques;

import java.awt.Color;
import java.awt.Graphics;

import Revision_Exams.Intra_2.Exercice_1.composants.Cercle;

/**
 * Represente l'objet graphique Cercle
 */
public class CercleGraphique {
	private Cercle cercle;
	private Color couleur;

	private boolean visible = true;

	public CercleGraphique(Cercle cercle, Color couleur) {
		this.cercle = cercle;
		this.couleur = couleur;
	}

	public CercleGraphique(Cercle cercle) {
		this(cercle, Color.blue);
	}

	public void dessine(Graphics g) {
		int r = (int) cercle.getRayon();
		int xc = (int) cercle.getCentre().getAbscisse();
		int yc = (int) cercle.getCentre().getOrdonnee();

		g.setColor(couleur);
		g.drawOval(xc - r, yc - r, 2 * r, 2 * r);

		/*
		 * g.fillOval( (int)(cercle.getCentre().getAbscisse()-cercle.getRayon()),
		 * (int)(cercle.getCentre().getOrdonnee()-cercle.getRayon()),
		 * (int)(2*cercle.getRayon()),
		 * (int)(2*cercle.getRayon()));
		 */
		// System.out.println("coucou");

	}

}
