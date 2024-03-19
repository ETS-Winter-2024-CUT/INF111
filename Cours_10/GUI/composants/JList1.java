package composants;

// Fichier : \Exemples\swing\JList1.java
import java.awt.*; //pour les gestionnaires de mise en disposition (layouts).
import javax.swing.*; //pour les composants swing
import javax.swing.border.Border;

public class JList1 extends JFrame {

    public static void main(String args[]) {
        JFrame f = new JList1();
        f.setTitle("JList 1");
        f.setVisible(true);
    }

    public JList1() {
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout(FlowLayout.CENTER));

        String[] couleurs = {"Rouge", "Jaune", "Vert", "Bleu", "Marron"};
        JList c = new JList(couleurs);
        Border bordure1 = BorderFactory.createLineBorder(Color.blue,2);
        c.setBorder(bordure1);

        //c.setBackground(Color.yellow);
        p.add(c);
        this.add(p, BorderLayout.NORTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocation(200, 200);
        setVisible(true);
    }
}
