package evenements;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class EvenementsFenetre extends JFrame implements WindowListener {
	public EvenementsFenetre() {
		Container c = getContentPane();
		c.add(new JLabel(
				"jouer avec les événements de fenétre et constater les messages qui s\'affichent dans la console"));
		this.addWindowListener(this);

		setSize(400, 400);
		setTitle("Evenements de fenetre");
		setVisible(true);
	}

	public static void main(String s[]) {
		EvenementsFenetre fen = new EvenementsFenetre();
	}

	// appelée lorsqu'on ferme la fenetre en utilisant le menu systéme de
	// la fenetre (clic sur le x sous Windows):
	public void windowClosing(WindowEvent e) {
		System.out.println("window closing.");
	}

	public void windowOpened(WindowEvent e) {
		System.out.println("window opened.");
	}

	public void windowIconified(WindowEvent e) {
		System.out.println("window iconified.");
	}

	public void windowDeiconified(WindowEvent e) {
		System.out.println("window deiconified.");
	}

	// appelée lorsqu'on ferme la fenetre en utilisant sa méthode dispose() :
	public void windowClosed(WindowEvent e) {
		System.out.println("window closed.");
	}

	public void windowActivated(WindowEvent e) {
		System.out.println("window activated.");
	}

	public void windowDeactivated(WindowEvent e) {
		// JFrame jc = (JFrame)e.getSource();
		// System.out.println("événement de fenetre sur un composant de
		// "+jc.getClass());
		System.out.println("window deactivated.");
	}
}
