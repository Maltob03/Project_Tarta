
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends JFrame {
  
    public LoginFrame(){

      Controller nc = new Controller();
        // font
        Font f = new Font ("TYPE1_FONT", Font.BOLD, 30);
        //header
        JPanel heading;
        heading = new JPanel ();
        heading.setBackground (new Color (0,0,0,0));
        heading.setBounds (0,260,800,50);
        JLabel name = new JLabel ("Welcome to Project Tarta");
        //name.setBounds(1,25,1,1);
        name.setFont(f);
        name.setForeground(Color.WHITE);
        heading.add(name);
        
        //Login Panel
        JPanel login = new JPanel ();
        login.setLayout (null);
        login.setSize (400,350);
        login.setBackground (new Color (0,0,0, 0));
        login.setBounds (200,350, 400,350);

        //username
        JTextField username = new JTextField("matteo");
        
       
        
        username.addFocusListener(new FocusListener() {
          public void focusGained(FocusEvent e) {
              username.setText("");
          }
      
          public void focusLost(FocusEvent e) {
          }
      });
      

        username.setBounds (50,50,300,50);
        username.setBackground(new Color (190,208,244));
        username.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,8,0,0));
        login.add(username);

        

        //Button
        Button login_button = new Button ("Login");
        login_button.setBounds (150,250,100,50);
        login_button.setBackground (new Color (255,255,255));
        login.add(login_button);


        login_button.addActionListener(e -> {
          nc.authenticationPerform(username.getText(), this);
      });
          
        //frame
        setSize(800,800) ;
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        //Image
        ImageIcon background_image = new ImageIcon("bg.jpg");
        JLabel background = new JLabel ("", background_image, JLabel.CENTER);
        background.add(login);
        background.add(heading);
        background. setBounds (0,0,800, 800);
        getContentPane().add(background);
        


        setVisible(true);
    }

}