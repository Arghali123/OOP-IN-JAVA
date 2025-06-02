import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Test {
public static void main(String[] args) {
    JFrame frame=new JFrame("Using mouse adaptar");
    frame.setBounds(0,0,600,500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);

    JLabel label=new JLabel("Click inside the window");
    label.setBounds(50, 50, 200, 30);

    frame.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e)
        {
            label.setText("Mouse Clicked at: "+e.getX()+", "+e.getY());
        }
    });

    frame.add(label);
    frame.setVisible(true);
}
}