import javax.swing.*;
import java.awt.*;

public class ReinserimentoPanel1 extends JPanel {
  static JTextField research;
    public ReinserimentoPanel1(MainFrame frame) {

        Controller nc = new Controller();

        setLayout(new BorderLayout());
        Font f = new Font ("TYPE1_FONT", Font.BOLD, 30);

        ImageIcon background_image = new ImageIcon("bg.jpg");
        JLabel background = new JLabel("", background_image, JLabel.CENTER);
        JPanel base = new JPanel();
        add(base);
        base.add(background);

        JLabel name = new JLabel ("Inserisci Targhetta");
        name.setBounds(270, 200, 300, 50);
        name.setFont(f);
        name.setForeground(Color.WHITE);
        background.add(name);

        research = new JTextField("");
        research.setBounds (240, 380, 300, 50);
        research.setBackground(new Color(190, 208, 244));
        research.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,8,0,0));
        background.add(research);
/* 
        Button login_button = new Button ("Go");
        login_button.setBounds (330,500,100,50);
        login_button.setBackground (new Color (255,255,255));
        background.add(login_button);

        login_button.addActionListener(e -> {
          nc.cercaTarghetta(research.getText());

          
      });
      */
    }
}