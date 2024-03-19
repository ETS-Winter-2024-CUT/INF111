package composants;

// Fichier : \Exemples\swing\JTextField1.java

import java.awt.*; //pour les gestionnaires de mise en disposition (layouts).
import javax.swing.*; //pour les composants swing

public class JTextField1 extends JFrame
{
	public static void main(String args[])
	{
		JFrame f = new JTextField1();
		f.setTitle("JTextField 1");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	public JTextField1()
	{
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel lNom = new JLabel("Nom :");
		JTextField c = new JTextField(20);//"Entrez votre nom ici");

		p.add(lNom);
		p.add(c);
		this.add(p,BorderLayout.NORTH);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setLocation(200,200);
		setVisible(true);
	}
}
