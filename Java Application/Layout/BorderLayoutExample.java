import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutExample {
    public static void main(String[] args) {
        //east,west,north and south

        JFrame frame=new JFrame("Border layout practice");
        frame.setSize(600,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout());

        frame.add(new JButton("North"),BorderLayout.NORTH);
        frame.add(new JButton("South"),BorderLayout.SOUTH);
        frame.add(new JButton("East"),BorderLayout.EAST);
        frame.add(new JButton("West"),BorderLayout.WEST);
        frame.add(new JButton("Center"),BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
