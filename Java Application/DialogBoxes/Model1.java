package DialogBoxes;

import javax.swing.JOptionPane;

public class Model1 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,  "This is a modal message dialog.");

        int choice=JOptionPane.showConfirmDialog(null, "Do you want to procees?", "Confirmation", JOptionPane.YES_NO_OPTION);

        if(choice==JOptionPane.YES_OPTION)
        {
            System.out.println("User chose yes");
        }else
        {
            System.out.println("User chose no or closed the dialog ");
        }
    }
}
