import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class StudentSwingCRUD extends JFrame {
    JTextField txtId, txtName, txtAddress, txtRemark;
    JComboBox<String> cmbClass;
    JRadioButton rbMale, rbFemale;
    JList<String> shiftList;
    JButton btnAdd, btnUpdate, btnDelete, btnClear;
    JTable table;
    DefaultTableModel model;
    ButtonGroup genderGroup;

    Connection conn;

    StudentSwingCRUD() {
        setTitle("Student CRUD - Swing + MySQL");
        setSize(800, 600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel lblId = new JLabel("ID:");
        JLabel lblName = new JLabel("Name:");
        JLabel lblAddress = new JLabel("Address:");
        JLabel lblClass = new JLabel("Class:");
        JLabel lblGender = new JLabel("Gender:");
        JLabel lblShift = new JLabel("Shift:");
        JLabel lblRemark = new JLabel("Remark:");

        txtId = new JTextField();
        txtName = new JTextField();
        txtAddress = new JTextField();
        txtRemark = new JTextField();

        cmbClass = new JComboBox<>(new String[]{"10", "11", "12"});
        rbMale = new JRadioButton("Male");
        rbFemale = new JRadioButton("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(rbMale);
        genderGroup.add(rbFemale);

        shiftList = new JList<>(new String[]{"Morning", "Day", "Evening"});

        btnAdd = new JButton("Add");
        btnUpdate = new JButton("Update");
        btnDelete = new JButton("Delete");
        btnClear = new JButton("Clear");

        model = new DefaultTableModel(new String[]{"ID", "Name", "Address", "Class", "Gender", "Shift", "Remark"}, 0);
        table = new JTable(model);
        JScrollPane pane = new JScrollPane(table);

        // Set bounds
        lblId.setBounds(20, 20, 100, 25);
        txtId.setBounds(130, 20, 150, 25);
        lblName.setBounds(20, 50, 100, 25);
        txtName.setBounds(130, 50, 150, 25);
        lblAddress.setBounds(20, 80, 100, 25);
        txtAddress.setBounds(130, 80, 150, 25);
        lblClass.setBounds(20, 110, 100, 25);
        cmbClass.setBounds(130, 110, 150, 25);
        lblGender.setBounds(20, 140, 100, 25);
        rbMale.setBounds(130, 140, 70, 25);
        rbFemale.setBounds(200, 140, 80, 25);
        lblShift.setBounds(20, 170, 100, 25);
        shiftList.setBounds(130, 170, 150, 50);
        lblRemark.setBounds(20, 230, 100, 25);
        txtRemark.setBounds(130, 230, 150, 25);

        btnAdd.setBounds(20, 270, 90, 30);
        btnUpdate.setBounds(120, 270, 90, 30);
        btnDelete.setBounds(220, 270, 90, 30);
        btnClear.setBounds(20,320, 90, 30);

        pane.setBounds(320, 20, 450, 400);

        // Add to frame
        add(lblId); add(txtId);
        add(lblName); add(txtName);
        add(lblAddress); add(txtAddress);
        add(lblClass); add(cmbClass);
        add(lblGender); add(rbMale); add(rbFemale);
        add(lblShift); add(shiftList);
        add(lblRemark); add(txtRemark);
        add(btnAdd); add(btnUpdate); add(btnDelete); add(btnClear);
        add(pane);

        connectDatabase();
        loadTable();

        // Button actions
        btnAdd.addActionListener(e -> insertRecord());
        btnUpdate.addActionListener(e -> updateRecord());
        btnDelete.addActionListener(e -> deleteRecord());
        btnClear.addActionListener(e -> clearForm());

        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int row = table.getSelectedRow();
                txtId.setText(model.getValueAt(row, 0).toString());
                txtName.setText(model.getValueAt(row, 1).toString());
                txtAddress.setText(model.getValueAt(row, 2).toString());
                cmbClass.setSelectedItem(model.getValueAt(row, 3).toString());
                if (model.getValueAt(row, 4).toString().equals("Male")) {
                    rbMale.setSelected(true);
                } else {
                    rbFemale.setSelected(true);
                }
                shiftList.setSelectedValue(model.getValueAt(row, 5).toString(), true);
                txtRemark.setText(model.getValueAt(row, 6).toString());
            }
        });

        setVisible(true);
    }

    void connectDatabase() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "DB Connection Error: " + e.getMessage());
        }
    }

    void insertRecord() {
        try {
            String sql = "INSERT INTO students (id, name, address, class, gender, shift, remark) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(txtId.getText()));
            ps.setString(2, txtName.getText());
            ps.setString(3, txtAddress.getText());
            ps.setString(4, cmbClass.getSelectedItem().toString());
            ps.setString(5, rbMale.isSelected() ? "Male" : "Female");
            ps.setString(6, shiftList.getSelectedValue());
            ps.setString(7, txtRemark.getText());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Student Added");
            loadTable();
            clearForm();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Insert Error: " + e.getMessage());
        }
    }

    void updateRecord() {
        try {
            String sql = "UPDATE students SET name=?, address=?, class=?, gender=?, shift=?, remark=? WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, txtName.getText());
            ps.setString(2, txtAddress.getText());
            ps.setString(3, cmbClass.getSelectedItem().toString());
            ps.setString(4, rbMale.isSelected() ? "Male" : "Female");
            ps.setString(5, shiftList.getSelectedValue());
            ps.setString(6, txtRemark.getText());
            ps.setInt(7, Integer.parseInt(txtId.getText()));

            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Student Updated");
            loadTable();
            clearForm();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Update Error: " + e.getMessage());
        }
    }

    void deleteRecord() {
        try {
            String sql = "DELETE FROM students WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(txtId.getText()));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Student Deleted");
            loadTable();
            clearForm();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Delete Error: " + e.getMessage());
        }
    }

    void loadTable() {
        try {
            model.setRowCount(0);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("address"),
                    rs.getString("class"),
                    rs.getString("gender"),
                    rs.getString("shift"),
                    rs.getString("remark")
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Load Error: " + e.getMessage());
        }
    }

    void clearForm() {
        txtId.setText("");
        txtName.setText("");
        txtAddress.setText("");
        cmbClass.setSelectedIndex(0);
        genderGroup.clearSelection();
        shiftList.clearSelection();
        txtRemark.setText("");
    }

    public static void main(String[] args) {
        new StudentSwingCRUD();
    }
}
