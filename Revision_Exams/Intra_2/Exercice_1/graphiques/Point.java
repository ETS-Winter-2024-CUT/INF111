package Revision_Exams.Intra_2.Exercice_1.graphiques;

/**
 * La classe Point représente un point dans un plan cartésien.
 */
public class Point {
	private double abscisse; // L'abscisse du point
	private double ordonnee; // L'ordonnée du point

	/**
	 * Constructeur par défaut qui initialise un point à l'origine.
	 */
	public Point() {
		abscisse = 0;
		ordonnee = 0;
	}

	/**
	 * Constructeur pour initialiser un point avec des coordonnées spécifiques.
	 * 
	 * @param a L'abscisse du point
	 * @param o L'ordonnée du point
	 */
	public Point(double a, double o) {
		abscisse = a;
		ordonnee = o;
	}

	/**
	 * Constructeur pour initialiser un point avec une abscisse spécifique et une ordonnée à 0.
	 * 
	 * @param a L'abscisse du point
	 */
	public Point(double a) {
		abscisse = a;
		ordonnee = 0;
	}

	/**
	 * Obtient l'abscisse du point.
	 * 
	 * @return L'abscisse du point
	 */
	public double getAbscisse() {
		return abscisse;
	}

	/**
	 * Obtient l'ordonnée du point.
	 * 
	 * @return L'ordonnée du point
	 */
	public double getOrdonnee() {
		return ordonnee;
	}

	/**
	 * Affiche les coordonnées du point.
	 */
	public void print() {
		System.out.print("(" + abscisse + "," + ordonnee + ")");
	}

	/**
	 * Définit une nouvelle valeur pour l'abscisse du point.
	 * 
	 * @param newAbs La nouvelle valeur de l'abscisse
	 */
	public void setAbscisse(double newAbs) {
		abscisse = newAbs;
	}

	/**
	 * Définit une nouvelle valeur pour l'ordonnée du point.
	 * 
	 * @param newOrd La nouvelle valeur de l'ordonnée
	 */
	public void setOrdonnee(double newOrd) {
		ordonnee = newOrd;
	}

	/**
	 * Calcule la distance entre ce point et un autre point spécifié.
	 * 
	 * @param p Le point à mesurer la distance
	 * @return La distance entre ce point et le point spécifié
	 */
	public double distanceDe(Point p) {
		double x = this.getAbscisse();
		double xp = p.getAbscisse();
		double y = this.getOrdonnee();
		double yp = p.getOrdonnee();
		return Math.sqrt(Math.pow(x - xp, 2) + Math.pow(y - yp, 2));
	}

	/**
	 * Compare ce point à un autre objet et vérifie s'ils sont égaux.
	 * 
	 * @param p L'objet à comparer
	 * @return true si les deux objets sont égaux, sinon false
	 */
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

	/**
	 * Retourne une représentation sous forme de chaîne de caractères du point.
	 * 
	 * @return Une chaîne de caractères représentant le point
	 */
	public String toString() {
		return "(" + abscisse + "," + ordonnee + ")";
	}
}
