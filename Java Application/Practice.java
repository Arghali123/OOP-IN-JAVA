import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import javax.swing.SwingUtilities;
import java.awt.event.*;

public class Practice {
    Practice() {
        JFrame jFrame = new JFrame("Practice of all java application");
        jFrame.setSize(600, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(null);

        // name
        JLabel lblName = new JLabel("Name: ");
        lblName.setBounds(30, 12, 150, 10);
        jFrame.add(lblName);

        JTextField txtName = new JTextField();
        txtName.setBounds(100, 10, 150, 20);
        jFrame.add(txtName);

        // address
        JLabel lblAddress = new JLabel("Address: ");
        lblAddress.setBounds(300, 12, 150, 10);
        jFrame.add(lblAddress);

        JTextField txtAddress = new JTextField();
        txtAddress.setBounds(370, 10, 150, 20);
        jFrame.add(txtAddress);

        // class
        JLabel lblClass = new JLabel("Class: ");
        lblClass.setBounds(30, 60, 150, 10);
        jFrame.add(lblClass);

        JComboBox<String> cmbClass = new JComboBox<String>();
        cmbClass.addItem("BCA");
        cmbClass.addItem("BBA");
        cmbClass.addItem("MCA");
        cmbClass.addItem("MBA");
        cmbClass.setBounds(100, 55, 150, 20);
        jFrame.add(cmbClass);

        // Gender
        JLabel lblGender = new JLabel("Gender: ");
        lblGender.setBounds(300, 60, 80, 10);
        jFrame.add(lblGender);

        ButtonGroup group1 = new ButtonGroup();

        JRadioButton chkMale = new JRadioButton("Male", true);
        chkMale.setBounds(360, 55, 70, 20);
        jFrame.add(chkMale);
        group1.add(chkMale);

        JRadioButton chkFemale = new JRadioButton("Female");
        chkFemale.setBounds(430, 55, 70, 20);
        jFrame.add(chkFemale);
        group1.add(chkFemale);

        // Shift
        JLabel lblShift = new JLabel("Shift: ");
        lblShift.setBounds(30, 100, 80, 10);
        jFrame.add(lblShift);

        String[] shift = { "Morning", "Day", "Evening", "Night" };
        JList<String> list1 = new JList<String>(shift);
        list1.setBounds(100, 100, 100, 50);
        jFrame.add(list1);

        // Remark
        JLabel lblRemark = new JLabel("Remark: ");
        lblRemark.setBounds(300, 100, 80, 10);
        jFrame.add(lblRemark);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(400, 100, 150, 100);
        jFrame.add(textArea);

        // JTable
        String data[][] = {
                { "10", "Daenish", "1000000" },
                { "11", "Diskshya", "10000" },
                { "19", "Niraj", "199" },
                { "1", "Aayush", "199999" },
                { "6", "Ashik", "12000" },
                { "9", "Dipson", "111111" },
        };
        String column[] = { "ID", "Name", "Salary" };
        JTable jt = new JTable(data, column);
        JScrollPane sp = new JScrollPane(jt);
        sp.setBounds(30, 200, 250, 80);
        jFrame.add(sp);

        JButton click = new JButton("Submit");
        click.setBounds(200, 300, 100, 30);
        jFrame.add(click);

        // Menu
        JMenuBar mb = new JMenuBar();
        mb.setBounds(30, 350, 200, 20);

        JMenu menu1 = new JMenu("File");
        JMenuItem item1, item3;
        item1 = new JMenuItem("New");
        JMenu item2 = new JMenu("Open");
        JMenuItem i1, i2;
        i1 = new JMenuItem("Open file");
        i2 = new JMenuItem("Open project");
        item2.add(i1);
        item2.add(i2);
        item3 = new JMenuItem("Close");
        menu1.add(item1);
        menu1.add(item2);
        menu1.add(item3);

        JMenu menu2 = new JMenu("Class");

        JMenu bca = new JMenu("BCA");
        JMenuItem name1, name2;
        name1 = new JMenuItem("Daenish");
        name2 = new JMenuItem("Niraj");
        bca.add(name1);
        bca.add(name2);

        JMenu csit = new JMenu("Csit");
        JMenuItem nam1 = new JMenuItem("Dipak");
        JMenuItem nam2 = new JMenuItem("Seela");
        csit.add(nam1);
        csit.add(nam2);
        menu2.add(bca);
        menu2.add(csit);

        mb.add(menu1);
        mb.add(menu2);
        jFrame.add(mb);

        jFrame.setVisible(true);

        cmbClass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selected = (String) cmbClass.getSelectedItem();
                JOptionPane.showMessageDialog(jFrame, "You selected " + selected);
            }
        });

        // Custom dialog box
        click.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = txtName.getText();
                String address = txtAddress.getText();
                String selectedClass = (String) cmbClass.getSelectedItem();
                String gender = chkMale.isSelected() ? "Male" : "Female";
                String shift = list1.getSelectedValue();
                String remark = textArea.getText();

                // Build the message
                String message = "Submitted Information:\n";
                message += "Name: " + name + "\n";
                message += "Address: " + address + "\n";
                message += "Class: " + selectedClass + "\n";
                message += "Gender: " + gender + "\n";
                message += "Shift: " + (shift != null ? shift : "Not selected") + "\n";
                message += "Remark: " + remark;
              JOptionPane.showMessageDialog(jFrame, message, "Submission Details", JOptionPane.INFORMATION_MESSAGE);

            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Practice();
            }
        });
    }
}
