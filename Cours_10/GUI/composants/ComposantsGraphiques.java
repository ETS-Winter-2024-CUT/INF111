package composants;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class ComposantsGraphiques {
	public static void main(String args[]) {
		JFrame f = new JFrame("Les composants");
		Container coucheContenu = f.getContentPane();
		coucheContenu.setLayout(new FlowLayout(FlowLayout.LEFT));

		// Bouton, etiquette, champ de texte et zone de texte :
		JButton b = new JButton("OK");
		JLabel l1 = new JLabel("Nom:", JLabel.LEFT);
		JTextField t1 = new JTextField("Annie");
		JTextArea z1 = new JTextArea("Insérer ici votre commentaire", 3, 20);

		// Case à cocher :
		JCheckBox case1 = new JCheckBox("Je suis membre");

		// Bouton de radio et groupe de boutons de radio :
		ButtonGroup group1 = new ButtonGroup();
		JRadioButton case1gr1 = new JRadioButton("Math", true);
		JRadioButton case2gr1 = new JRadioButton("Physique", false);
		JRadioButton case3gr1 = new JRadioButton("Informatique", false);
		group1.add(case1gr1);
		group1.add(case2gr1);
		group1.add(case3gr1);

		// Boite combinée :
		String[] tranchesAges = { "enfant", "adolescent", "adulte" };
		JComboBox cAge = new JComboBox(tranchesAges);

		// Liste de choix :
		String[] couleurs = { "Rouge", "Jaune", "Vert", "Bleu", "Marron" };
		JList lCouleurs = new JList(couleurs);

		// Menus :
		JMenuBar mb = new JMenuBar();
		JMenu mFichier = new JMenu("Fichier");
		JMenu mOutils = new JMenu("Outils");
		JMenuItem miOrthographe = new JMenuItem("Orthographe...");
		mOutils.add(miOrthographe);
		mOutils.add(new JMenuItem("Preferences..."));
		mb.add(mFichier);
		mb.add(mOutils);
		f.setJMenuBar(mb);

		// Ajout des boutons de radio dans un panneau :
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3, 1));
		p.add(case1gr1);
		p.add(case2gr1);
		p.add(case3gr1);

		// Bordure :
		Border bordure = BorderFactory.createLineBorder(Color.red, 2);
		p.setBorder(bordure);
		z1.setBorder(bordure);

		// Ajout des composants à la (couche de contenu de la) fenetre:
		coucheContenu.add(l1);
		coucheContenu.add(t1);
		coucheContenu.add(case1);
		coucheContenu.add(cAge);
		coucheContenu.add(p);
		coucheContenu.add(new JScrollPane(z1));
		coucheContenu.add(b);
		coucheContenu.add(lCouleurs);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400, 400);
		f.setVisible(true);
	}
}
