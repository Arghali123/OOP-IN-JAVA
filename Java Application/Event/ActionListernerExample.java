package Event;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ActionListernerExample {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Action Listener preactice");
        frame.setSize(500,400);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create and add buttons with actions
        JButton btn1=new JButton("Button1");
        JButton btn2=new JButton("Button2");
        JButton btn3=new JButton("Button3");

        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);

        //use lambdas for simpler action listeners
        btn1.addActionListener(e->JOptionPane.showMessageDialog(frame, "Hello"));
        btn2.addActionListener(e->JOptionPane.showMessageDialog(frame, "Daenish"));
        btn3.addActionListener(e->JOptionPane.showMessageDialog(frame, "Arghali"));

        frame.setVisible(true);
    }
}
