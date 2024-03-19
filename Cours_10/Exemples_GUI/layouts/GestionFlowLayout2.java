package layouts;


import java.awt.*;
import javax.swing.*;

public class GestionFlowLayout2
{
	public static void main(String args[])
	{
		JButton boutons[] = new JButton[10];
		for (int i=0;i<boutons.length;i++)
			boutons[i] = new JButton("bouton "+(i+1));

		JFrame F = new JFrame("FlowLayout : alignement et espacement");

		Container coucheContenu = F.getContentPane();
		coucheContenu.setLayout(new FlowLayout(FlowLayout.RIGHT,40,10));

		int nbComposants = 5;
		for (int i=0;i<nbComposants;i++)
			coucheContenu.add(boutons[i]);

		F.setSize(200,100);
		F.setVisible(true);
	}

}
