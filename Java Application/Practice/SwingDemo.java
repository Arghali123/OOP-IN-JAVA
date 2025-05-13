import javax.swing.*;
import java.awt.event.*;
public class SwingDemo {
    SwingDemo()
    {
      JFrame jFrame=new JFrame("This is a simple  JFrame App");
      jFrame.setSize(400,300);
      jFrame.setLocationRelativeTo(null);
      jFrame.getContentPane().setLayout(null);

      JLabel lbl1=new JLabel("First Number: ");
      lbl1.setBounds(20,10,100,15);
      jFrame.add(lbl1);

      JTextField txt1=new JTextField();
      txt1.setBounds(120, 10, 120, 20);
      jFrame.add(txt1);

      JLabel lbl2=new JLabel("Second Number: ");
      lbl2.setBounds(20, 50, 100, 15);
      jFrame.add(lbl2);

      JTextField txt2=new JTextField();
      txt2.setBounds(120, 50, 120, 20);
      jFrame.add(txt2);

      JLabel lbl3=new JLabel("Result: ");
      lbl3.setBounds(20,80,100,30);
      jFrame.add(lbl3);

      JButton btn=new JButton("Calculate");
      btn.setBounds(100, 120, 100, 30);
      jFrame.add(btn);
      jFrame.setVisible(true);

      btn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
            String first1=txt1.getText().toString();
            String first2=txt2.getText().toString();
            int a,b,c;
            a=Integer.parseInt(first1);
            b=Integer.parseInt(first2);
            c=a+b;
            lbl3.setText("Result: "+c);

        }
      });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
                new SwingDemo();
            }
        });
    }
}
