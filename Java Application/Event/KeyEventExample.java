package Event;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class KeyEventExample extends JFrame implements KeyListener
{
  JLabel l;
  JTextArea area;
  public KeyEventExample()
  {
    l=new JLabel("Press any key");
    l.setBounds(20,50, 200, 200);

    area=new JTextArea();
    area.setBounds(20,80,300,300);

    area.addKeyListener(this);
    add(l);
    add(area);

    setSize(600, 500);
    setLayout(null);
    setVisible(true);
  }

  
    public void keyPressed(KeyEvent e) {
        l.setText("Key Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        l.setText("Key Released: " + e.getKeyChar());
    }

    public void keyTyped(KeyEvent e) {
        l.setText("Key Typed: " + e.getKeyChar());
    }
  public static void main(String[] args) {
    new KeyEventExample();
  }
}
