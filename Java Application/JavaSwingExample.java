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
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;



public class JavaSwingExample 
{
    JavaSwingExample()
    {
      JFrame jFrame=new JFrame("This frame contains almost all elements of Swing");
      jFrame.setSize(600,500);
      jFrame.setLocationRelativeTo(null);
      jFrame.setLayout(null);
      jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JLabel lblName=new JLabel("Name: ");
      lblName.setBounds(30, 12, 150, 10);
      jFrame.add(lblName);

      JTextField txtName=new JTextField();
      txtName.setBounds(100,10,150,20);
      jFrame.add(txtName);

      JLabel lblAddress=new JLabel("Address: ");
      lblAddress.setBounds(300, 12, 150, 10);
      jFrame.add(lblAddress);

      JTextField txtAddress=new JTextField();
      txtAddress.setBounds(370, 10, 150, 20);
      jFrame.add(txtAddress);

      JLabel lblClass=new JLabel("Class: ");
      lblClass.setBounds(30, 60, 150, 10);
      jFrame.add(lblClass);

      JComboBox<String> cmbClass=new JComboBox<String>();
      cmbClass.addItem("Select Class");
      cmbClass.addItem("BCA");
      cmbClass.addItem("BBA");
      cmbClass.addItem("B-TECH");
      cmbClass.addItem("CSIT");
      cmbClass.setBounds(100, 55, 150, 20);
      jFrame.add(cmbClass);

      JLabel lblSex=new JLabel("Gender");
      lblSex.setBounds(300, 60, 80, 10);
      jFrame.add(lblSex);

      ButtonGroup group1=new ButtonGroup();
      JRadioButton chkMale=new JRadioButton("Male",true);
      chkMale.setBounds(360, 55, 70, 20);
      group1.add(chkMale);
      jFrame.add(chkMale);

      JRadioButton chkFemale=new JRadioButton("Female");
      chkFemale.setBounds(430,55,70,20);
      group1.add(chkFemale);
      jFrame.add(chkFemale);

      JLabel lblShift=new JLabel("Shift: ");
      lblShift.setBounds(30, 100, 80, 10);
      jFrame.add(lblShift);

       String[] shift = {"one", "two", "three", "four"};
      JList<String> myList = new JList<>(shift);
      myList.setBounds(100, 100,100, 60);
      jFrame.add(myList);

      JLabel lblRemark=new JLabel("Remark: ");
      lblRemark.setBounds(300, 100, 80, 10);
      jFrame.add(lblRemark);

      JTextArea textArea=new JTextArea();
      textArea.setBounds(400, 100, 150, 100);
      jFrame.add(textArea);

      String data[][]={
                        {"101","Daenish","10000"},
                        {"102","Nirah","2000"},
                        {"103","Dinesh","13000"}
                      };
     String[] column={"ID","Name","Salary"};
     JTable jt=new JTable(data,column);
     JScrollPane sp=new JScrollPane(jt);
     sp.setBounds(30,200,250,60);   
     jFrame.add(sp);

     JButton click=new JButton("Submit");
     click.setBounds(200, 300, 100, 30);
     jFrame.add(click);

     //Creating menu
     JMenuBar mb=new JMenuBar();
     mb.setBounds(30,350,200,20);

     JMenu menu1=new JMenu("File");
     JMenuItem item1,item3;
     item1=new JMenuItem("New");
     JMenu item2=new JMenu("Open");
     JMenuItem i1,i2;
     i1=new JMenuItem("Open project");
     i2=new JMenuItem("Open File");
     item2.add(i1);
     item2.add(i2);
     item3=new JMenuItem("Close");
     menu1.add(item1);
     menu1.add(item2);
     menu1.add(item3);
     mb.add(menu1);

     JMenu menu2=new JMenu("Edit");
     JMenuItem it1,it2;
     it1=new JMenuItem("Copy");
     it2=new JMenuItem("Paste");
     menu2.add(it1);
     menu2.add(it2);
     mb.add(menu2);
     jFrame.add(mb);

     click.addActionListener(new ActionListener()
     {
       public void actionPerformed(ActionEvent e)
       {
         String name=txtName.getText();
         String clas=cmbClass.getSelectedItem().toString();
         String gender="";
         if(chkMale.isSelected())
         {
            gender=chkMale.getText();
         }else
         {
            gender=chkFemale.getText();
         }
         String shift=myList.getSelectedValuesList().toString();
         String remark=textArea.getText();
         JOptionPane.showMessageDialog(null,"Remarks: "+remark);
       }
     });


     cmbClass.addItemListener(new ItemListener() 
     {
        public void itemStateChanged(ItemEvent e)
        {
            if(e.getStateChange()==ItemEvent.SELECTED)
            {
                JOptionPane.showMessageDialog(null, cmbClass.getSelectedItem().toString());
            }
        }
     });

     item1.addActionListener(new ActionListener() 
     {
        public void actionPerformed(ActionEvent e)
        {
            JOptionPane.showMessageDialog(null, item1.getText().toString()+"Clicked!!");
        }
     });
      jFrame.setVisible(true);

    }

    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new Runnable() 
        {
            public void run()
            {
                new JavaSwingExample();
            }
        });
    }
}
