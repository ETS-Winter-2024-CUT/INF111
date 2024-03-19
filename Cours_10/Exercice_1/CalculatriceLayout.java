package Cours_10.Exercice_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatriceLayout {
    public static void main(String args[]) {
        JFrame fen = new JFrame("BorderLayout");

        // Barre de menu
        JMenuBar mb = new JMenuBar();

        JMenu edition = new JMenu("Edition");
        JMenu affichage = new JMenu("Affichage");
        JMenu aide = new JMenu("?");

        mb.add(edition);
        mb.add(affichage);
        mb.add(aide);

        fen.setJMenuBar(mb);

        // Disposition generale
        JPanel p1Nord = new JPanel();
        JPanel p1Centre = new JPanel();

        p1Nord.setLayout(new BorderLayout());
        p1Nord.setBorder(new javax.swing.border.LineBorder(Color.BLUE, 2));

        p1Centre.setLayout(new BorderLayout());
        p1Centre.setBorder(new javax.swing.border.LineBorder(Color.RED, 2));

        // Disposition de l'affichage et de la reinitialisation
        JTextField p2Affichage = new JTextField(0);

        p2Affichage.setText("0.");
        p2Affichage.setHorizontalAlignment(JTextField.RIGHT);
        p2Affichage.setEditable(false);

        JPanel p2BackCEC = new JPanel();

        p2BackCEC.setLayout(new FlowLayout(FlowLayout.RIGHT));
        p2BackCEC.setBorder(new javax.swing.border.LineBorder(Color.GREEN, 1));

        JButton p2Back = new JButton("Back");
        JButton p2CE = new JButton("CE");
        JButton p2C = new JButton("C");

        p2Back.setForeground(Color.red);
        p2CE.setForeground(Color.red);
        p2C.setForeground(Color.red);

        p2BackCEC.add(p2Back);
        p2BackCEC.add(p2CE);
        p2BackCEC.add(p2C);

        p1Nord.add(p2Affichage, BorderLayout.NORTH);
        p1Nord.add(p2BackCEC, BorderLayout.SOUTH);

        // Disposition du clavier
        JPanel p2Ouest = new JPanel();

        JButton p2MC = new JButton("MC");
        JButton p2MR = new JButton("MR");
        JButton p2MS = new JButton("MS");
        JButton p2MPlus = new JButton("M+");

        p2MC.setForeground(Color.red);
        p2MR.setForeground(Color.red);
        p2MS.setForeground(Color.red);
        p2MPlus.setForeground(Color.red);

        p2Ouest.setLayout(new GridLayout(4, 1));

        p2Ouest.add(p2MC);
        p2Ouest.add(p2MR);
        p2Ouest.add(p2MS);
        p2Ouest.add(p2MPlus);

        JPanel p2Chiffres = new JPanel();

        String[] T = {
                "7", "8", "9", "/", "sqrt",
                "4", "5", "6", "*", "%",
                "1", "2", "3", "-", "1/x",
                "0", "±", ".", "+", "="
        };

        p2Chiffres.setLayout(new GridLayout(4, 5, 5, 10));

        JButton tempButton;

        for (int i = 0; i < 20; i++) {
            tempButton = new JButton(T[i]);
            tempButton.setForeground(Color.blue);
            p2Chiffres.add(tempButton);
        }

        p1Centre.add(p2Chiffres, BorderLayout.CENTER);
        p1Centre.add(p2Ouest, BorderLayout.WEST);

        p2Chiffres.setBorder(new javax.swing.border.LineBorder(Color.YELLOW, 2));
        p2Ouest.setBorder(new javax.swing.border.LineBorder(Color.YELLOW, 1));

        ActionListener clicChiffre = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                String buttonText = button.getText();
                String displayText = p2Affichage.getText();
                if (displayText.equals("0.") || displayText.equals("0")) {
                    p2Affichage.setText(buttonText);
                } else {
                    p2Affichage.setText(displayText + buttonText);
                }
            }
        };

        ActionListener effacer = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                p2Affichage.setText("0.");
            }
        };

        for (Component composant : p2Chiffres.getComponents()) {
            if (composant instanceof JButton) {
                JButton button = (JButton) composant;
                if (Character.isDigit(button.getText().charAt(0)) || button.getText().equals(".")) {
                    button.addActionListener(clicChiffre);
                }
            }
        }

        p2C.addActionListener(effacer);

        // Disposition dans la fenetre principale
        fen.add(p1Nord, BorderLayout.NORTH);
        fen.add(p1Centre, BorderLayout.CENTER);

        // Affichage de la fenetre
        fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fen.setSize(400, 300);
        fen.setVisible(true);
    }
}
