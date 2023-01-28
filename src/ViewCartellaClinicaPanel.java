import javax.swing.*;
import java.awt.*;

public class ViewCartellaClinicaPanel extends JPanel { 
    String specie;
    int larghezza;
    int lunghezza;
    int peso;
    String luogo;
    String data;

    public ViewCartellaClinicaPanel(String specie, int larghezza, int lunghezza, int peso, String luogo, String data) {

        setLayout(new BorderLayout());

        ImageIcon background_image = new ImageIcon("bg.jpg");
        JLabel background = new JLabel("", background_image, JLabel.CENTER);
        add(background, BorderLayout.CENTER);

        JPanel login = new JPanel();
        login.setLayout(null);
        login.setSize(400, 1600);
        login.setBackground(new Color(255, 255, 255, 180));
        login.setBounds(50, 50, 700, 550);
        
        background.add(login);

        JLabel insertTitle = new JLabel("Inserisci una tartaruga");
        insertTitle.setFont(new Font("Dialog", Font.BOLD, 24));
        insertTitle.setBounds(200, -31, 327, 154);
        login.add(insertTitle);

        JLabel nomeLabel = new JLabel("Specie : " + specie);
        nomeLabel.setFont(new Font("Dialog", Font.BOLD, 24));
        nomeLabel.setBounds(70, 150, 327, 154);
        login.add(nomeLabel);

        /* */
        JLabel larghezzaLabel = new JLabel("Larghezza : " + String.valueOf(larghezza));
        larghezzaLabel.setFont(new Font("Dialog", Font.BOLD, 24));
        larghezzaLabel.setBounds(70, 200, 327, 154);
        login.add(larghezzaLabel);

        JLabel lunghezzLabel = new JLabel("Lunghezza : " + String.valueOf(lunghezza));
        lunghezzLabel.setFont(new Font("Dialog", Font.BOLD, 24));
        lunghezzLabel.setBounds(70, 250, 327, 154);
        login.add(lunghezzLabel);

        JLabel vascaLabel = new JLabel("Peso : " + String.valueOf(peso));
        vascaLabel.setFont(new Font("Dialog", Font.BOLD, 24));
        vascaLabel.setBounds(70, 300, 327, 154);
        login.add(vascaLabel);

        JLabel luogoLabel = new JLabel("Luogo : " + luogo);
        luogoLabel.setFont(new Font("Dialog", Font.BOLD, 24));
        luogoLabel.setBounds(400, 150, 327, 154);
        login.add(luogoLabel);

        JLabel dataLabel = new JLabel("Data : " + data);
        dataLabel.setFont(new Font("Dialog", Font.BOLD, 24));
        dataLabel.setBounds(400, 200, 327, 154);
        login.add(dataLabel);
        
/* 
        // Button
        Button back_button = new Button("Back");
        back_button.setBounds(300, 500, 100, 30);
        back_button.setBackground(new Color(18, 49, 149));
        login.add(back_button);


        back_button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              setVisible(false);
              //new SearchFrame().setVisible(true);
            }
          });
*/ 
    }
}
