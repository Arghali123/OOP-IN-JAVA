import javax.swing.*;
import java.awt.*;

public class ChoiceComponents {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Choice Components Example");
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JCheckBox
        JCheckBox chk1 = new JCheckBox("Bca");
        JCheckBox chk2 = new JCheckBox("Csit");

        // JRadioButton
        JRadioButton rad1 = new JRadioButton("Male");
        JRadioButton rad2 = new JRadioButton("Female");

        // Group radio buttons
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rad1);
        genderGroup.add(rad2);

        // JComboBox
        String[] years = {"Select year", "First Year", "Second Year", "Third Year"};
        JComboBox<String> comboBox = new JComboBox<>(years);

        // Panel 1: Checkboxes (centered)
        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel1.add(chk1);
        panel1.add(chk2);

        // Panel 2: Radio buttons (right)
        JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panel2.add(rad1);
        panel2.add(rad2);

        // Panel 3: ComboBox (left)
        JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel3.add(new JLabel("Year: "));
        panel3.add(comboBox);

        // Container panel with vertical BoxLayout
        JPanel container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));
        container.add(panel1);
        container.add(panel2);
        container.add(panel3);

        // Add container to frame
        frame.add(container);

        frame.setVisible(true);
    }
}

