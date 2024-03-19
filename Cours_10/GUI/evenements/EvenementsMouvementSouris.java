package evenements;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

class EvenementsMouvementSouris extends JFrame implements MouseMotionListener
{
	public EvenementsMouvementSouris()
	{
		this.addMouseMotionListener(this);

		setSize(400,400);
		setTitle("Evenements de souris");
		setVisible(true);
	}
	
	public static void main(String s[])
	{
		EvenementsMouvementSouris fen = new EvenementsMouvementSouris();
	}
	
	public void mouseDragged(MouseEvent e)
	{
		System.out.println("souris draguee:"+e.getPoint().x+"-"+e.getPoint().y);
	}
	
	public void mouseMoved(MouseEvent e)
	{
		System.out.println("souris deplacee:"+e.getPoint().x+"-"+e.getPoint().y);
	}
	
}