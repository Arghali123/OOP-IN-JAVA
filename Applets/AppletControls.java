import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletControls extends Applet{
    TextField textField;
    Button button;

    public void init()
    {
        textField=new TextField(20);
        button=new Button("Click me");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                textField.setText("Button clicked");
            }
        });
    }
}
