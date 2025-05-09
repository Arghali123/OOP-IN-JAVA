package Event;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.event.*;

public class EventHandling {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("Event handling");
        jFrame.setSize(500,400);
        //jFrame.setLayout(new FlowLayout());
        jFrame.setLayout(new FlowLayout().LEFT);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jButton1=new JButton("Button1");
        
        jFrame.add(jButton1);
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent)
            {
              JOptionPane.showMessageDialog(jFrame,"Hello");
            }
        });

        JButton jButton2=new JButton("Button2");
        
        jFrame.add(jButton2);
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent)
            {
              JOptionPane.showMessageDialog(jFrame,"Daenish");
            }
        });

        JButton jButton3=new JButton("Button3");
        
        jFrame.add(jButton3);
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent)
            {
              JOptionPane.showMessageDialog(jFrame,"Arghali");
            }
        });
        jFrame.setVisible(true);
    }
}
