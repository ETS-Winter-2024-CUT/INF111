package evenements;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class EvenementsSouris extends JFrame implements MouseListener
{
	public EvenementsSouris()
	{
		Container c = getContentPane();
		this.addMouseListener(this);

		setSize(400,400);
		setTitle("Evenements de souris");
		setVisible(true);
	}
	
	public static void main(String s[])
	{
		EvenementsSouris fen = new EvenementsSouris();
	}
	
	public void mouseClicked(MouseEvent e)
	{
		System.out.println("souris clique:"+e.getPoint().x+"-"+e.getPoint().y);
	}
	
	public void mouseReleased(MouseEvent e)
	{
		System.out.println("souris relachee:"+e.getPoint().x+"-"+e.getPoint().y);
	}
	
	public void mousePressed(MouseEvent e)
	{
		System.out.println("souris pressee:"+e.getPoint().x+"-"+e.getPoint().y);
	}
	
	public void mouseEntered(MouseEvent e)
	{
		System.out.println("souris entree.");
	}
	
	public void mouseExited(MouseEvent e)
	{
		System.out.println("souris sortie.");
	}
}