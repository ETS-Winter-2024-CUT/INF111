package composants;

// Fichier : \Exemples\swing\JComboBox1.java

import java.awt.*; //pour les gestionnaires de mise en disposition (layouts).
import javax.swing.*; //pour les composants swing

public class JComboBox1 extends JFrame
{
      public static void main(String args[])
	   {
		JFrame f = new JComboBox1();
		f.setTitle("JComboBox 1");
		f.setVisible(true);
	   }

      public JComboBox1()
	   {
		Container coucheContenu = getContentPane();

		JPanel p = new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        String[] tranchesAges = {"enfant","adolescent","adulte"};
	    JComboBox c = new JComboBox(tranchesAges);
		
		p.add(c);
		coucheContenu.add(p,BorderLayout.NORTH);

		setSize(400,400);
		setLocation(200,200);
		setVisible(true);
	   }
}
