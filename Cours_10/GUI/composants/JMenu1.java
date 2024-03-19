package composants;

// Fichier : \Exemples\swing\JMenu1.java
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

//import java.awt.*; //pour les gestionnaires de mise en disposition (layouts).
//import javax.swing.*; //pour les composants swing
public class JMenu1 extends JFrame {

    public static void main(String args[]) {
        JFrame f = new JMenu1();
    }

    public JMenu1() {
        JMenuBar mb = new JMenuBar();
        JMenu mFichier = new JMenu("Fichier");

        JMenuItem miOuvrir = new JMenuItem("Ouvrir");
        JMenuItem miFermer = new JMenuItem("Fermer");
        JMenuItem miQuitter = new JMenuItem("Quitter");

        mFichier.add(miOuvrir);
        mFichier.add(miFermer);
        mFichier.addSeparator();
        mFichier.add(miQuitter);

        JMenu mOutils = new JMenu("Outils");
        mOutils.add(new JMenuItem("Orthographe..."));
        mOutils.add(new JMenuItem("Preferences..."));

        mb.add(mFichier);
        mb.add(mOutils);

        this.setJMenuBar(mb);

        this.setTitle("JMenu 1");
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocation(200, 200);
        setVisible(true);
        
    }
}
