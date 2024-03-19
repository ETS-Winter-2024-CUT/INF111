package composants;

// Fichier : \Exemples\swing\JLabel1.java

import java.awt.*; //pour les gestionnaires de mise en disposition (layouts).
import javax.swing.*; //pour les composants swing

public class JLabel1 extends JFrame
{
      public static void main(String args[])
	   {
		JFrame f = new JLabel1();
		f.setTitle("JLabel 1");
		f.setVisible(true);
	   }

      public JLabel1()
	   {
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JLabel c=new JLabel("Nom :",JLabel.LEFT);
		
		p.add(c);
		//p.add(new JTextField(15));
		this.add(p,BorderLayout.NORTH);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setSize(400,400);
		setLocation(200,200);
		setVisible(true);
	   }
}
