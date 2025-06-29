import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener {
    // Components
    JTextField text1, text2, result;
    JButton addButton;

    // Constructor
    public SimpleCalculator() {
        setTitle("Simple Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 5, 5)); // rows, cols, hgap, vgap

        // Labels and TextFields
        add(new JLabel("Enter first number:"));
        text1 = new JTextField();
        add(text1);

        add(new JLabel("Enter second number:"));
        text2 = new JTextField();
        add(text2);

        add(new JLabel("Result:"));
        result = new JTextField();
        result.setEditable(false);
        add(result);

        // Button
        addButton = new JButton("Add");
        addButton.addActionListener(this); // Registering event
        add(addButton);

        setVisible(true);
    }

    // Event handling
    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(text1.getText());
            int num2 = Integer.parseInt(text2.getText());
            int sum = num1 + num2;
            result.setText(String.valueOf(sum));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers");
        }
    }

    // Main method
    public static void main(String[] args) {
        new SimpleCalculator(); // run the application
    }
}

