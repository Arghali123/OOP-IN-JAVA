package Practice;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MySwingApp {

    public static void main(String[] args) {
        //Create a frame
        JFrame jFrame=new JFrame("My Swing application");

        //Set frame size 
        jFrame.setSize(500,300);

        //close operation
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create components
        JLabel jLabel=new JLabel("Enter your name");
        jLabel.setBounds(50, 50,200, 20);

        JTextField jTextField=new JTextField(20);
        jTextField.setBounds(200, 50, 200, 20);

        JButton jButton=new JButton("Submit");
        jButton.setBounds(100, 80, 100, 30);

        //set default layout
        jFrame.setLayout(null);

        //add components
        jFrame.add(jLabel);
        jFrame.add(jTextField);
        jFrame.add(jButton);

        //set visibility
        jFrame.setVisible(true);
    }
}