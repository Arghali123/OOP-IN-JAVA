package Adapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Test extends JFrame{

    public Test()
    {
        setTitle("Practice of Key adapter");
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label=new JLabel("Press any key...",SwingConstants.CENTER);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e)
            {
                System.out.println("Key pressed: "+KeyEvent.getKeyText(e.getKeyCode()));
            }
        });

        add(label);

        setFocusable(true);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Test();
    }
}