import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.MatteBorder;

public class SearchFrame extends JFrame {
  String id;
  boolean isPresented;
  JToolBar toolbar = new JToolBar();
    public SearchFrame(){

        Database db = new Database();
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
        JTextField username = new JTextField("");
        username.setBounds (50,50,300,50);
        username.setBackground(new Color (190,208,244));
        username.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        login.add(username);

        



        //Button
        Button login_button = new Button ("Go");
        login_button.setBounds (154,151,100,50);
        login_button.setBackground (new Color (255,255,255));
        login.add(login_button);



        login_button.addActionListener(new ActionListener() {
            private Component frame;

            @Override
            public void actionPerformed(ActionEvent e) {
              // Recupera l'ID e password inserito dall'utente
              id = username.getText();
              if (id.isEmpty()) {
                JOptionPane.showMessageDialog(this.frame, "Inserisci un ID", "Errore", JOptionPane.ERROR_MESSAGE);
                return;
              }
              
              

              //QUERY THAT PASS THE QUERY TO THE DB METHOD
              final String QUERY = "SELECT id_tartaruga, nome, targhetta FROM tartaruga WHERE tartaruga.id_tartaruga = " + id ;
              
              db.cercaTartarugaIdNomeTarghetta(id, QUERY);
      
              
      
      
            }
      
            
          });

        //Panel for button
        JPanel panelForButton = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        
        // Create the toolbar
        JToolBar toolbar = new JToolBar();
        toolbar.setFloatable(false);

        
        // Add buttons or other components to the toolbar
        JButton button1 = new JButton("Search");
        button1.setBackground(new Color(240, 240, 240));
        button1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        button1.setPreferredSize(new Dimension(60, 30));
        button1.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.textHighlight));
        panelForButton.add(button1);

        //button1.setBounds(0,0,150,75);
        //toolbar.add(button1);
        JButton button2 = new JButton("Insert");
        button2.setBackground(new Color(240, 240, 240));
        button2.setPreferredSize(new Dimension(60, 30));
        button2.setBorder(null);
        //toolbar.add(button2);
        panelForButton.add(button2);
        JButton button3 = new JButton("Statistics");
        button3.setBackground(new Color(240, 240, 240));
        button3.setPreferredSize(new Dimension(60, 30));
        button3.setBorder(null);
        //toolbar.add(button3);
        panelForButton.add(button3);

        toolbar.add(panelForButton);
        //Switch tab Insert Button
        button2.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            setVisible(false);
            new InsertFrame().setVisible(true);
          }
        });
        

        


        //frame
        setSize(800,800) ;
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);

        //Image
        ImageIcon background_image = new ImageIcon("bg.jpg");
        JLabel background = new JLabel ("", background_image, JLabel.CENTER);
        background.add(login);
        background.add(heading);
        background.setBounds(0,0,800, 800);


        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(toolbar, BorderLayout.NORTH);
        getContentPane().add(background, BorderLayout.CENTER);
        


        


        setVisible(true);
    }

}