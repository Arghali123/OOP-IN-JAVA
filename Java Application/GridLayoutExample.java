import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class GridLayoutExample {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Grid layout practice");
        frame.setSize(600,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(2,3));//2 rows 3 columns
        //note:columns are dynamic
        
        for(int i=1;i<=10;i++)
        {
            frame.add(new JButton("Button "+i));
        }

        frame.setVisible(true);
    }
}
