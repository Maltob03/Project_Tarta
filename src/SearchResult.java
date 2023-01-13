import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SearchResult extends JFrame {
  static String id;
  static String pw;
  boolean isPresented;
    public SearchResult(){
        // font
        Font f = new Font ("TYPE1_FONT", Font.BOLD, 30);
        
        
        //WhiteSpace behind
        JPanel login = new JPanel (); login.setLayout (null);
        login.setSize (400,1600);
        login.setBackground (new Color (255,255,255, 220));
        login.setBounds (50,50, 700,600);


        JLabel name = new JLabel ("Welcome to Project Tarta");
        //name.setBounds(1,25,1,1);
        name.setFont(f);
        name.setForeground(Color.WHITE);
        login.add(name);


        
        
        
        
        
        
        
        
        
        JPanel panelForButton = new JPanel(new FlowLayout(FlowLayout.LEFT));

        // Create the toolbar
        JToolBar toolbar = new JToolBar();
        toolbar.setFloatable(false);

        // Add buttons or other components to the toolbar
        JButton button1 = new JButton("Search");
        button1.setPreferredSize(new Dimension(60, 40));
        button1.setBorder(BorderFactory.createEmptyBorder());
        panelForButton.add(button1);

        //button1.setBounds(0,0,150,75);
        //toolbar.add(button1);
        JButton button2 = new JButton("Insert");
        button2.setPreferredSize(new Dimension(60, 40));
        button2.setBorder(BorderFactory.createEmptyBorder());
        //toolbar.add(button2);
        panelForButton.add(button2);
        JButton button3 = new JButton("Statistics");
        button3.setPreferredSize(new Dimension(60, 40));
        button3.setBorder(BorderFactory.createEmptyBorder());
        //toolbar.add(button3);
        panelForButton.add(button3);

        toolbar.add(panelForButton);
        //Switch tab Insert Button
        button2.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            setVisible(false);
            new SearchResult().setVisible(true);
          }
        });

          
        //frame
        setSize(800,800) ;
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        //Image
        ImageIcon background_image = new ImageIcon("bg.jpg");
        JLabel background = new JLabel ("", background_image, JLabel.CENTER);
        background.add(login);
        background. setBounds (0,0,800, 800);
        background.add(login);
        setLayout(new BorderLayout());
        add(toolbar, BorderLayout.NORTH);
        add(background, BorderLayout.CENTER);
        


        setVisible(true);
    }

}


