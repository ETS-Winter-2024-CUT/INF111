package boitesdialogues.filechooser;

// Fichier : FileChooser1.java
//import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
//import javax.swing.border.*;

public class FileChooser1 implements ActionListener {

    public FileChooser1() {
        JMenuBar mb = new JMenuBar();
        JMenu mFichier = new JMenu("Fichier");
        JMenuItem mOuvrir = new JMenuItem("Ouvrir");
        mFichier.add(mOuvrir);
        final JFrame f = new JFrame("Exemple de JFileChooser");
        mOuvrir.addActionListener(this);

        JMenu mOutils = new JMenu("Outils");

        mOutils.add(new JMenuItem("Orthographe..."));
        mOutils.add(new JMenuItem("Preferences..."));
        mb.add(mFichier);
        mb.add(mOutils);
        f.setJMenuBar(mb);
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new FileChooser1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                int returnVal = chooser.showOpenDialog(null);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File f = chooser.getSelectedFile();
                    System.out.println("Vous avez sélectionné le fichier : "
                            + f.getName() + " situe dans le repertoire " + f.getParent()
                            + "\nLe chemin complet est " + f.getPath());
                }
    }
}
