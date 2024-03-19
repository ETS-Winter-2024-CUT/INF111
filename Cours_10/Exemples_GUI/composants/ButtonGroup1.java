package composants;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ButtonGroup1 extends JFrame
{
	public static void main(String args[])
	{
		JFrame f = new ButtonGroup1();
		f.setTitle("ButtonGroup 1");
		f.setVisible(true);
	}

	public ButtonGroup1()
	{
		Container coucheContenu = getContentPane();
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.CENTER));

		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout(FlowLayout.CENTER));

		ButtonGroup group1=new ButtonGroup();
		JRadioButton case1gr1=new JRadioButton("Math",false);
		JRadioButton case2gr1=new JRadioButton("Physique",true);
		JRadioButton case3gr1=new JRadioButton("Informatique",true);

		group1.add(case1gr1);
		group1.add(case2gr1);
		group1.add(case3gr1);

		p.add(case1gr1);
		p.add(case2gr1);
		p.add(case3gr1);

		ButtonGroup group2=new ButtonGroup();
		JRadioButton case1gr2=new JRadioButton("Enfant",false);
		JRadioButton case2gr2=new JRadioButton("Adolescent",false);
		JRadioButton case3gr2=new JRadioButton("Adulte",true);

		group2.add(case1gr2);
		group2.add(case2gr2);
		group2.add(case3gr2);

		p2.add(case1gr2);
		p2.add(case2gr2);
		p2.add(case3gr2);

		coucheContenu.add(p,BorderLayout.NORTH);
		coucheContenu.add(p2,BorderLayout.SOUTH);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setLocation(200,200);
		setVisible(true);
	}
}
