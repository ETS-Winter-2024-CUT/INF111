package Revision_Exams.Intra_2;

/**
 * Cette classe représente un cours universitaire avec un sigle, un nombre de crédits
 * et une indication sur sa présence au programme.
 */
public class Exercice_4_Cours {
    private String sigle;
    private int nbCredits;
    private boolean auProgramme;

    /**
     * Constructeur de la classe Exercice_4_Cours avec les paramètres spécifiés.
     *
     * @param sigle       Le sigle du cours.
     * @param nbCredits   Le nombre de crédits du cours.
     * @param auProgramme Indique si le cours est au programme.
     */
    public Exercice_4_Cours(String sigle, int nbCredits, boolean auProgramme) {
        this.sigle = sigle;
        this.nbCredits = nbCredits;
        this.auProgramme = auProgramme;
    }

    /**
     * Constructeur de la classe Exercice_4_Cours avec le sigle spécifié,
     * en utilisant des valeurs par défaut.
     *
     * @param sigle Le sigle du cours.
     */
    public Exercice_4_Cours(String sigle) {
        this(sigle, 3, true);
    }

    /**
     * Méthode permettant d'obtenir le sigle du cours.
     *
     * @return Le sigle du cours.
     */
    public String getSigle() {
        return sigle;
    }

    /**
     * Méthode permettant de définir le nombre de crédits du cours.
     *
     * @param nbCredits Le nombre de crédits à définir.
     */
    public void setNbCredits(int nbCredits) {
        this.nbCredits = nbCredits;
    }

    /**
     * Méthode permettant de définir si le cours est au programme ou non.
     *
     * @param auProgramme Une valeur booléenne indiquant la présence ou non du cours au programme.
     */
    public void setAuProgramme(boolean auProgramme) {
        this.auProgramme = auProgramme;
    }

    /**
     * Méthode permettant de représenter le cours sous forme de chaîne de caractères.
     *
     * @return Une représentation textuelle du cours.
     */
    @Override
    public String toString() {
        return "Sigle: " + sigle + ", Nombre de crédits: " + nbCredits + (auProgramme ? ", est" : ", n'est pas") + " au programme.";
    }
}
