import javax.swing.*;
import java.awt.*;

public class SearchResultPanel extends JPanel {
    String nome;
    String targhetta;
    int sede;
    int vasca;

    public SearchResultPanel(String nome, String targhetta, int sede, int vasca) {
        this.nome = nome;
        this.targhetta = targhetta;
        this.sede = sede;
        this.vasca = vasca;

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

        JLabel nomeLabel = new JLabel("Nome : " + nome);
        nomeLabel.setFont(new Font("Dialog", Font.BOLD, 24));
        nomeLabel.setBounds(70, 150, 327, 154);
        login.add(nomeLabel);

        /* */
        JLabel targhettaLabel = new JLabel("Targhetta : " + targhetta);
        targhettaLabel.setFont(new Font("Dialog", Font.BOLD, 24));
        targhettaLabel.setBounds(70, 200, 327, 154);
        login.add(targhettaLabel);

        JLabel sedeLabel = new JLabel("Sede : " + String.valueOf(sede));
        sedeLabel.setFont(new Font("Dialog", Font.BOLD, 24));
        sedeLabel.setBounds(70, 250, 327, 154);
        login.add(sedeLabel);

        JLabel vascaLabel = new JLabel("Vasca : " + String.valueOf(vasca));
        vascaLabel.setFont(new Font("Dialog", Font.BOLD, 24));
        vascaLabel.setBounds(70, 300, 327, 154);
        login.add(vascaLabel);


    }
}
