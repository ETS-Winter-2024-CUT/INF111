package evenements;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class EvenementsFocalisation extends JFrame implements FocusListener
{
	public EvenementsFocalisation()
	{
		Container c = getContentPane();
		this.addFocusListener(this);

		setSize(400,400);
		setTitle("Evenements de focalisation");
		setVisible(true);
	}
	
	public static void main(String s[])
	{
		EvenementsFocalisation fen = new EvenementsFocalisation();
	}
	
	public void focusGained(FocusEvent e)
	{
		System.out.println("focus recu.");
	}
	
	public void focusLost(FocusEvent e)
	{
		System.out.println("focus perdu.");
	}
	
}