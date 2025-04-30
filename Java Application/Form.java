import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Form {
    public static void main(String[] args) {
        // Creating a frame
        JFrame jFrame = new JFrame("Form");
        jFrame.setSize(800, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null); // set layout to null

        // Username label and text field
        JLabel jusername = new JLabel("User name: ");
        jusername.setBounds(10, 100, 200, 20);
        JTextField juserTextField = new JTextField(20);
        juserTextField.setBounds(10, 130, 200, 20);

        // Password label and text field
        JLabel jpassword = new JLabel("Password: ");
        jpassword.setBounds(300, 100, 200, 20);
        JTextField jpasswordTextField = new JTextField(20);
        jpasswordTextField.setBounds(300, 130, 200, 20);

        //Full name and text field
        JLabel jfullname=new JLabel("Full Name: ");
        jfullname.setBounds(10, 220, 200, 20);
        JTextField jfullnametexTextField=new JTextField(20);
        jfullnametexTextField.setBounds(10, 250, 200, 20);

        //Phone number and text field
        JLabel jphone=new JLabel("Phone number: ");
        jphone.setBounds(300, 220, 200, 20);
        JTextField jphoneTextField=new JTextField();
        jphoneTextField.setBounds(300, 250, 200, 20);

        //Button 
        JButton jButton=new JButton("Submit");
        jButton.setBounds(10, 279, 100, 30);


        // Add components to frame
        jFrame.add(jusername);
        jFrame.add(juserTextField);
        jFrame.add(jpassword);
        jFrame.add(jpasswordTextField);
        jFrame.add(jfullname);
        jFrame.add(jfullnametexTextField);
        jFrame.add(jphone);
        jFrame.add(jphoneTextField);
        jFrame.add(jButton);

        // Set visibility
        jFrame.setVisible(true);
    }
}
