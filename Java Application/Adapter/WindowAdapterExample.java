package Adapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapterExample extends JFrame{
    public WindowAdapterExample()
    {
        setTitle("Window adapter example");
        setSize(600,500);

        JLabel label=new JLabel("Close the window to exit.",SwingConstants.CENTER);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) 
            {
              System.out.println("Window is closing");
              dispose();//close the window.
            }
        });

        
        add(label);
        setVisible(true);
    }

    public static void main(String[] args) {
        new WindowAdapterExample();
    }
}
