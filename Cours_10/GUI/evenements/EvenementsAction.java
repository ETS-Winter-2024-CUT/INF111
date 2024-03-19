package evenements;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EvenementsAction extends JFrame implements ActionListener
{
	JButton b1 = new JButton("OK");
	JComboBox l1 = new JComboBox(new String[] {"rouge","vert","bleu"});
	JCheckBox cb1 = new JCheckBox("je suis inscrit");
	JRadioButton rb1 = new JRadioButton("Féminin");
	JRadioButton rb2 = new JRadioButton("Masculin");
	JTextField t1 = new JTextField(10);

	JMenuItem mi1 = new JMenuItem("Ouvrir");

	public EvenementsAction()
	{
		JMenuBar mb1 = new JMenuBar();
		JMenu m1 = new JMenu("Fichier");

		m1.add(mi1);
		mb1.add(m1);

		ButtonGroup g = new ButtonGroup();
		g.add(rb1);
		g.add(rb2);

		Container c = getContentPane();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();

		p1.add(t1);
		p1.add(cb1);
		p1.add(l1);
		p2.add(rb1);
		p2.add(rb2);
		p2.add(b1);
		c.add(p1,BorderLayout.NORTH);
		c.add(p2,BorderLayout.SOUTH);

		b1.addActionListener(this);
		l1.addActionListener(this);
		cb1.addActionListener(this);
		rb1.addActionListener(this);
		rb2.addActionListener(this);
		t1.addActionListener(this);
		mi1.addActionListener(this);

		setSize(400,400);
		setTitle("Evenements d'action");
		setJMenuBar(mb1);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String s[])
	{
		EvenementsAction fen = new EvenementsAction();
	}

	public void actionPerformed(ActionEvent evt)
	{
		//JComponent jc = (JComponent)e.getSource();
		//System.out.println("action sur un composant de "+jc.getClass());
		System.out.println("action sur un composant de type "+evt.getSource().getClass().getName());
	}
}