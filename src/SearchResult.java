import javax.swing.*;
import javax.swing.border.MatteBorder;

import java.awt.*;
import java.awt.event.*;

public class SearchResult extends JFrame {
  static String id;
  static String pw;
  boolean isPresented;
  private JTextField textField;
  private JTextField textField_1;
  private JTextField textField_3;
  private JTextField textField_4;
    public SearchResult(){
        // font
        Font f = new Font ("TYPE1_FONT", Font.BOLD, 30);
        
        
        //WhiteSpace behind
        JPanel login = new JPanel (); login.setLayout (null);
        login.setSize (400,1600);
        login.setBackground (new Color (255,255,255, 220));
        login.setBounds (50,50, 700,600);


        JLabel name = new JLabel ("Welcome to Project Tarta");
        //name.setBounds(1,25,1,1);
        name.setFont(f);
        name.setForeground(Color.WHITE);
        login.add(name);


        
        
        
        
        //Panel for button
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

        //button1.setBounds(0,0,150,75);
        //toolbar.add(button1);
        JButton button2 = new JButton("Insert");
        button2.setBackground(new Color(240, 240, 240));
        button2.setPreferredSize(new Dimension(60, 30));
        button2.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.textHighlight));

        //toolbar.add(button2);
        panelForButton.add(button2);
        JButton button3 = new JButton("Statistics");
        button3.setBackground(new Color(240, 240, 240));
        button3.setPreferredSize(new Dimension(60, 30));
        button3.setBorder(null);
        //toolbar.add(button3);
        panelForButton.add(button3);

        toolbar.add(panelForButton);
        //Switch tab Insert Button
        button1.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            setVisible(false);
            new SearchFrame().setVisible(true);
          }
        });
        

        

          
        //frame
        setSize(800,800) ;
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        //Image
        ImageIcon background_image = new ImageIcon("bg.jpg");
        JLabel background = new JLabel ("", background_image, JLabel.CENTER);
        background.add(login);
        background. setBounds (0,0,800, 800);
        background.add(login);
        
        JLabel lblNewLabel = new JLabel("Inserisci una tartaruga");
        lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 30));
        lblNewLabel.setBounds(184, -31, 327, 154);
        login.add(lblNewLabel);
        
        textField = new JTextField();
        textField.setBounds(45, 132, 226, 44);
        login.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(45, 300, 226, 44);
        login.add(textField_1);
        
        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(428, 133, 226, 44);
        login.add(textField_3);
        
        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(428, 300, 226, 44);
        login.add(textField_4);
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(toolbar, BorderLayout.NORTH);
        getContentPane().add(background, BorderLayout.CENTER);
        


        setVisible(true);
    }
}


