/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Revision_Exams.Intra_2.Exercice_1.graphiques;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Usager
 */
public class PanneauDeDessin extends JPanel {

    // Représente un cercle avec ces données graphiques (pour le dessin)
    private Dessin dessin;

    public void setDessin(Dessin dessin) {
        this.dessin = dessin;
    }

    public Dessin getDessin() {
        return this.dessin;
    }

    /**
     * Méthode appelée pour faire l'affichage graphique (le dessin) du paneau
     *
     */
    @Override
    public void paintComponent(Graphics g) {
        // Appel de paint() de la classe mère, nécessaire pour dessiner le panneau.
        super.paintComponent(g);
        dessin.dessine(g);
    }
}
