package layouts;


import java.awt.*;
import javax.swing.*;

public class GestionBorderLayout
{
	public static void main(String args[])
	{
		JButton boutons[] = new JButton[10];
		for (int i=0;i<boutons.length;i++)
			boutons[i] = new JButton("bouton "+(i+1));

		JFrame fen = new JFrame("BorderLayout");

		//BorderLayout est le gestionnaire par défaut d'un JFrame et d'un Frame

		//Container coucheContenu = F.getContentPane();
		/*
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.LEFT));
		p.add(boutons[0]);
		p.add(boutons[5]);
		coucheContenu.add(p,BorderLayout.NORTH);
		*/
		fen.add(boutons[0],BorderLayout.NORTH);
		fen.add(boutons[1],BorderLayout.SOUTH);
		fen.add(boutons[2],BorderLayout.EAST);
		fen.add(boutons[3],BorderLayout.WEST);
		fen.add(boutons[4],BorderLayout.CENTER);
		fen.add(boutons[5],BorderLayout.NORTH);//cache le bouton
		//actuellement au NORTH.
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fen.setSize(200,100);
		fen.setVisible(true);
	}

}
