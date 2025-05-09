package Adapter;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AbstractClassExample {
    //AbstractClass:Used to overide the required methods of interface instead of overriding all the methods present in interface

    /*
     * Types of adapter
     * - mouse
     * -key
     * -window
     */

     public static void main(String[] args) {
        JFrame jFrame=new JFrame("Mouse  Adaptar Class Example");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(0, 0, 600, 500);

        JLabel jLabel=new JLabel("Click inside the window");
        jLabel.setBounds(50, 50, 200, 30);

        jFrame.add(jLabel);
        jFrame.setLayout(null);

        //Add a mouse listerner using MouseAdapter
        jFrame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                jLabel.setText("Mouse Clicked at: "+e.getX()+", "+e.getY());
            }
        });
        jFrame.setVisible(true);
     }
}
