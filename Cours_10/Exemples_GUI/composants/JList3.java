package composants;

// Fichier : \Exemples\swing\JList1.java

import java.awt.*; //pour les gestionnaires de mise en disposition (layouts).
import javax.swing.*; //pour les composants swing
import java.util.*;

public class JList3 extends JFrame
{
	  static String[] couleurs = {"Rouge","Jaune","Vert","Bleu","Marron"};
	  static String[] sports = {"Soccer","Hockey","Base-ball"};
	  static JList c;

      public static void main(String args[])
	   {
		JFrame f = new JList3();
		f.setTitle("JList 3");
		f.setVisible(true);
		int a = 0;
		while (a<5)
		{
			try
			{
				Thread.sleep(1000);
				if (a%2==0)
				{
					couleurs[0] = "Gris";
				}
				else
				{
					couleurs[0] = "Rouge";
				}
				a++;
				c.repaint();
			}
			catch (InterruptedException e)
			{
			}
		}
		//Arrays.sort(couleurs);
		c.setListData(sports);
	   }

      public JList3()
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
