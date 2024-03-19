package composants;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JTextArea1 extends JFrame
{
      public static void main(String args[])
	   {
		JFrame f = new JTextArea1();
		f.setTitle("JTextArea 1");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	   }

      public JTextArea1()
	   {
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.CENTER));
		JTextArea c = new JTextArea("Insérer ici votre commentaire",5,20);

		//p.add(c);
		//ou (avec barres de défilement):
		p.add(new JScrollPane(c));
		this.add(p,BorderLayout.NORTH);

		setSize(400,400);
		setLocation(200,200);
		setVisible(true);
	   }
}
