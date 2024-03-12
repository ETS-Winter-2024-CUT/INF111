package Librairies.Graphismes.src.com.moumene.composants;

import Librairies.Graphismes.src.com.moumene.graphiques.Point;

/**
 * Représente un objet Cercle avec les données du cercle
 */
public class Cercle {
	private Point centre;
	private double rayon;
	private boolean visible = true;

	public Cercle(Point c) {
		centre = c;
		rayon = 10;
	}

	public Cercle(Point c, double r) {
		centre = c;
		rayon = r;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public double getSurface() {
		return Math.PI * Math.pow(rayon, 2);
	}

	public Point getCentre() {
		return centre;
	}

	public double getRayon() {
		return rayon;
	}

	public void setCentre(Point centre) {
		this.centre = centre;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	public boolean contient(Point p) {
		return (centre.distanceDe(p) <= rayon);
	}

	public String toString() {
		return "[" + centre + ";" + rayon + "]";
	}
}
