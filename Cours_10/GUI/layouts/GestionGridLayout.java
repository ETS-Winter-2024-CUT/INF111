package layouts;


import java.awt.*;
import javax.swing.*;

public class GestionGridLayout
{
	public static void main(String args[])
	{
		JButton boutons[] = new JButton[10];
		for (int i=0;i<boutons.length;i++)
			boutons[i] = new JButton("bouton "+i);

		JFrame fen = new JFrame("GridLayout");

		//Container coucheContenu = F.getContentPane();
		fen.setLayout(new GridLayout(4,3));//,20,10));//,10,20));

		int nbComposants = 9;
		JPanel p;
		for (int i=0;i<nbComposants;i++) {
			/*            p = new JPanel();
            p.setBorder(BorderFactory.createLineBorder(Color.yellow));
            if (i%2==0)
                p.setBackground(Color.yellow);
            else
                p.setBackground(Color.blue);

            p.add(boutons[i]);*/
			fen.add(boutons[i]);
		}

		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fen.setSize(200,100);
		fen.setVisible(true);

	}

}
