import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InsertTartarugaPanel extends JPanel {
    String nome;
    String targhetta;
    static int sede;
    static int vasca;
    boolean isPresented;

    
    public InsertTartarugaPanel(MainFrame mframe) {

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

        JLabel insertTitle = new JLabel("Inserisci una tartaruga");
        insertTitle.setFont(new Font("Dialog", Font.BOLD, 24));
        insertTitle.setBounds(200, -31, 327, 154);
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

        Button insert_tarta_button = new Button("Avanti");
        insert_tarta_button.setBounds(300, 400, 100, 30);
        login.add(insert_tarta_button);

        insert_tarta_button.addActionListener(new ActionListener() {
        	
        	
        	
        	
        	
            private Component frame;

            @Override
            public void actionPerformed(ActionEvent e) {
                Tartaruga.nome = textField.getText();
                Tartaruga.targhetta = textField_1.getText();
                Tartaruga.sede = Integer.parseInt(textField_3.getText());
                Tartaruga.vasca = Integer.parseInt(textField_4.getText());
                
                setVisible(false);
                mframe.setContentPane(mframe.panel4);
                mframe.panel4.setVisible(true);
/* 
                if (nome.isEmpty()) {
                    JOptionPane.showMessageDialog(this.frame, "Inserisci un ID", "Errore", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                */


                // QUERY THAT PASS THE QUERY TO THE DB METHOD

               /*  db.inserisciTartaruga(Tartaruga.nome, Tartaruga.targhetta, Tartaruga.sede, Tartaruga.vasca);
                JOptionPane.showMessageDialog(this.frame, "Operation success correctly");
                return;
                */
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