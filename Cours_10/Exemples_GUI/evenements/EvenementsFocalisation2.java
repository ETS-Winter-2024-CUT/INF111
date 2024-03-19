package evenements;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class EvenementsFocalisation2 extends JFrame implements FocusListener
{
	public EvenementsFocalisation2()
	{
		Container c = getContentPane();
		
		JLabel l =new JLabel("Nom : ");
		JTextField t = new JTextField(10);
		JCheckBox cb = new JCheckBox("inscrit");
		JButton b = new JButton("OK");

                JPanel p = new JPanel();
		p.add(l);
		p.add(t);
		p.add(cb);
		p.add(b);
		c.add(p,BorderLayout.NORTH);

		t.addFocusListener(this);
		cb.addFocusListener(this);
		b.addFocusListener(this);

		setSize(400,400);
		setTitle("Evenements de focalisation sur plusieurs composants");
		setVisible(true);
	}
	
	public static void main(String s[])
	{
		EvenementsFocalisation2 fen = new EvenementsFocalisation2();
	}
	
	public void focusGained(FocusEvent e)
	{
		JComponent jc = (JComponent)e.getSource();
		System.out.println("focus recu par un composant de "+jc.getClass());
	}
	
	public void focusLost(FocusEvent e)
	{
		JComponent jc = (JComponent)e.getSource();
		System.out.println("focus perdu par un composant de "+jc.getClass());
	}
	
}