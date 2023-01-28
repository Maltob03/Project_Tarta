import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

public class SearchPanel extends JPanel {
    String id;

    public SearchPanel() {

        setLayout(new BorderLayout());
        Font f = new Font ("TYPE1_FONT", Font.BOLD, 30);
        Database db = new Database();

        ImageIcon background_image = new ImageIcon("bg.jpg");
        JLabel background = new JLabel("", background_image, JLabel.CENTER);
        JPanel base = new JPanel();
        add(base);
        base.add(background);

        JLabel name = new JLabel ("Find your turtle");
        name.setBounds(270, 200, 300, 50);
        name.setFont(f);
        name.setForeground(Color.WHITE);
        background.add(name);

        JTextField research = new JTextField("");
        research.setBounds (240, 380, 300, 50);
        research.setBackground(new Color(190, 208, 244));
        research.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,8,0,0));
        background.add(research);

        Button login_button = new Button ("Go");
        login_button.setBounds (330,500,100,50);
        login_button.setBackground (new Color (255,255,255));
        background.add(login_button);



        login_button.addActionListener(new ActionListener() {
            private Component frame;

            @Override
            public void actionPerformed(ActionEvent e) {
              // Recupera l'ID e password inserito dall'utente
              id = research.getText();
              if (id.isEmpty()) {
                JOptionPane.showMessageDialog(this.frame, "Inserisci un ID", "Errore", JOptionPane.ERROR_MESSAGE);
                return;
              }
              
              

              //QUERY THAT PASS THE QUERY TO THE DB METHOD
              
              
              db.cercaTartaruga(id);
              
      
              
      
      
            }
      
            
          });
    }
}
