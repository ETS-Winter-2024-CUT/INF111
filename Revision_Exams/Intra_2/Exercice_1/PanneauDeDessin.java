package Revision_Exams.Intra_2.Exercice_1;

import java.awt.Graphics;

import javax.swing.JPanel;

public class PanneauDeDessin extends JPanel {
    private final Dessin dessin;

    PanneauDeDessin(Dessin dessin) {
        this.dessin = dessin;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        dessin.dessine();
    }
}
