package Revision_Exams.Intra_2.Exercice_4;

import java.util.ArrayList;

public class Etudiant {
    private static final int NB_MAX_EXAMENS = 6;

    private String codePermanent;
    private String nom;
    private String courriel;
    private ArrayList<Examen> examens;
    private int nombreExamens;

    public Etudiant(String codePermanent, String nom, String courriel) {
        this.codePermanent = codePermanent;
        this.nom = nom;
        this.courriel = courriel;
        this.nombreExamens = 0;
        this.examens = new ArrayList<>(NB_MAX_EXAMENS);
    }

    public Etudiant(String codePermanent, String nom) {
        this(codePermanent, nom, null);
    }

    public String getCodePermanent() {
        return codePermanent;
    }

    public String getNom() {
        return nom;
    }

    public String getCourriel() {
        return courriel;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    public ArrayList<Examen> getExamens() {
        return examens;
    }

    public int getNombreExamens() {
        return nombreExamens;
    }

    public boolean ajouterExamen(Examen examen) {
        if (examens.size() >= NB_MAX_EXAMENS)
            return false;

        examens.add(examen);
        return true;
    }

    public double calculMoyenne(String sigle) {
        double moyenne = 0;

        for (Examen examen : examens)
            if (examen.sigleCours().equals(sigle))
                moyenne += examen.getNote() * examen.getPonderation();

        moyenne /= (double) examens.size();

        return moyenne;
    }

    public void afficheBulletin(String sigle) {
        System.out.println(this.toString());

        for (Examen examen : examens)
            if (examen.sigleCours().equals(sigle))
                System.out.printf("%s - %.2f - %s - %s - %.2f\n",
                        examen.getCours(), examen.getNote(), examen.getTypeExamen(),
                        examen.getDateExamen(), examen.getPonderation());

        System.out.println(calculMoyenne(sigle));
    }

    @Override
    public String toString() {
        return String.format("Etudiant %s: [code: %s, courriel: %s, nombre examens: %d]",
                nom, codePermanent, courriel, nombreExamens);
    }
}
