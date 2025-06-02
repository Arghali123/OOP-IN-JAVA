package Practice;

import javax.swing.*;
import java.awt.event.*;

public class ArthematicOpe extends JFrame {

    public ArthematicOpe() {
        setTitle("Arithmetic Operations: Factorial and Cube");
        setSize(600, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel numlbl = new JLabel("Enter a number: ");
        numlbl.setBounds(10, 10, 150, 25);
        add(numlbl);

        JTextField numTextField = new JTextField();
        numTextField.setBounds(200, 10, 150, 30);
        add(numTextField);

        JLabel result = new JLabel("Result: ");
        result.setBounds(10, 50, 300, 30);
        add(result);

        JButton calculate = new JButton("Calculate");
        calculate.setBounds(150, 100, 200, 30);
        add(calculate);

        // MouseListener for factorial
        calculate.addMouseListener(new MouseListener() {
            @Override
            public void mousePressed(MouseEvent e) {
                try {
                    int num = Integer.parseInt(numTextField.getText());
                    long fact = 1;
                    for (int i = 1; i <= num; i++) {
                        fact *= i;
                    }
                    result.setText("Result (Factorial): " + fact);
                } catch (NumberFormatException ex) {
                    result.setText("Invalid number for factorial!");
                }
            }

            @Override public void mouseReleased(MouseEvent e) {
                try {
                    int num = Integer.parseInt(numTextField.getText());
                    int cube = num * num * num;
                    result.setText("Result (Cube): " + cube);
                } catch (NumberFormatException ex) {
                    result.setText("Invalid number for cube!");
                }
            }

            @Override public void mouseClicked(MouseEvent e) {}
            @Override public void mouseEntered(MouseEvent e) {}
            @Override public void mouseExited(MouseEvent e) {}
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ArthematicOpe());
    }
}
