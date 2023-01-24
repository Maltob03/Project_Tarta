import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CartellaClinicaPanel extends JPanel {
    String nome;
    String targhetta;
    static int sede;
    static int vasca;
    boolean isPresented;

    public CartellaClinicaPanel() {

        setLayout(new BorderLayout());

        Database db = new Database();

        ImageIcon background_image = new ImageIcon("bg.jpg");
        JLabel background = new JLabel("", background_image, JLabel.CENTER);
        add(background, BorderLayout.CENTER);

        JPanel login = new JPanel();
        login.setLayout(null);
        login.setSize(400, 1600);
        login.setBackground(new Color(255, 255, 255, 180));
        login.setBounds(50, 50, 700, 600);

        background.add(login);

        JLabel insertTitle = new JLabel("Inserisci Cartella Clinica");
        insertTitle.setFont(new Font("Dialog", Font.BOLD, 24));
        insertTitle.setBounds(200, -31, 327, 154);
        login.add(insertTitle);

        JTextField textField = new JTextField("Specie");
        textField.setBounds(45, 132, 226, 44);
        background.add(textField);
        textField.setColumns(10);
        login.add(textField);

        JTextField textField_1 = new JTextField("Lunghezza");
        textField_1.setColumns(10);
        textField_1.setBounds(45, 223, 226, 44);
        login.add(textField_1);

        JTextField textField_3 = new JTextField("Larghezza");
        textField_3.setColumns(10);
        textField_3.setBounds(428, 133, 226, 44);
        login.add(textField_3);

        JTextField textField_4 = new JTextField("Peso");
        textField_4.setColumns(10);
        textField_4.setBounds(428, 183, 226, 44);
        login.add(textField_4);

        JTextField textField_5 = new JTextField("Luogo di Ritrovamento");
        textField_5.setColumns(10);
        textField_5.setBounds(428, 223, 226, 44);
        login.add(textField_5);

        JTextField textField_6 = new JTextField("Data di Ritrovamento");
        textField_6.setColumns(10);
        textField_6.setBounds(45, 183, 226, 44);
        login.add(textField_6);

        Button insert_tarta_button = new Button("Insert");
        insert_tarta_button.setBounds(300, 423, 100, 30);
        login.add(insert_tarta_button);

        insert_tarta_button.addActionListener(new ActionListener() {
            private Component frame;

            @Override
            public void actionPerformed(ActionEvent e) {
                nome = textField.getText();
                targhetta = textField_1.getText();
                sede = Integer.parseInt(textField_3.getText());
                vasca = Integer.parseInt(textField_4.getText());

                if (nome.isEmpty()) {
                    JOptionPane.showMessageDialog(this.frame, "Inserisci un ID", "Errore", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // QUERY THAT PASS THE QUERY TO THE DB METHOD

                db.inserisciTartaruga(nome, targhetta, sede, vasca);
                JOptionPane.showMessageDialog(this.frame, "Operation success correctly");
                return;
            }
        });


        textField.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                textField.setText("");
            }

            public void focusLost(FocusEvent e) {
            }
        });
        textField_1.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                textField_1.setText("");
            }

            public void focusLost(FocusEvent e) {
            }
        });
        textField_3.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                textField_3.setText("");
            }

            public void focusLost(FocusEvent e) {
            }
        });
        textField_4.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                textField_4.setText("");
            }

            public void focusLost(FocusEvent e) {
            }
        });
    }
}
