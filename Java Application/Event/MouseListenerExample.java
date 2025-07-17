import javax.swing.*;
import java.awt.event.*;

public class MouseListenerExample extends JFrame implements MouseListener {
    JLabel label;

    public MouseListenerExample() 
    {
        setTitle("MouseListener Demo");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        label = new JLabel("Move or click mouse");
        label.setBounds(100, 100, 200, 30);
        add(label);

        // Add mouse listener to the frame
        addMouseListener(this);

        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered the window");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited the window");
    }

    public static void main(String[] args) 
    {
        new MouseListenerExample();
    }
}
