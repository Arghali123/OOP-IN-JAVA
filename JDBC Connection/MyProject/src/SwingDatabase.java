import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class SwingDatabase {
    Connection connection;
    Statement statement;

    //Creating Connection
    void getConnection()
    {
        try
        {
          Class.forName("com.mysql.jdbc.Driver");
          connection=DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/MyProject","root",""
          );
          statement=connection.createStatement();
        }catch(Exception e)
        {
         JOptionPane.showMessageDialog(null, e);
        }
    }

    SwingDatabase()
    {
        getConnection();
        JFrame jFrame=new JFrame("Jframe App");
        jFrame.setSize(600, 250);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.getContentPane().setLayout(null);

        JLabel lbl1=new JLabel("Student Id: ");
        lbl1.setBounds(20, 12, 100 ,10);
        jFrame.add(lbl1);

        JTextField txt1=new JTextField();
        txt1.setBounds(120,10,150,20);
        jFrame.add(txt1);

        JLabel lbl2=new JLabel("Student Name: ");
        lbl2.setBounds(20, 55, 100, 10);
        jFrame.add(lbl2);

        JTextField txt2=new JTextField();
        txt2.setBounds(120, 50, 150, 20);
        jFrame.add(txt2);

        JLabel lbl3=new JLabel("Student Address: ");
        lbl3.setBounds(20, 85, 120, 30);
        jFrame.add(lbl3);

        JTextField txt3=new JTextField();
        txt3.setBounds(120, 90, 150, 20);
        jFrame.add(txt3);

        JButton insert=new JButton("Insert");
        insert.setBounds(10, 140, 80, 20);
        jFrame.add(insert);

        JButton update=new JButton("Update");
        update.setBounds(100, 140, 80, 20);
        jFrame.add(update);

        JButton delete=new JButton("Delete");
        delete.setBounds(200, 140, 80, 20);
        jFrame.add(delete);


        JButton view=new JButton("View");
        view.setBounds(300, 140, 80, 20);
        jFrame.add(view);

        jFrame.setVisible(true);
    }
    public static void main(String[] args) {
        
       
        SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
                CreateDB db=new CreateDB();
                new SwingDatabase();
            }
        });
    }
}