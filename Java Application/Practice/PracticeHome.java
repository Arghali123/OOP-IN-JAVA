package Practice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PracticeHome {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Use of dialog box and selection");
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Checkboxes
        JCheckBox chk1 = new JCheckBox("PHP");
        JCheckBox chk2 = new JCheckBox("Java");
        JCheckBox chk3 = new JCheckBox("C++");

        // Radio buttons
        JRadioButton rd1 = new JRadioButton("Male");
        JRadioButton rd2 = new JRadioButton("Female");
        JRadioButton rd3 = new JRadioButton("Other");

        // Grouping radio buttons
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rd1);
        genderGroup.add(rd2);
        genderGroup.add(rd3);

        // ComboBox
        String[] country = {"Select Country", "Nepal", "India", "China"};
        JComboBox<String> comboBox = new JComboBox<>(country);

        // Submit button
        JButton submit = new JButton("Submit");

        // Panel 1: CheckBoxes
        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel1.add(chk1);
        panel1.add(chk2);
        panel1.add(chk3);

        // Panel 2: Radio Buttons
        JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel2.add(rd1);
        panel2.add(rd2);
        panel2.add(rd3);

        // Panel 3: ComboBox
        JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panel3.add(new JLabel("Country"));
        panel3.add(comboBox);

        // Panel 4: Submit Button
        JPanel panel4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel4.add(submit);

        // Container panel with vertical BoxLayout
        JPanel container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        container.add(panel1);
        container.add(panel2);
        container.add(panel3);
        container.add(panel4);

        // Submit button action listener
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get selected checkboxes
                StringBuilder languages = new StringBuilder();
                if (chk1.isSelected()) languages.append("PHP ");
                if (chk2.isSelected()) languages.append("Java ");
                if (chk3.isSelected()) languages.append("C++ ");

                // Get selected gender
                String gender = "Not Selected";
                if (rd1.isSelected()) gender = "Male";
                else if (rd2.isSelected()) gender = "Female";
                else if (rd3.isSelected()) gender = "Other";

                // Get selected country
                String selectedCountry = (String) comboBox.getSelectedItem();

                // Show dialog
                JOptionPane.showMessageDialog(frame,
                        "Languages: " + languages.toString().trim() + "\n" +
                        "Gender: " + gender + "\n" +
                        "Country: " + selectedCountry,
                        "Submitted Information",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        frame.add(container);
        frame.setVisible(true);
    }
}
