import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class JPannelExample {
    public static void main(String[] args) {
        JFrame frame=new JFrame("JPannel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);

        JPanel panel=new JPanel();
        panel.setLayout(new FlowLayout());

        JButton button1=new JButton();
        JButton button2=new JButton();
        panel.add(button1);
        panel.add(button2);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
