package Revision_Exams.Intra_2.Exercice_4;

import java.util.Date;

/**
 * Cette classe représente un examen associé à un cours.
 */
public class Examen {
    private TypeExamen typeExamen;
    private double note;
    private Date dateExamen;
    private double ponderation;
    private Cours cours;

    /**
     * Constructeur de la classe Examen avec tous les paramètres spécifiés.
     *
     * @param typeExamen  Le type d'examen.
     * @param note        La note obtenue à l'examen.
     * @param dateExamen  La date de l'examen.
     * @param ponderation La pondération de l'examen.
     * @param cours       Le cours associé à l'examen.
     */
    public Examen(TypeExamen typeExamen, double note, Date dateExamen, double ponderation, Cours cours) {
        this.typeExamen = typeExamen;
        this.note = note;
        this.dateExamen = dateExamen;
        this.ponderation = ponderation;
        this.cours = cours;
    }

    /**
     * Constructeur de la classe Examen avec les paramètres spécifiés (sans note).
     *
     * @param typeExamen  Le type d'examen.
     * @param dateExamen  La date de l'examen.
     * @param ponderation La pondération de l'examen.
     * @param cours       Le cours associé à l'examen.
     */
    public Examen(TypeExamen typeExamen, Date dateExamen, double ponderation, Cours cours) {
        this(typeExamen, -1, dateExamen, ponderation, cours);
    }

    /**
     * Méthode permettant d'obtenir le type d'examen.
     *
     * @return Le type d'examen.
     */
    public TypeExamen getTypeExamen() {
        return typeExamen;
    }

    /**
     * Méthode permettant d'obtenir la note obtenue à l'examen.
     *
     * @return La note obtenue à l'examen.
     */
    public double getNote() {
        return note;
    }

    /**
     * Méthode permettant d'obtenir la date de l'examen.
     *
     * @return La date de l'examen.
     */
    public Date getDateExamen() {
        return dateExamen;
    }

    /**
     * Méthode permettant d'obtenir la pondération de l'examen.
     *
     * @return La pondération de l'examen.
     */
    public double getPonderation() {
        return ponderation;
    }

    /**
     * Méthode permettant d'obtenir le cours associé à l'examen.
     *
     * @return Le cours associé à l'examen.
     */
    public Cours getCours() {
        return cours;
    }

    /**
     * Méthode permettant d'obtenir le sigle du cours associé à l'examen.
     *
     * @return Le sigle du cours associé à l'examen.
     */
    public String sigleCours() {
        return cours.getSigle();
    }
}
