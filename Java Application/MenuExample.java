import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuExample {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Menu Example Java");
        frame.setSize(600,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Menu bar
        JMenuBar menuBar=new JMenuBar();

        JMenu fileMenu=new JMenu("File");
        JMenuItem openItem=new JMenuItem("Open Item");
        JMenuItem saveItem=new JMenuItem("Save");
       
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        menuBar.add(fileMenu);


        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}
