package MDI;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

public class MDIExample extends JFrame {
    private JDesktopPane desktopPane;

    public MDIExample() {
        setTitle("MDI Example using Jdesktop pane and JInternal frame");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a desktop pane
        desktopPane = new JDesktopPane();
        add(desktopPane);

        // create a menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // add a menu
        JMenu menu = new JMenu("File");
        menuBar.add(menu);

        // add a menu item to create a new internal frame
        JMenuItem newItem = new JMenuItem("New Window");
        newItem.addActionListener(e -> createInternalFrame());
        menu.add(newItem);

        // Exit option
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));
        menu.add(exitItem);

    }

    private void createInternalFrame() {
        JInternalFrame internalFrame = new JInternalFrame(
                "Internal Frame", true, true, true, true

        );
        internalFrame.setSize(300, 200);
        internalFrame.setVisible(true);

        // add it to desktop pane
        desktopPane.add(internalFrame);
        try {
            internalFrame.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MDIExample().setVisible(true);
        });

    }
}
//Jtable (display data in tabular form)
//Jtextarea
