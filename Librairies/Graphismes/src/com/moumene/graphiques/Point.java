//Fichier : Point.java
package Librairies.Graphismes.src.com.moumene.graphiques;

public class Point {
	private double abscisse, ordonnee;

	public Point() {
		abscisse = 0;
		ordonnee = 0;
	}

	public Point(double a, double o) {
		abscisse = a;
		ordonnee = o;
	}

	public Point(double a) {
		abscisse = a;
		ordonnee = 0;
	}

	public double getAbscisse() {
		return abscisse;
	}

	public double getOrdonnee() {
		return ordonnee;
	}

	public void print() {
		System.out.print("(" + abscisse + "," + ordonnee + ")");
	}

	public void setAbscisse(double newAbs) {
		abscisse = newAbs;
	}

	public void setOrdonnee(double newOrd) {
		ordonnee = newOrd;
	}

	public double distanceDe(Point p) {
		double x = this.getAbscisse(),
				xp = p.getAbscisse(),
				y = this.getOrdonnee(),
				yp = p.getOrdonnee();
		return Math.sqrt(Math.pow(x - xp, 2) + Math.pow(y - yp, 2));
		// ou : return Math.hypot(this.getAbscisse() - p.getAbscisse(),
		// this.getOrdonnee() - p.getOrdonnee());
	}

	public boolean equals(Object p) {
		if (p == null)
			return false;

		if (this == p)
			return true;

		if (!(p instanceof Point))
			return false;

		Point temp = (Point) p;
		return (abscisse == temp.abscisse && ordonnee == temp.ordonnee);
	}

	public String toString() {
		return "(" + abscisse + "," + ordonnee + ")";
	}
}
