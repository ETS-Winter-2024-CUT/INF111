/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Revision_Exams.Intra_2.Exercice_1.graphiques;

import java.awt.Color;
import javax.swing.JFrame;

import Revision_Exams.Intra_2.Exercice_1.composants.Cercle;

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

        Cercle unCercle = new Cercle(new Point(300, 200), 50);
        CercleGraphique gCercle = new CercleGraphique(unCercle, Color.red);

        panneau.setGCercle(gCercle);

        // JButton bouton = new JButton("OK");
        // pan.add(bouton);
        fen.add(panneau);

        fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fen.setSize(500, 500);
        fen.setLocation(200, 200);
        fen.setVisible(true);

        // Mauvais dessin :
        // Graphics g = bouton.getGraphics();
        // g.drawOval(110,10,50,50);

        // int x, y,r;
        // int cpt=0;
        // int signe = 1;
        // for (int i=0;i<200;i++,cpt++)
        // {
        // r = (int)c.getRayon();
        // r += 3*signe;
        // c.setRayon(r);
        // x = (int)c.getCentre().getAbscisse();
        // y = (int)c.getCentre().getOrdonnee();
        // c.getCentre().setAbscisse(x+1);
        // c.getCentre().setOrdonnee(y+1);
        // pan.repaint();
        // if (cpt==10)
        // {
        // cpt=0;
        // signe *= -1;
        // }
        // try {
        // Thread.sleep(100);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        // }

    }
}
