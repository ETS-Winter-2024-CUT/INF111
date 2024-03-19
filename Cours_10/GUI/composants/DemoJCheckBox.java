package composants;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DemoJCheckBox extends JFrame
{
      public static void main(String args[])
	   {
		JFrame f = new DemoJCheckBox();
		f.setTitle("démo CheckBox");
		f.setVisible(true);
	   }

      public DemoJCheckBox()
	   {
		JPanel p = new JPanel();
		//p.setLayout(new FlowLayout(FlowLayout.CENTER));
        p.setBackground(Color.WHITE);

		JCheckBox case1=new JCheckBox("Je suis membre");
		JCheckBox case2=new JCheckBox("Je possède un permis",true);

		p.add(case1);
		p.add(case2);
		this.add(p,BorderLayout.NORTH);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);
        this.setLocation(200,200);
        this.setVisible(true);
	   }
}
