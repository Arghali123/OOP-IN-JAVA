import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.SwingUtilities;

public class Test {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create the main JFrame
            JFrame mainFrame = new JFrame("JDesktopPane Example");
            mainFrame.setSize(600, 400);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create the JDesktopPane
            JDesktopPane jd = new JDesktopPane();

            // Create internal frames
            JInternalFrame frame1 = new JInternalFrame("Internal frame1", true, true, true, true);
            frame1.setBounds(20, 20, 200, 100);
            frame1.setVisible(true);

            JInternalFrame frame2 = new JInternalFrame("Internal frame2", true, true, true, true);
            frame2.setBounds(100, 80, 200, 100);
            frame2.setVisible(true);

            JInternalFrame frame3 = new JInternalFrame("Internal frame3", true, true, true, true);
            frame3.setBounds(180, 140, 200, 100);
            frame3.setVisible(true);

            // Add internal frames to desktop pane
            jd.add(frame1);
            jd.add(frame2);
            jd.add(frame3);

            // Add desktop pane to the main frame
            mainFrame.add(jd);

            // Make main frame visible
            mainFrame.setVisible(true);
        });
    }
}
