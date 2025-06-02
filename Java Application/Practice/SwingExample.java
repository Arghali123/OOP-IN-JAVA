

import java.awt.event.*;
import javax.swing.*;

public class SwingExample {

    SwingExample() {
        JFrame jFrame = new JFrame("This App contains almost all Elements of Swing");
        jFrame.setSize(600, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

        // Name
        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(30, 12, 150, 25);
        jFrame.add(lblName);

        JTextField txtName = new JTextField();
        txtName.setBounds(100, 10, 150, 25);
        jFrame.add(txtName);

        // Address
        JLabel lblAddress = new JLabel("Address:");
        lblAddress.setBounds(300, 12, 150, 25);
        jFrame.add(lblAddress);

        JTextField txtAddress = new JTextField();
        txtAddress.setBounds(370, 10, 150, 25);
        jFrame.add(txtAddress);
    }

    public static void main(String[] args) {
        new SwingExample();
    }
}
