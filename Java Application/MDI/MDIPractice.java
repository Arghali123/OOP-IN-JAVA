package MDI;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JInternalFrame;
import javax.swing.SwingUtilities;

public class MDIPractice extends JFrame{
    private JDesktopPane desktopPane;
 
    public MDIPractice()
    {
      setTitle("MDI example using JDesktopPane and JInternal Frame");
      setSize(600,500);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      //Create a desktop pane
      desktopPane=new JDesktopPane();
      add(desktopPane);

      //Create a menubar
      JMenuBar menuBar=new JMenuBar();
      setJMenuBar(menuBar);

      //add a menu
      JMenu menu=new JMenu("File");
      menuBar.add(menu);

      //add a menu item to create a new internal frame
      JMenuItem newItem=new JMenuItem("New window");
      menu.add(newItem);
      newItem.addActionListener(e->createInternalFrame());

      JMenuItem exitItem=new JMenuItem("Exit");
      menu.add(exitItem);
      exitItem.addActionListener(e->System.exit(0));

    }

    private void createInternalFrame()
    {
        JInternalFrame internalFrame=new JInternalFrame("Internal Frame",true,true,true,true);
        internalFrame.setSize(300,400);
        internalFrame.setVisible(true);

        desktopPane.add(internalFrame);
        try
        {
            internalFrame.setSelected(true);
        }catch(java.beans.PropertyVetoException e)
        {
            e.printStackTrace();
        }
    }
 
    public static void main(String[] args) {
        new MDIPractice().setVisible(true);
    }
}