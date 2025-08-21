import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.io.*;

public class SimpleRegistrationWithTable {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Registration Form");
        frame.setSize(600, 500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menu Bar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu helpMenu = new JMenu("Help");
        JMenuItem exitItem = new JMenuItem("Exit");
        JMenuItem aboutItem = new JMenuItem("About");

        fileMenu.add(exitItem);
        helpMenu.add(aboutItem);
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);
        frame.setJMenuBar(menuBar);

        exitItem.addActionListener(e -> System.exit(0));
        aboutItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Simple Registration App\nBy ChatGPT"));

        // Labels and Fields
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 20, 100, 20);
        JTextField nameField = new JTextField();
        nameField.setBounds(120, 20, 180, 20);

        JLabel mobileLabel = new JLabel("Mobile:");
        mobileLabel.setBounds(20, 50, 100, 20);
        JTextField mobileField = new JTextField();
        mobileField.setBounds(120, 50, 180, 20);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(20, 80, 100, 20);
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        male.setBounds(120, 80, 70, 20);
        female.setBounds(200, 80, 100, 20);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male); genderGroup.add(female);

        JLabel dobLabel = new JLabel("DOB:");
        dobLabel.setBounds(20, 110, 100, 20);
        String[] days = {"1", "2", "3", "4", "5"};
        String[] months = {"Jan", "Feb", "Mar"};
        String[] years = {"2000", "2001", "2002"};
        JComboBox<String> dayBox = new JComboBox<>(days);
        JComboBox<String> monthBox = new JComboBox<>(months);
        JComboBox<String> yearBox = new JComboBox<>(years);
        dayBox.setBounds(120, 110, 50, 20);
        monthBox.setBounds(180, 110, 60, 20);
        yearBox.setBounds(250, 110, 60, 20);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(20, 140, 100, 20);
        JTextArea addressArea = new JTextArea();
        addressArea.setBounds(120, 140, 180, 50);

        JCheckBox terms = new JCheckBox("Accept terms and conditions");
        terms.setBounds(20, 200, 250, 20);

        JButton submit = new JButton("Submit");
        submit.setBounds(120, 230, 100, 30);

        // JTable for displaying submitted data
        String[] columns = {"Name", "Mobile", "Gender", "DOB", "Address"};
        DefaultTableModel tableModel = new DefaultTableModel(columns, 0);
        JTable table = new JTable(tableModel);
        JScrollPane tableScroll = new JScrollPane(table);
        tableScroll.setBounds(20, 280, 540, 150);

        // Submit button action
        submit.addActionListener(e -> {
            if (terms.isSelected()) {
                String name = nameField.getText();
                String mobile = mobileField.getText();
                String gender = male.isSelected() ? "Male" : (female.isSelected() ? "Female" : "Not selected");
                String dob = dayBox.getSelectedItem() + "-" + monthBox.getSelectedItem() + "-" + yearBox.getSelectedItem();
                String address = addressArea.getText();

                // Save to file
                try {
                    FileWriter fw = new FileWriter("exam.txt", true);
                    fw.write("Name: " + name + "\n");
                    fw.write("Mobile: " + mobile + "\n");
                    fw.write("Gender: " + gender + "\n");
                    fw.write("DOB: " + dob + "\n");
                    fw.write("Address: " + address + "\n");
                    fw.write("---------------\n");
                    fw.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Error writing to file.");
                }

                // Add to JTable
                tableModel.addRow(new String[]{name, mobile, gender, dob, address});
                JOptionPane.showMessageDialog(frame, "Data saved and displayed.");

                // Clear fields
                nameField.setText("");
                mobileField.setText("");
                genderGroup.clearSelection();
                addressArea.setText("");
                terms.setSelected(false);
            } else {
                JOptionPane.showMessageDialog(frame, "Please accept the terms");
            }
        });

        // Add components to frame
        frame.add(nameLabel); frame.add(nameField);
        frame.add(mobileLabel); frame.add(mobileField);
        frame.add(genderLabel); frame.add(male); frame.add(female);
        frame.add(dobLabel); frame.add(dayBox); frame.add(monthBox); frame.add(yearBox);
        frame.add(addressLabel); frame.add(addressArea);
        frame.add(terms); frame.add(submit); frame.add(tableScroll);

        // Show frame
        frame.setVisible(true);
    }
}
