import java.awt.event.*;
import javax.swing.*;

public class SwingExample {

    SwingExample()
    {
        JFrame jFrame=new JFrame("This app contains almost all elements of Swing");
        jFrame.setSize(600, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(null);
        
        //Name
        JLabel lblName=new JLabel("Name: ");
        lblName.setBounds(30, 12, 150, 10);
        jFrame.add(lblName);
        
        JTextField txtName=new JTextField();
        txtName.setBounds(100, 10, 150, 20);
        jFrame.add(txtName);
        
        //Address
        JLabel lblAddress=new JLabel("Address: ");
        lblAddress.setBounds(300, 12, 150, 10);
        jFrame.add(lblAddress);
        
        JTextField txtAddress=new JTextField();
        txtAddress.setBounds(370, 10, 150, 20);
        jFrame.add(txtAddress);
        
        
        //Class
        JLabel lblClass=new JLabel("Class: ");
        lblClass.setBounds(30, 60, 150, 10);
        jFrame.add(lblClass);
        
        JComboBox<String> cmbClass=new JComboBox<>();
        cmbClass.addItem("Select Class");
        cmbClass.addItem("BCA");
        cmbClass.addItem("BBA");
        cmbClass.addItem("MCA");
        cmbClass.addItem("MBA");
        /*
        String[] class={"BCA","BBA"};
        JComboBox cmbClass=new JComboBox(class);
        */
        cmbClass.setBounds(100, 55, 150, 20);
        //cmbClass.setEdible(true);
        jFrame.add(cmbClass);
        
        
        //Gender
        JLabel lblSex=new JLabel("Gender: ");
        lblSex.setBounds(300, 60, 80, 10);
        jFrame.add(lblSex);
        
        ButtonGroup group1=new ButtonGroup();
        JRadioButton chkMale=new JRadioButton("Male",true);
        chkMale.setBounds(360, 55, 70, 20);
        jFrame.add(chkMale);
        group1.add(chkMale);
        
        JRadioButton chkFemale=new JRadioButton("Female");
        chkFemale.setBounds(430, 55, 70, 20);
        jFrame.add(chkFemale);
        group1.add(chkFemale);
        
        
        //Shift
        JLabel lblShift=new JLabel("Shift: ");
        lblShift.setBounds(30, 100, 80, 10);
        jFrame.add(lblShift);
        
        String[] shift={"Morning","Day","Evening"};
        JList<String> list1=new JList<>(shift);
        list1.setBounds(100, 100, 100, 60);
        jFrame.add(list1);

        //Remark
        JLabel lblremark=new JLabel("Remark: ");
        lblremark.setBounds(300, 100, 80, 10);
        jFrame.add(lblremark);

        JTextArea textArea=new JTextArea();
        textArea.setBounds(400, 100, 150, 100);
        jFrame.add(textArea);

        String data[][]={
            {"101","Daenish","1000000"},
            {"102","Kamal","100000"},
            {"103","Niraj","1000"},
            {"104","Dinesh","2000000"},
            {"105","Ashik","900000"}
        };
        String column[]={"ID","NAME","SALARY"};
        JTable jt=new JTable(data,column);
        JScrollPane sp=new JScrollPane(jt);
        sp.setBounds(30, 200, 250, 80);
        jFrame.add(sp);

        JButton click=new JButton("Submit");
        click.setBounds(200, 300, 100, 30);
        jFrame.add(click);

        //Creating menu
        JMenuBar mb=new JMenuBar();
        mb.setBounds(30, 350, 200, 20);
        JMenu menu1=new JMenu("File");
        JMenuItem item1,item3;
        item1=new JMenuItem("New");
        JMenu item2=new JMenu("Open");
        JMenuItem i1,i2;
        i1=new JMenuItem("Open Project");
        i2=new JMenuItem("Open File");
        item2.add(i1);
        item2.add(i2);
        item3=new JMenuItem("Close");
        menu1.add(item1);
        menu1.add(item2);
        menu1.add(item3);
        
        JMenu menu2=new JMenu("Edit");
        JMenuItem it1,it2;
        it1=new JMenuItem("Copy");
        it2=new JMenuItem("Paste");
        menu2.add(it1);
        menu2.add(it2);
        
        mb.add(menu1);
        mb.add(menu2);
        jFrame.add(mb);
        
        click.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
             //get textfield
             String name=txtName.getText();

             //get combo
             String clas=cmbClass.getSelectedItem().toString();

             //get radio + checkbox(same process)
             String gender="";
             if(chkMale.isSelected())
             {
                gender=chkMale.getText();
             }else
             {
                gender=chkFemale.getText();
             }

             //get list
             String shift=list1.getSelectedValuesList().toString();

             //get text area
             String remark=textArea.getText();
             JOptionPane.showMessageDialog(null, "Remark: "+remark);
            }

        });

        //can use action listener also
     cmbClass.addItemListener(new ItemListener() {
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange() == ItemEvent.SELECTED) {
            JOptionPane.showMessageDialog(null, cmbClass.getSelectedItem().toString());
        }
    }
});


        //listener on menu item can use item listener also
        item1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                JOptionPane.showMessageDialog(null, item1.getText().toString()+"Clicked!");
            }
        });

        jFrame.setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
                new SwingExample();
            }
        });
    }
}

