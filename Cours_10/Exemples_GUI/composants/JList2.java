package composants;

// Fichier : \Exemples\swing\JList1.java

import java.awt.*; //pour les gestionnaires de mise en disposition (layouts).
import javax.swing.*; //pour les composants swing
import java.util.*;

public class JList2 extends JFrame
{
	  static String[] couleurs = {"Rouge","Jaune","Vert","Bleu","Marron"};
	  static JList c;

      public static void main(String args[])
	   {
		JFrame f = new JList2();
		f.setTitle("JList 2");
		f.setVisible(true);
		int a = 0;
		while (true)
		{
			try
			{
				Thread.sleep(1000);
				if (a==0)
				{
					couleurs[0] = "Gris";
					a=1;
				}
				else
				{
					couleurs[0] = "Rouge";
					a=0;
				}
				c.repaint();
			}
			catch (InterruptedException e)
			{
			}
		}
	   }

      public JList2()
	   {
		Container coucheContenu = getContentPane();

		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		c = new JList(couleurs);

		c.setBackground(Color.yellow);

		p.add(c);

		coucheContenu.add(p,BorderLayout.WEST);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setSize(400,400);
		setLocation(200,200);
		setVisible(true);
	   }
}
