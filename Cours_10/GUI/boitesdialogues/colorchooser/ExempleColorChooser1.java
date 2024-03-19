package boitesdialogues.colorchooser;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ExempleColorChooser1 implements ActionListener
{
	private JFrame f;

	public static void main(String args[])
	{
		ExempleColorChooser1 c = new ExempleColorChooser1();
	}
	public ExempleColorChooser1()
	{ 
		JMenuBar mb = new JMenuBar();
		JMenu mFichier = new JMenu("Fichier");
		JMenuItem mCouleurFond = new JMenuItem("Couleur de fond");
		mFichier.add(mCouleurFond);
		f = new JFrame("Exemple de JColorChooser");
		mCouleurFond.addActionListener(this);

		mb.add(mFichier);
		f.setJMenuBar(mb);
		f.setSize(500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		//JColorChooser jcc = new JColorChooser();
		Color coul = JColorChooser.showDialog(f,"Couleur de fond",f.getContentPane().getBackground());
		if (coul != null)
			f.getContentPane().setBackground(coul);
	}   
}