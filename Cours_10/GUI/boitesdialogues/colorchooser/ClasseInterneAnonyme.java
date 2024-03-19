package boitesdialogues.colorchooser;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/*
 * Cette exemple montre l'utilisation d'une classe interne anonyme (comme
 * écouteur d'événement d'action).
 */
public class ClasseInterneAnonyme extends JFrame {
	public ClasseInterneAnonyme() {

		JMenuBar mb = new JMenuBar();
		JMenu mFichier = new JMenu("Fichier");
		JMenuItem miCouleurFond = new JMenuItem("Couleur de fond");
		mFichier.add(miCouleurFond);

		miCouleurFond.addActionListener(
				// Classe interne anonyme :
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Color coul = JColorChooser.showDialog(
								ClasseInterneAnonyme.this,
								"Choisir Couleur de Fond", Color.red);
						if (coul != null)
							ClasseInterneAnonyme.this.getContentPane()
									.setBackground(coul);
					}
				});

		mb.add(mFichier);

		this.setTitle("Exemple de JColorChooser");
		this.setJMenuBar(mb);
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ClasseInterneAnonyme().setVisible(true);
			}
		});
	}
}
