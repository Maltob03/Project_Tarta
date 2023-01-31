import javax.swing.*;
import java.awt.*;

public class StatisticsPanel extends JPanel {
 
    public StatisticsPanel() {

        setLayout(new BorderLayout());

        Controller nc = new Controller();
        
        ImageIcon background_image = new ImageIcon("bg.jpg");
        JLabel background = new JLabel("", background_image, JLabel.CENTER);
        add(background, BorderLayout.CENTER);

        JPanel login = new JPanel();
        login.setLayout(null);
        login.setSize(400, 1600);
        login.setBackground(new Color(255, 255, 255, 180));
        login.setBounds(50, 50, 700, 550);

        background.add(login);

        JLabel insertTitle = new JLabel("Dati tartaruga");
        insertTitle.setFont(new Font("Dialog", Font.BOLD, 24));
        insertTitle.setBounds(200, -31, 327, 154);
        login.add(insertTitle);

        JLabel nomeLabel = new JLabel("Nome : ");
        nomeLabel.setFont(new Font("Dialog", Font.BOLD, 24));
        nomeLabel.setBounds(70, 150, 327, 154);
        login.add(nomeLabel);

        JLabel targhettaLabel = new JLabel("Targhetta : ");
        targhettaLabel.setFont(new Font("Dialog", Font.BOLD, 24));
        targhettaLabel.setBounds(70, 200, 327, 154);
        login.add(targhettaLabel);

        JLabel sedeLabel = new JLabel("Sede : ");
        sedeLabel.setFont(new Font("Dialog", Font.BOLD, 24));
        sedeLabel.setBounds(70, 250, 327, 154);
        login.add(sedeLabel);

        JLabel vascaLabel = new JLabel("Vasca : ");
        vascaLabel.setFont(new Font("Dialog", Font.BOLD, 24));
        vascaLabel.setBounds(70, 300, 327, 154);
        login.add(vascaLabel);


    }
}
