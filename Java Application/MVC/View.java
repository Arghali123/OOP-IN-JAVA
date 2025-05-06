package MVC;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class View extends JFrame{
   JTextField jTextField=new JTextField("15");
   JButton jButton=new JButton("Greet");
   JLabel jLabel=new JLabel("Enter your name: ");

   public View()
   {
    setTitle("MVC Example");
    setSize(600, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());

    add(jLabel);
    add(jTextField);
    add(jButton);

    setVisible(true);
   }

   public String getNameInput()
   {
     return jTextField.getText();
   }

   public void setGreeting(String greet)
   {
    jLabel.setText(greet);
   }

   public JButton getGreetButton()
   {
    return jButton;
   }
}
