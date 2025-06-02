import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class Practice {
    public static void main(String[] args) {
     JFrame frame=new JFrame("Grid layout practice home");
     frame.setSize(600, 500);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setLayout(new GridLayout(2,3));
     //make 2by3 
     for(int i=1;i<=7;i++)
     {
        frame.add(new JButton("Button "+i));
     }

     frame.setVisible(true);
    }
}
