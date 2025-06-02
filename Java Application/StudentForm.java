import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class StudentForm {
    public static void main(String[] args) {
        // Database connection details
        final String DB_URL = "jdbc:postgresql://localhost:5432/Student";
        final String DB_USER = "postgres";
        final String DB_PASS = "Root@123";

        // Create frame
        JFrame frame = new JFrame("Student Registration");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.setLayout(new GridLayout(1, 2)); // Two columns: form | display area

        // LEFT: Form panel
        JPanel formPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        JLabel genderLabel = new JLabel("Gender:");
        String[] genders = {"Male", "Female", "Other"};
        JComboBox<String> genderBox = new JComboBox<>(genders);

        JButton submitButton = new JButton("Submit");

        formPanel.add(nameLabel); formPanel.add(nameField);
        formPanel.add(emailLabel); formPanel.add(emailField);
        formPanel.add(passwordLabel); formPanel.add(passwordField);
        formPanel.add(genderLabel); formPanel.add(genderBox);
        formPanel.add(new JLabel()); formPanel.add(submitButton);

        // RIGHT: Display panel with JTextArea
        JTextArea displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);

        // Add panels to frame
        frame.add(formPanel);
        frame.add(scrollPane);
        frame.setVisible(true);

        // Event: Submit button
        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());
            String gender = (String) genderBox.getSelectedItem();

            // Insert into DB
            try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
                // Insert statement
                String insertSQL = "INSERT INTO Student (name, email, password, gender) VALUES (?, ?, ?, ?)";
                PreparedStatement ps = conn.prepareStatement(insertSQL);
                ps.setString(1, name);
                ps.setString(2, email);
                ps.setString(3, password);
                ps.setString(4, gender);
                ps.executeUpdate();

                // Refresh display
                StringBuilder allStudents = new StringBuilder();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Student");

                while (rs.next()) {
                    allStudents.append("ID: ").append(rs.getInt("id"))
                            .append(", Name: ").append(rs.getString("name"))
                            .append(", Email: ").append(rs.getString("email"))
                            .append(", Gender: ").append(rs.getString("gender"))
                            .append("\n");
                }

                displayArea.setText(allStudents.toString());
                JOptionPane.showMessageDialog(frame, "Student data saved successfully!");

                // Clear fields
                nameField.setText("");
                emailField.setText("");
                passwordField.setText("");
                genderBox.setSelectedIndex(0);

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage());
            }
        });
    }
}
