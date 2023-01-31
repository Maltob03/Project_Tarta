import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InsertCartellaClinicaPanel extends JPanel {

    static JTextField textField;
    public InsertCartellaClinicaPanel(boolean reinsert) {

        setLayout(new BorderLayout());

        InsertCartellaClinicaDAO insertDAO = new InsertCartellaClinicaDAO();
        ReinsertCartellaClinicaDAO reinsertDAO = new ReinsertCartellaClinicaDAO();
        Controller nc = new Controller();

        ImageIcon background_image = new ImageIcon("bg.jpg");
        JLabel background = new JLabel("", background_image, JLabel.CENTER);
        add(background, BorderLayout.CENTER);

        JPanel login = new JPanel();
        login.setLayout(null);
        login.setSize(400, 1600);
        login.setBackground(new Color(255, 255, 255, 180));
        login.setBounds(50, 75, 700, 500);

        background.add(login);

        JLabel insertTitle = new JLabel("Inserisci Cartella Clinica");
        insertTitle.setFont(new Font("Dialog", Font.BOLD, 24));
        insertTitle.setBounds(200, -31, 327, 154);
        login.add(insertTitle);

        JTextField textField = new JTextField("Specie");
        textField.setBounds(45, 132, 226, 44);
        //background.add(textField);
        textField.setColumns(10);
        login.add(textField);

        JTextField textField_1 = new JTextField("Lunghezza");
        textField_1.setColumns(10);
        textField_1.setBounds(45, 320, 226, 44);
        login.add(textField_1);

        JTextField textField_3 = new JTextField("Larghezza");
        textField_3.setColumns(10);
        textField_3.setBounds(428, 133, 226, 44);
        login.add(textField_3);

        JTextField textField_4 = new JTextField("Peso");
        textField_4.setColumns(10);
        textField_4.setBounds(428, 223, 226, 44);
        login.add(textField_4);

        JTextField textField_5 = new JTextField("Luogo di Ritrovamento");
        textField_5.setColumns(10);
        textField_5.setBounds(428, 320, 226, 44);
        login.add(textField_5);

        JTextField textField_6 = new JTextField("Data di Ritrovamento");
        textField_6.setColumns(10);
        textField_6.setBounds(45, 223, 226, 44);
        login.add(textField_6);


        Button insert_tarta_button = new Button("Avanti");
        insert_tarta_button.setBounds(300, 423, 100, 30);
        login.add(insert_tarta_button);
       

        insert_tarta_button.addActionListener(new ActionListener() {
            //private Component frame;

            @Override
            public void actionPerformed(ActionEvent e) {
                CartellaClinicaModel cartellaToPass = nc.fillCartellaClinica(textField.getText(),Integer.parseInt(textField_1.getText()),Integer.parseInt(textField_3.getText()),Integer.parseInt(textField_4.getText()),textField_5.getText(),textField_6.getText());
                if(reinsert == false){
                    insertDAO.inserisciCartellaClinica(cartellaToPass);
                }
                else{
                    reinsertDAO.reinserisciCartellaClinica(cartellaToPass);
                }
                return;
            }
        });


        nc.clearTextFieldReinsert(textField, reinsert);
        nc.clearTextField(textField_1);
        nc.clearTextField(textField_3);
        nc.clearTextField(textField_4);
        nc.clearTextField(textField_5);
        nc.clearTextField(textField_6);
    }
}
