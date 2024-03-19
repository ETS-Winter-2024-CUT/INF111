package boitesdialogues.standard;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author A. Toudeft
 */
public class DialoBox extends JFrame implements ActionListener {

	private ButtonGroup g;
	private JRadioButton tRb[];
	private String tNoms[] = {"MessageDialog","ConfirmDialog","InputDialog"};
	JButton bGo = new JButton("GO");
	/**
	 * Constructor for DialoBox.
	 * @param titre
	 */
	public DialoBox(String titre) {
		super(titre);

		JPanel p = new JPanel();
		JPanel pNord = new JPanel();
		pNord.add(bGo);

		bGo.addActionListener(this);

		g = new ButtonGroup();

		tRb = new JRadioButton[tNoms.length];

		p.setLayout(new GridLayout(tNoms.length+3,1));

		for (int i=0;i<tNoms.length;i++)
		  {
		  	tRb[i] = new JRadioButton(tNoms[i]);
		  	tRb[i].setActionCommand(tNoms[i]);
		  	g.add(tRb[i]);
		  	p.add(tRb[i]);
		  }
		getContentPane().add(pNord,BorderLayout.NORTH);
		getContentPane().add(p,BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		DialoBox fen = new DialoBox("Les boites de dialogue");
                fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fen.setSize(400,400);
		fen.setVisible(true);
	}

	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == bGo)
		 {
		  ButtonModel bm = g.getSelection();
		  if (bm==null)
		  {
		  	JOptionPane.showMessageDialog(this,"Il faut d\'abord sélectionner un bouton radio");
		  	return;
		  }

		  String s = bm.getActionCommand();
		  if (s==null)
		  {
		  	JOptionPane.showMessageDialog(this,"Aucune commande d\'action n\'est associée au bouton radio");
		  	return;
		  }
		  if (s.equals("MessageDialog"))
		  {
		  	int typeMessage = JOptionPane.WARNING_MESSAGE ;
		  	//int typeMessage = JOptionPane.QUESTION_MESSAGE ;
		  	//int typeMessage = JOptionPane.INFORMATION_MESSAGE ;

		   	JOptionPane.showMessageDialog(null,"MessageDialog","Exemple de MessageDialog",typeMessage);
		  }
		  else if (s.equals("ConfirmDialog"))
		  {
			int typeMessage = JOptionPane.INFORMATION_MESSAGE;
			int typeOption = JOptionPane.YES_NO_CANCEL_OPTION;
			int reponse = JOptionPane.showConfirmDialog(this,"ConfirmDialog","Exemple de ConfirmDialog",typeOption,typeMessage);
			afficheTypeReponse(reponse);
		  }
		  else if (s.equals("InputDialog"))
		  {
			//String reponse = JOptionPane.showInputDialog(this,"Quel est votre nom?","Moumene");
			int typeMessage = JOptionPane.QUESTION_MESSAGE;
			String reponse = JOptionPane.showInputDialog(this,"Quel est votre nom?","Exemple de InputDialog",typeMessage);
			JOptionPane.showMessageDialog(this,"Bonjour "+reponse);
		  }
		 }
	}

	public void afficheTypeReponse(int reponse)
	{
		switch (reponse)
		{
		 case JOptionPane.OK_OPTION :
			JOptionPane.showMessageDialog(this,"vous avez choisi le bouton OK ou YES");
		 	break;
		 case JOptionPane.NO_OPTION :
			JOptionPane.showMessageDialog(this,"vous avez choisi le bouton NO");
		 	break;
		 case JOptionPane.CANCEL_OPTION :
			JOptionPane.showMessageDialog(this,"vous avez choisi le bouton CANCEL");
		 	break;
		}
	}
}
