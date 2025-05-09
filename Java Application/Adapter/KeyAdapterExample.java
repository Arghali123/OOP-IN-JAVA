package Adapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyAdapterExample extends JFrame{
    public KeyAdapterExample()
    {
        setTitle("KeyAdapter Example");
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create a label to show instructions
        JLabel label=new JLabel("Press any key...",SwingConstants.CENTER);
        add(label);

        //add keylistener using KeyAdapter

        addKeyListener(new KeyAdapter()
         {
            @Override
            public void keyPressed(KeyEvent e)
            {
                System.out.println("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
            }
         });
        setFocusable(true);//Ensure the frame can recieve key events
        setVisible(true);
}
public static void main(String[] args) {
    new KeyAdapterExample();
}
}
