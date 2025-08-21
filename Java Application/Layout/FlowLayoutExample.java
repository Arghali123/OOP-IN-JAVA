import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutExample {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Set layout to FlowLayout
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        // Add buttons to the frame
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));
        frame.add(new JButton("Button 5"));

        // Make the frame visible
        frame.setVisible(true);
    }
}

