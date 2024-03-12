package Revision_Exams.Intra_2.Exercice_1.graphiques;

import java.util.ArrayList;

public class Dessin {
    private final String nom;
    private ArrayList<FigureGraphique> listeFigures = new ArrayList<>();

    Dessin(String nom, ArrayList<FigureGraphique> listeFigures) {
        this.nom = nom;
        this.listeFigures = listeFigures;
    }

    public void ajouterFigure(FigureGraphique figure) {
        this.listeFigures.add(figure);
    }

    public void dessine() {

    }
}
