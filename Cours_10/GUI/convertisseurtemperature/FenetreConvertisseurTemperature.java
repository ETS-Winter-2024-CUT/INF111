package convertisseurtemperature;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class FenetreConvertisseurTemperature extends JFrame implements ActionListener {

	private JTextField tc = new JTextField(5),
			tf = new JTextField(5);
	private JButton b1 = new JButton(" > "),
			b2 = new JButton(" < ");
	private JLabel lc = new JLabel("Degrés Celsius : "),
			lf = new JLabel("Degrés Fahrenheit : ");

	// Pour afficher les températures avec 2 décimales maximum :
	private DecimalFormat formateur = new DecimalFormat("0.##");

	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				(new FenetreConvertisseurTemperature("Convertisseur de température")).setVisible(true);
			}
		});
	}

	public FenetreConvertisseurTemperature(String titre) {
		super(titre);
		initialiserComposants();
		configurerFenetrePrincipale();
	}

	private void configurerFenetrePrincipale() {
		setSize(450, 120);
		setLocation(100, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void initialiserComposants() {
		JPanel p1 = new JPanel(),
				p2 = new JPanel(),
				p3 = new JPanel(),
				p2a = new JPanel(),
				p2b = new JPanel();

		p2.setLayout(new GridLayout(2, 1));

		p1.add(lc);
		p1.add(tc);
		p3.add(lf);
		p3.add(tf);
		p2a.add(b1);
		p2b.add(b2);
		p2.add(p2a);
		p2.add(p2b);
		//
		JPanel p = new JPanel();
		p.add(p1);
		p.add(p2);
		p.add(p3);
		//
		Container coucheContenu = this.getContentPane();
		// coucheContenu.add(p1,BorderLayout.WEST);
		coucheContenu.add(p, BorderLayout.CENTER);
		// coucheContenu.add(p3,BorderLayout.EAST);

		b1.addActionListener(this);
		b2.addActionListener(this);
		tc.addActionListener(this);
		tf.addActionListener(this);
	}

	public void actionPerformed(ActionEvent evt) {
		DecimalFormatSymbols dfs = new DecimalFormatSymbols();
		dfs.setDecimalSeparator('.');
		formateur.setDecimalFormatSymbols(dfs);
		Object source = evt.getSource();
		if (source == b1 || source == tc) {
			double tempC = Double.parseDouble(tc.getText());
			double tempF = TemperatureService.celsiusAFahrenheit(tempC);
			tf.setText(String.valueOf(formateur.format(tempF)));
		} else if (source == b2 || source == tf) {
			double tempF = Double.parseDouble(tf.getText());
			double tempC = TemperatureService.fahrenheitACelsius(tempF);
			tc.setText(String.valueOf(formateur.format(tempC)));
		}
	}
}
