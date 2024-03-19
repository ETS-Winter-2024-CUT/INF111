package evenements;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class EvenementsSouris2 extends JFrame implements MouseListener
{
	public EvenementsSouris2()
	{
		Container c = getContentPane();
		JButton b = new JButton("OK");
		b.setBackground(Color.blue);
		JPanel p = new JPanel();

		p.add(b);
		c.add(p,BorderLayout.NORTH);
		b.addMouseListener(this);
		//p.addMouseListener(this);

//
		JButton b2 = new JButton("Annuler");
		b2.setBackground(Color.blue);
		b2.addMouseListener(this);
		p.add(b2);
//

		JButton b3 = new JButton("Oui");
		b3.setBackground(Color.blue);
		b3.addMouseListener(this);
		p.add(b3);


		setSize(400,400);
		setTitle("Evenements de souris sur un bouton");
		setVisible(true);
	}

	public static void main(String s[])
	{
		EvenementsSouris2 fen = new EvenementsSouris2();
	}

	public void mouseClicked(MouseEvent e)
	{
		System.out.println("souris clique.");
	}

	public void mouseReleased(MouseEvent e)
	{
		System.out.println("souris relachee.");
	}

	public void mousePressed(MouseEvent e)
	{
		System.out.println("souris pressee.");
	}

	public void mouseEntered(MouseEvent e)
	{
		System.out.println("souris entree.");
		//JButton s = (JButton)e.getSource();
		//s.setBackground(Color.red);
		((JComponent)e.getSource()).setBackground(Color.red);
	}

	public void mouseExited(MouseEvent e)
	{
		System.out.println("souris sortie.");
		//JButton s = (JButton)e.getSource();
		//s.setBackground(Color.blue);
		((JComponent)e.getSource()).setBackground(Color.blue);
	}
}
