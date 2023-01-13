import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends JFrame {
  static String id;
  static String pw;
  boolean isPresented;
    public LoginFrame(){
        // font
        Font f = new Font ("TYPE1_FONT", Font.BOLD, 30);
        //header
        JPanel heading;
        heading = new JPanel ();
        heading.setBackground (new Color (0,0,0,0));
        heading.setBounds (0,250,800,50);
        JLabel name = new JLabel ("Welcome to Project Tarta");
        //name.setBounds(1,25,1,1);
        name.setFont(f);
        name.setForeground(Color.WHITE);
        heading.add(name);
        
        //Login Panel
        JPanel login = new JPanel (); login.setLayout (null);
        login.setSize (400,350);
        login.setBackground (new Color (0,0,0, 0));
        login. setBounds (200,350, 400,350);

        //username
        JTextField username = new JTextField("");
        
        /* 
        username.addFocusListener(new FocusListener() {
          public void focusGained(FocusEvent e) {
              username.setText("");
          }
      
          public void focusLost(FocusEvent e) {
          }
      });
      */

        username.setBounds (50,50,300,50);
        username.setBackground(new Color (190,208,244));
        username.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        login.add(username);

        //Password
        JTextField password = new JTextField("");
        password.setBounds (50,150,300,50);
        password.setBackground(new Color (190,208,244));
        password.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        login.add(password);



        //Button
        Button login_button = new Button ("Login");
        login_button.setBounds (150,250,100,50);
        login_button.setBackground (new Color (255,255,255));
        login.add(login_button);


        //Button to go into the SearchFrame
        login_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              // Recupera l'ID e password inserito dall'utente
              id = username.getText();
              pw = password.getText();
              
              /*
              if (id.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Inserisci un ID", "Errore", JOptionPane.ERROR_MESSAGE);
                return;
              }
              */
              if (id == "matteo" && pw == "segreto"){
                isPresented=true;

              }

              if(isPresented = true){
                setVisible(false);
                new SearchFrame().setVisible(true);
              }
              
              

              //QUERY THAT PASS THE QUERY TO THE DB METHOD
              /*
              final String QUERY = "SELECT id_tartaruga, nome, targhetta FROM tartaruga WHERE tartaruga.id_tartaruga = " + id ;
              
              db.cercaTartarugaIdNomeTarghetta(id, QUERY);
              */
            }
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


