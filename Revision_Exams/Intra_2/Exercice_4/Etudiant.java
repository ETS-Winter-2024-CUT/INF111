package Revision_Exams.Intra_2.Exercice_4;

import java.util.ArrayList;

/**
 * Cette classe représente un étudiant avec son code permanent, nom, courriel
 * et les examens associés.
 */
public class Etudiant {
    private static final int NB_MAX_EXAMENS = 6;

    private String codePermanent;
    private String nom;
    private String courriel;
    private ArrayList<Examen> examens;
    private int nombreExamens;

    /**
     * Constructeur de la classe Etudiant avec les paramètres spécifiés.
     *
     * @param codePermanent Le code permanent de l'étudiant.
     * @param nom           Le nom de l'étudiant.
     * @param courriel      Le courriel de l'étudiant.
     */
    public Etudiant(String codePermanent, String nom, String courriel) {
        this.codePermanent = codePermanent;
        this.nom = nom;
        this.courriel = courriel;
        this.nombreExamens = 0;
        this.examens = new ArrayList<>(NB_MAX_EXAMENS);
    }

    /**
     * Constructeur de la classe Etudiant avec les paramètres spécifiés (sans courriel).
     *
     * @param codePermanent Le code permanent de l'étudiant.
     * @param nom           Le nom de l'étudiant.
     */
    public Etudiant(String codePermanent, String nom) {
        this(codePermanent, nom, null);
    }

    /**
     * Méthode permettant d'obtenir le code permanent de l'étudiant.
     *
     * @return Le code permanent de l'étudiant.
     */
    public String getCodePermanent() {
        return codePermanent;
    }

    /**
     * Méthode permettant d'obtenir le nom de l'étudiant.
     *
     * @return Le nom de l'étudiant.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Méthode permettant d'obtenir le courriel de l'étudiant.
     *
     * @return Le courriel de l'étudiant.
     */
    public String getCourriel() {
        return courriel;
    }

    /**
     * Méthode permettant de définir le courriel de l'étudiant.
     *
     * @param courriel Le courriel à définir.
     */
    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    /**
     * Méthode permettant d'obtenir la liste des examens de l'étudiant.
     *
     * @return La liste des examens de l'étudiant.
     */
    public ArrayList<Examen> getExamens() {
        return examens;
    }

    /**
     * Méthode permettant d'obtenir le nombre d'examens de l'étudiant.
     *
     * @return Le nombre d'examens de l'étudiant.
     */
    public int getNombreExamens() {
        return nombreExamens;
    }

    /**
     * Méthode permettant d'ajouter un examen à la liste des examens de l'étudiant.
     *
     * @param examen L'examen à ajouter.
     * @return true si l'examen a été ajouté avec succès, false sinon.
     */
    public boolean ajouterExamen(Examen examen) {
        if (examens.size() >= NB_MAX_EXAMENS)
            return false;

        examens.add(examen);
        return true;
    }

    /**
     * Méthode permettant de calculer la moyenne des notes pour un cours spécifié.
     *
     * @param sigle Le sigle du cours pour lequel calculer la moyenne.
     * @return La moyenne des notes pour le cours spécifié.
     */
    public double calculMoyenne(String sigle) {
        double moyenne = 0;

        for (Examen examen : examens)
            if (examen.sigleCours().equals(sigle))
                moyenne += examen.getNote() * examen.getPonderation();

        moyenne /= (double) examens.size();

        return moyenne;
    }

    /**
     * Méthode permettant d'afficher le bulletin de l'étudiant pour un cours spécifié.
     *
     * @param sigle Le sigle du cours pour lequel afficher le bulletin.
     */
    public void afficheBulletin(String sigle) {
        System.out.println(this.toString());

        for (Examen examen : examens)
            if (examen.sigleCours().equals(sigle))
                System.out.printf("%s - %.2f - %s - %s - %.2f\n",
                        examen.getCours(), examen.getNote(), examen.getTypeExamen(),
                        examen.getDateExamen(), examen.getPonderation());

        System.out.println(calculMoyenne(sigle));
    }

    /**
     * Méthode permettant d'obtenir une représentation textuelle de l'étudiant.
     *
     * @return Une chaîne de caractères représentant l'étudiant.
     */
    @Override
    public String toString() {
        return String.format("Etudiant %s: [code: %s, courriel: %s, nombre examens: %d]",
                nom, codePermanent, courriel, nombreExamens);
    }
}
