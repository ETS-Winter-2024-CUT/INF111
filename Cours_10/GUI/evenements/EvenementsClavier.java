package evenements;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EvenementsClavier extends JFrame implements KeyListener
{
	public EvenementsClavier()
	{
		this.addKeyListener(this);

		setSize(400,400);
		setTitle("Evenements du clavier");
		setVisible(true);
	}
	
	public static void main(String s[])
	{
		EvenementsClavier fen = new EvenementsClavier();
	}
	
	public void keyPressed(KeyEvent e)
	{
		System.out.println("touche pressee.");
	}
	
	public void keyReleased(KeyEvent e)
	{
		System.out.println("touche relachee.");
	}

	public void keyTyped(KeyEvent e)
	{
		System.out.println("touche tapee.");
	}	
}