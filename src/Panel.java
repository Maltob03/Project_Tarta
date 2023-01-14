import java.awt.*;
import javax.swing.*;


public class Panel {

    Panel(){
        JFrame frame = new JFrame();

        // Create the toolbar
        JToolBar toolbar = new JToolBar();
        toolbar.setFloatable(false);

        // Add buttons or other components to the toolbar
        JButton button1 = new JButton("Button 1");
        toolbar.add(button1);
        JButton button2 = new JButton("Button 2");
        toolbar.add(button2);

        // Add the toolbar to the frame
        frame.add(toolbar, BorderLayout.NORTH);

        // Set the size and make the frame visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

}