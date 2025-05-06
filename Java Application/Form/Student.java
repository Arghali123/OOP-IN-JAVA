package Form;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class Student {
public static void main(String[] args) {
    //Create frame
    JFrame frame=new JFrame("Student Form");
    frame.setSize(800,500);
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //LEFT PANEL(FORM)
    JPanel formPanel=new JPanel(null);
    formPanel.setBounds(0, 0, 350, 500);
    formPanel.setBorder(BorderFactory.createTitledBorder("Student Form"));

    JLabel nameLabel=new JLabel("Name: ");
    nameLabel.setBounds(20, 40, 150, 25);
    JTextField nameTextField=new JTextField();
    nameTextField.setBounds(20, 80, 200, 25);

    JLabel addressLabel=new JLabel("Address: ");
    addressLabel.setBounds(20, 120, 150, 25);
    JTextField  addressTextField=new JTextField();
    addressTextField.setBounds(20, 160, 200, 25);

    
    JLabel gender=new JLabel("Gender");
    gender.setBounds(20, 200, 150, 25);
    JRadioButton male=new JRadioButton("Male");
    male.setBounds(20, 240,100, 20);
    JRadioButton female=new JRadioButton("Female");
    female.setBounds(125, 240, 100, 20);
    JRadioButton others=new JRadioButton("Others");
    others.setBounds(230, 240, 100, 20);

    JLabel password=new JLabel("Passord: ");
    password.setBounds(20,280,150,25);
    JTextField passwordTextField=new JTextField();
    passwordTextField.setBounds(20, 320, 200, 25);

    ButtonGroup bg= new ButtonGroup();
    bg.add(male);
    bg.add(female);
    bg.add(others);

    JButton submit=new JButton("Submit");
    submit.setBounds(80,380,150,30);

    //Add all components to formPanel
    formPanel.add(nameLabel);
    formPanel.add(nameTextField);
    formPanel.add(addressLabel);
    formPanel.add(addressTextField);
    formPanel.add(gender);
    formPanel.add(male);
    formPanel.add(female);
    formPanel.add(others);
    formPanel.add(password);
    formPanel.add(passwordTextField);
    formPanel.add(submit);


    //RIGHT PANEL(DISPLAY)
    JPanel displayPanel=new JPanel(null);
    displayPanel.setBounds(350, 0, 450, 500);
    displayPanel.setBorder(BorderFactory.createTitledBorder("Search Student"));

    JLabel searchName=new JLabel("Student Name: ");
    searchName.setBounds(20, 20, 200, 25);
    JTextField searchTextfield=new JTextField();
    searchTextfield.setBounds(20, 60, 200, 25);

    JButton search=new JButton("Search");
    search.setBounds(260, 60, 120, 25);

    JLabel output=new JLabel("Output");
    output.setBounds(200, 100, 150, 25);

    JTextArea displayArea=new JTextArea();
    displayArea.setBounds(20,120,400,310);

    displayPanel.add(searchName);
    displayPanel.add(searchTextfield);
    displayPanel.add(search);
    displayPanel.add(output);
    displayPanel.add(displayArea);

    frame.add(formPanel);
    frame.add(displayPanel);
    frame.setVisible(true);
}
 
}
