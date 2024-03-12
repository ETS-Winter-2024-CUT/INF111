package Revision_Exams.Intra_2.Exercice_1.graphiques;

import java.awt.Graphics;
import java.util.ArrayList;

public class Dessin {
    private final String nom;
    private ArrayList<FigureGraphique> listeFigures = new ArrayList<>();

    Dessin(String nom, ArrayList<FigureGraphique> listeFigures) {
        this.nom = nom;
        this.listeFigures = listeFigures;
    }

    Dessin(String nom) {
        this(nom, new ArrayList<>());
    }

    public void ajouterFigure(FigureGraphique figure) {
        this.listeFigures.add(figure);
    }

    public void dessine(Graphics g) {
        for (FigureGraphique figure : listeFigures) {
            figure.dessine(g);
        }
    }

    public String toString() {
        return this.nom;
    }
}
