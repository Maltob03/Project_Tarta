import javax.swing.*;
import java.awt.*;

public class InsertTartarugaPanel extends JPanel {
    

    public InsertTartarugaPanel() {

        setLayout(new BorderLayout());


        InsertTartarugaDAO tDAO = new InsertTartarugaDAO();
        Controller nc = new Controller();

        ImageIcon background_image = new ImageIcon("bg.jpg");
        JLabel background = new JLabel("", background_image, JLabel.CENTER);
        add(background, BorderLayout.CENTER);

        JPanel login = new JPanel();
        login.setLayout(null);
        login.setSize(400, 1600);
        login.setBackground(new Color(255, 255, 255, 180));
        login.setBounds(50, 90, 700, 470);

        background.add(login);

        JLabel insertTitle = new JLabel("Inserisci una tartaruga");
        insertTitle.setFont(new Font("Dialog", Font.BOLD, 24));
        insertTitle.setBounds(210, -32, 327, 154);
        login.add(insertTitle);

        JTextField textField = new JTextField("Nome");
        textField.setBounds(45, 132, 226, 44);
        //background.add(textField);
        textField.setColumns(10);
        login.add(textField);

        JTextField textField_1 = new JTextField("Targhetta");
        textField_1.setColumns(10);
        textField_1.setBounds(45, 300, 226, 44);
        login.add(textField_1);

        JTextField textField_3 = new JTextField("Sede");
        textField_3.setColumns(10);
        textField_3.setBounds(428, 133, 226, 44);
        login.add(textField_3);

        JTextField textField_4 = new JTextField("Vasca");
        textField_4.setColumns(10);
        textField_4.setBounds(428, 300, 226, 44);
        login.add(textField_4);


       Button insert_tarta_button = new Button("Inserisci");
        insert_tarta_button.setBounds(300, 400, 100, 30);
        login.add(insert_tarta_button); 

        insert_tarta_button.addActionListener(e -> {
            Tartaruga tartarugaToPass = nc.fillTartaruga(textField.getText(), textField_1.getText(),Integer.parseInt(textField_3.getText()),Integer.parseInt(textField_4.getText()));
                tDAO.inserisciTartaruga(tartarugaToPass); 
        });


        nc.clearTextField(textField);
        nc.clearTextField(textField_1);
        nc.clearTextField(textField_3);
        nc.clearTextField(textField_4);

       
    }

    
}