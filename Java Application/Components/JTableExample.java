import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
public class JTableExample extends JFrame{
    public JTableExample()
    {
        setTitle("Jtable Example");
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[][] data={
            {"Daenish Arghali","10","Bca"},
            {"Aayush","1","Bca"}
        };

        String[] columnsNames={"Name","Roll no","Department"};

        JTable table=new JTable(data,columnsNames);
        JScrollPane tableScrollPane=new JScrollPane(table);

        JTextArea textArea=new JTextArea("Type any thing here man!");
        JScrollPane textScrollPane=new JScrollPane(textArea);

        
        add(tableScrollPane,BorderLayout.CENTER);
        add(textScrollPane,BorderLayout.SOUTH);
        setVisible(true);
    }
    public static void main(String[] args) {
        new JTableExample();
    }
}
