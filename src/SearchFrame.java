import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SearchFrame extends JFrame {
  String id;
  boolean isPresented;
  private ToolBar toolBar;
    public SearchFrame(){

        toolBar = new ToolBar();
        add(toolBar);

        Database db = new Database();
        
        JFrame frame = new JFrame();

        // font
        Font f = new Font ("TYPE1_FONT", Font.BOLD, 30);


        
        
        //header
        JPanel heading;
        heading = new JPanel ();
        heading.setBackground (new Color (0,0,0,0));
        heading.setBounds (0,250,800,50);
        JLabel name = new JLabel ("Find your turtle");
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
        JTextField username = new JTextField("m");
        username.setBounds (50,50,300,50);
        username.setBackground(new Color (190,208,244));
        username.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        login.add(username);

        //TopBar
        



        //Button
        Button login_button = new Button ("Go");
        login_button.setBounds (160,250,100,50);
        login_button.setBackground (new Color (255,255,255));
        login.add(login_button);



        login_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              // Recupera l'ID e password inserito dall'utente
              id = username.getText();
              if (id.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Inserisci un ID", "Errore", JOptionPane.ERROR_MESSAGE);
                return;
              }
              
              

              //QUERY THAT PASS THE QUERY TO THE DB METHOD
              final String QUERY = "SELECT id_tartaruga, nome, targhetta FROM tartaruga WHERE tartaruga.id_tartaruga = " + id ;
              
              db.cercaTartarugaIdNomeTarghetta(id, QUERY);
      
              
      
      
            }
      
            
          });

        


        //frame
        setSize(800,800) ;
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        //Image
        /*
        ImageIcon background_image = new ImageIcon("bg.jpg");
        JLabel background = new JLabel ("", background_image, JLabel.CENTER);
        background.add(login);
        background.add(heading);
        background. setBounds (0,0,800, 800);
        add(background);
        */
        


        


        setVisible(true);
    }

}