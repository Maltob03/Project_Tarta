import javax.swing.*;
import java.awt.*;

public class ViewStatoSalutePanel extends JPanel { 
    int testa;
    int occhi;
    int naso;
    int becco;
    int collo;
    int pinne;
    int coda;

    public ViewStatoSalutePanel(int testa, int occhi, int naso, int becco, int collo, int pinne, int coda) {

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

        JLabel insertTitle = new JLabel("Stato di Salute");
        insertTitle.setFont(new Font("Dialog", Font.BOLD, 24));
        insertTitle.setBounds(250, -31, 327, 154);
        login.add(insertTitle);

        JLabel testaLabel = new JLabel("Testa : " + String.valueOf(testa));
        testaLabel.setFont(new Font("Dialog", Font.BOLD, 24));
        testaLabel.setBounds(70, 104, 327, 154);
        login.add(testaLabel);

        /* */
        JLabel occhiLabel = new JLabel("Occhi : " + String.valueOf(occhi));
        occhiLabel.setFont(new Font("Dialog", Font.BOLD, 24));
        occhiLabel.setBounds(70, 154, 327, 154);
        login.add(occhiLabel);

        JLabel nasoLabel = new JLabel("Naso : " + String.valueOf(naso));
        nasoLabel.setFont(new Font("Dialog", Font.BOLD, 24));
        nasoLabel.setBounds(70, 204, 327, 154);
        login.add(nasoLabel);

        JLabel beccoLabel = new JLabel("Becco : " + String.valueOf(becco));
        beccoLabel.setFont(new Font("Dialog", Font.BOLD, 24));
        beccoLabel.setBounds(70, 254, 327, 154);
        login.add(beccoLabel);

        JLabel colloLabel = new JLabel("Collo : " + String.valueOf(collo));
        colloLabel.setFont(new Font("Dialog", Font.BOLD, 24));
        colloLabel.setBounds(400, 104, 327, 154);
        login.add(colloLabel);

        JLabel pinneLabel = new JLabel("pinne : " + String.valueOf(pinne));
        pinneLabel.setFont(new Font("Dialog", Font.BOLD, 24));
        pinneLabel.setBounds(400, 154, 327, 154);
        login.add(pinneLabel);

        JLabel codaLabel = new JLabel("Coda : " + String.valueOf(coda));
        codaLabel.setFont(new Font("Dialog", Font.BOLD, 24));
        codaLabel.setBounds(400, 204, 327, 154);
        login.add(codaLabel);
        
       /* 
        // Button
        Button back_button = new Button("Back");
        back_button.setBounds(300, 450, 100, 30);
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