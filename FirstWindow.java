

import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;


public class FirstWindow extends JFrame {
    
    //attributo proprio di questa classe
    private JFrame frame;  //frame
    private JTextField idField;  //TextField
    private JButton submitButton; //button
    private JPanel inputPanel; //input for textifield
    private Database db = new Database(); //open connection with database and call the method show name
    protected Object show;


    //costruttore: inizializza un nuovo oggetto istanza della classe, non so se necessario

    FirstWindow(JFrame frame, JTextField idField, JButton submiButton, JPanel inputPanel)
    {
        super("Gestione Tartarughe Marine");
        frame = this.frame;
        idField = this.idField;
        inputPanel = this.inputPanel;
        
    }

    //metodo public
    public FirstWindow() {
        
         //con super mi riconduco all'attributo proprio della classe JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // quando si chiude si chiude anche l'esecuzione
        setSize(800, 600); //size del frame
        setLocationRelativeTo(null); //posiziona il frame al centro



        inputPanel = new JPanel(); //creazione dell'oggetto Panel
        inputPanel.add(new JLabel("ID Tartaruga:")); //aggiunge un label
        idField = new JTextField(10); //creazione del textfield
        inputPanel.add(idField); //aggiunta del texfield nel panel


        submitButton = new JButton("Cerca"); //creazione del bottone di ricerca
        
        //posizionamento degli elementi
        add(inputPanel, BorderLayout.NORTH); 
        add(submitButton, BorderLayout.CENTER);

        //l'argomento richiede l'interfaccia Action Listner, noi gli passiamo una classe anonima e viene implementato l'unico metodo disponibile di quest'interfaccia
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              // Recupera l'ID inserito dall'utente
              String id = idField.getText();
              if (id.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Inserisci un ID valido", "Errore", JOptionPane.ERROR_MESSAGE);
                return;
              }

              //QUERY THAT PASS THE QUERY TO THE DB METHOD
              final String QUERY = "SELECT id_tartaruga, nome, targhetta FROM tartaruga WHERE tartaruga.id_tartaruga = " + id ;
              
              db.cercaTartarugaIdNomeTarghetta(id, QUERY);
      
              
      
      
            }
      
            
          });


          setVisible(true);
    }
}

