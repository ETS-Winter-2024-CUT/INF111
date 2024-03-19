package layouts;


import java.awt.*;
import javax.swing.*;

public class GestionFlowLayout
{
	public static void main(String args[])
	{
		JButton boutons[] = new JButton[10];
		for (int i=0;i<boutons.length;i++)
			boutons[i] = new JButton("bouton "+(i+1));

		JFrame fen = new JFrame("FlowLayout");

		//Container coucheContenu = F.getContentPane();
		fen.setLayout(new FlowLayout(FlowLayout.LEFT));

		int nbComposants = 10;
		for (int i=0;i<nbComposants;i++)
			fen.add(boutons[i]);

		fen.setSize(500,400);
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fen.setVisible(true);
	}
}
