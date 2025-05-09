import java.awt.*;
import javax.swing.*;

class JPannel extends JPanel {
    static JFrame f;
    static JButton b, b1, b2, b3;
    static JLabel l;

    public static void main(String[] args) {
        f = new JFrame("Panel");
        l = new JLabel("Panel label");

        b = new JButton("button1");
        b1 = new JButton("button2");
        b2 = new JButton("button3");
        b3 = new JButton("button4");

        JPannel p = new JPannel(); // Now it's a JPanel
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        p.add(b);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.setBackground(Color.red);

        f.add(p);
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Optional but good
        f.setVisible(true);
    }
}

