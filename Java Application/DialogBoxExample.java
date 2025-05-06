import javax.swing.JOptionPane;

public class DialogBoxExample {
    public static void main(String[] args) {
        //message dialog
        JOptionPane.showMessageDialog(null, "This is a message dialog");

        int choice=JOptionPane.showConfirmDialog(null, "Do you want to continue?");
        if(choice==JOptionPane.YES_OPTION)
        {
            String name=JOptionPane.showInputDialog("Enter your name: ");
            JOptionPane.showMessageDialog(null, "Hello "+name+" !!");
        }
    }
}
