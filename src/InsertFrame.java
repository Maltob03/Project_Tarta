import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.*;

public class InsertFrame extends JFrame {
  static String nome;
  static String targhetta;
  static int sede;
  static int vasca;
  boolean isPresented;

  public InsertFrame() {

    Database db = new Database();

    // WhiteSpace behind
    JPanel login = new JPanel();
    login.setLayout(null);
    login.setSize(400, 1600);
    login.setBackground(new Color(255, 255, 255, 180));
    login.setBounds(50, 50, 700, 600);

    // Panel for button
    JPanel panelForButton = new JPanel(new FlowLayout(FlowLayout.LEFT));

    // Create the toolbar
    JToolBar toolbar = new JToolBar();
    toolbar.setFloatable(false);

    // Add buttons or other components to the toolbar
    JButton button1 = new JButton("Search");
    button1.setBackground(new Color(240, 240, 240));
    button1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      }
    });
    button1.setPreferredSize(new Dimension(60, 30));
    button1.setBorder(null);
    panelForButton.add(button1);

    JButton button2 = new JButton("Insert");
    button2.setBackground(new Color(240, 240, 240));
    button2.setPreferredSize(new Dimension(60, 30));
    button2.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.textHighlight));
    panelForButton.add(button2);

    JButton button3 = new JButton("Statistics");
    button3.setBackground(new Color(240, 240, 240));
    button3.setPreferredSize(new Dimension(60, 30));
    button3.setBorder(null);
    panelForButton.add(button3);

    toolbar.add(panelForButton);

    // Switch tab Insert Button
    button1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new SearchFrame().setVisible(true);
      }
    });

    // frame
    setSize(800, 800);
    getContentPane().setLayout(null);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setResizable(false);

    // Image
    ImageIcon background_image = new ImageIcon("bg.jpg");
    JLabel background = new JLabel("", background_image, JLabel.CENTER);
    background.add(login);
    background.setBounds(0, 0, 800, 800);
    background.add(login);

    JLabel insertTitle = new JLabel("Inserisci una tartaruga");
    insertTitle.setFont(new Font("Dialog", Font.BOLD, 24));
    insertTitle.setBounds(184, -31, 327, 154);
    login.add(insertTitle);

    JTextField textField = new JTextField("Nome");
    textField.setBounds(45, 132, 226, 44);
    login.add(textField);
    textField.setColumns(10);

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


    //Place Holder text function

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

    // Button
    Button insert_tarta_button = new Button("Go");
    insert_tarta_button.setBounds(300, 400, 100, 30);
    insert_tarta_button.setBackground(new Color(18, 49, 149));
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
        final String QUERY = "INSERT INTO tartaruga(id_tartaruga,nome,targhetta,id_sede,id_vasca)VALUES(15," + "'"
            + nome + "'" + "," + "'" + targhetta + "'" + "," + sede + "," + vasca + ");";

        db.inserisciTartaruga(nome, targhetta, sede, vasca, QUERY);
        JOptionPane.showMessageDialog(this.frame, "Operation success correctly");
        return;
      }
    });

    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(toolbar, BorderLayout.NORTH);
    getContentPane().add(background, BorderLayout.CENTER);

    setVisible(true);
  }
}
