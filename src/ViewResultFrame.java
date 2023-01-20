import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.*;

public class ViewResultFrame extends JFrame {
  String nome;
  String targhetta;
  int sede;
  int vasca;

  public ViewResultFrame(String nome, String targhetta, int sede, int vasca) {
    this.nome = nome;
    this.targhetta = targhetta;
    this.sede = sede;
    this.vasca = vasca;

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
    insertTitle.setBounds(200, -31, 327, 154);
    login.add(insertTitle);


    JLabel nomeLabel = new JLabel("Nome : "+nome);
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


    

    // Button
    Button back_button = new Button("Back");
    back_button.setBounds(300, 500, 100, 30);
    back_button.setBackground(new Color(18, 49, 149));
    login.add(back_button);

    back_button.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new SearchFrame().setVisible(true);
      }
    });

   

    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(toolbar, BorderLayout.NORTH);
    getContentPane().add(background, BorderLayout.CENTER);

    setVisible(true);
  }
}
