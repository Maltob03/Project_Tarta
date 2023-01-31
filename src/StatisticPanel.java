import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StatisticPanel extends JPanel {

    public StatisticPanel() {

        setLayout(new BorderLayout());

        ImageIcon background_image = new ImageIcon("bg.jpg");
        JLabel background = new JLabel("", background_image, JLabel.CENTER);
        add(background, BorderLayout.CENTER);
        StatisticDAO getNumber = new StatisticDAO();
        String[] myStrings = getNumber.getStatistics(12, 2022);

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

        JLabel nomeLabel = new JLabel("Numero tartarughe totali: " + myStrings[0]);
        nomeLabel.setFont(new Font("Dialog", Font.BOLD, 24));
        nomeLabel.setBounds(70, 150, 397, 154);
        login.add(nomeLabel);

        JLabel targhettaLabel = new JLabel("Numero tartarughe per mese : " + myStrings[1]);
        targhettaLabel.setFont(new Font("Dialog", Font.BOLD, 24));
        targhettaLabel.setBounds(70, 200, 497, 154);
        login.add(targhettaLabel);

        JLabel mediaLabel = new JLabel("Media :  " + myStrings[2]);
        mediaLabel.setFont(new Font("Dialog", Font.BOLD, 24));
        mediaLabel.setBounds(70, 250, 397, 154);
        login.add(mediaLabel);

        JComboBox ComboNaso = new JComboBox();
        ComboNaso.setModel(
                new DefaultComboBoxModel(new String[] { "", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        ComboNaso.setMaximumRowCount(10);
        ComboNaso.setBounds(407, 192, 69, 30);
        login.add(ComboNaso);

        JComboBox ComboBecco = new JComboBox();
        ComboBecco.setModel(
                new DefaultComboBoxModel(new String[] { "","2022","2023" }));
        ComboBecco.setMaximumRowCount(10);
        ComboBecco.setBounds(407, 241, 69, 30);
        login.add(ComboBecco);
       
        
        Button insert_tarta_button = new Button("Inserisci");
        insert_tarta_button.setBounds(300, 400, 100, 30);
        login.add(insert_tarta_button);

        insert_tarta_button.addActionListener(e -> {
            int mese = Integer.parseInt((String) ComboNaso.getSelectedItem());
            int anno = Integer.parseInt((String) ComboBecco.getSelectedItem());

            String[] updatedStrings = getNumber.getStatistics(mese, anno);

            nomeLabel.setText("Numero tartarughe totali: " + updatedStrings[0]);
            targhettaLabel.setText("Numero tartarughe per mese : " + updatedStrings[1]);
            mediaLabel.setText("Media :  " + updatedStrings[2]);

        });

    }
}