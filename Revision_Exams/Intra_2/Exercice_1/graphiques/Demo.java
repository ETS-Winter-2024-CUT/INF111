/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Revision_Exams.Intra_2.Exercice_1.graphiques;

import java.awt.Color;
import javax.swing.JFrame;

import Revision_Exams.Intra_2.Exercice_1.composants.Cercle;
import Revision_Exams.Intra_2.Exercice_1.composants.Rectangle;

/**
 *
 * @author Usager
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JFrame fen = new JFrame("Graphismes");
        PanneauDeDessin panneau = new PanneauDeDessin();
        panneau.setBackground(new Color(1.0f, 1.0f, 0.9f, 1.0f));

        Dessin unDessin = new Dessin("Un dessin");

        Cercle unCercle = new Cercle(new Point(300, 200), 50);
        CercleGraphique gCercle = new CercleGraphique(unCercle, Color.RED);
        unDessin.ajouterFigure(gCercle);

        Rectangle unRectangle = new Rectangle(100.0f, 50.0f);
        RectangleGraphique gRectangle = new RectangleGraphique(unRectangle, Color.BLUE);
        unDessin.ajouterFigure(gRectangle);

        panneau.setDessin(unDessin);

        fen.add(panneau);

        fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fen.setSize(500, 500);
        fen.setLocation(200, 200);
        fen.setVisible(true);
    }
}
