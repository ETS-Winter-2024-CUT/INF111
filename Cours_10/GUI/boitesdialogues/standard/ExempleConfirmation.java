package boitesdialogues.standard;

// Fichier : \Exemples\swing\JMenu1.java
import java.awt.*; //pour les gestionnaires de mise en disposition (layouts).
import java.awt.event.*;
import javax.swing.*; //pour les composants swing

public class ExempleConfirmation {

    public static void main(String args[]) {
        JFrame f = new Fenetre();
        f.setTitle("Boites de dialogue");
        f.setVisible(true);
    }
}

class Fenetre extends JFrame implements ActionListener {

    JMenuItem miQuitter;

    public Fenetre() {
        JMenuBar mb = new JMenuBar();
        JMenu mFichier = new JMenu("Fichier");

        miQuitter = new JMenuItem("Quitter");

        mFichier.add(miQuitter);
        miQuitter.addActionListener(this);

        mb.add(mFichier);
        setJMenuBar(mb);

        setSize(400, 400);
        setLocation(200, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent evt) {
        JComponent jc = (JComponent) evt.getSource();
        if (jc == miQuitter) {
            int reponse = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment quitter?", "Confirmation", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
            if (reponse == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }
}
