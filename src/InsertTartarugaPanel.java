import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InsertTartarugaPanel extends JPanel {
    public JToolBar toolbar;

    public InsertTartarugaPanel() {

        setLayout(new BorderLayout());


        //Database db = new Database();
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

                    
                    
                


        //quando clicco sulla funzione fa i get text dagli id e li manda all'entità tartaruga
       insert_tarta_button.addActionListener(new ActionListener() {
        private Component frame;
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (textField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this.frame, "Inserisci un ID", "Errore", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                nc.fillTarta(textField.getText(), textField_1.getText(), Integer.parseInt(textField_3.getText()),Integer.parseInt(textField_4.getText()));
                //db.inserisciTartaruga(Tartaruga.nome, Tartaruga.targhetta, Tartaruga.sede, Tartaruga.vasca); 
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