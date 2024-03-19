package composants;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DemoButton extends JFrame
{
      public static void main(String args[])
	   {
		JFrame f = new DemoButton();
		f.setTitle("JButton 1");
	   }

      public DemoButton()
	   {
		//Container coucheContenu = this.getContentPane();
		JPanel p = new JPanel();

		//FlowLayout gf = new FlowLayout(FlowLayout.LEFT);
		//p.setLayout(gf);
		p.setBackground(Color.YELLOW);

		JButton c = new JButton("OK");
		p.add(c);
		p.add(new JButton("Annuler"));
                //this.setLayout(new FlowLayout());
		this.add(p);//,BorderLayout.SOUTH);
		//coucheContenu.add(new JButton("Annuler"),BorderLayout.NORTH);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setSize(400,400);
		setLocation(200,200);
		setVisible(true);
	   }
}
