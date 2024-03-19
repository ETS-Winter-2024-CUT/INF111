package evenements;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class EvenementsSouris1 extends JFrame implements MouseListener
{
	public EvenementsSouris1()
	{
		Container c = getContentPane();
		
		JPanel p = new JPanel();
		p.setBackground(Color.blue);
		c.add(p);
		p.addMouseListener(this);
		
		setSize(400,400);
		setTitle("Evenements de souris sur un bouton");
		setVisible(true);
	}
	
	public static void main(String s[])
	{
		EvenementsSouris1 fen = new EvenementsSouris1();
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
		JPanel s = (JPanel)e.getSource();
		s.setBackground(Color.red);
	}
	
	public void mouseExited(MouseEvent e)
	{
		System.out.println("souris sortie.");
		JPanel s = (JPanel)e.getSource();
		s.setBackground(Color.blue);
	}
}
