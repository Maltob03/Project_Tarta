import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InsertValutazionePanel extends JPanel {
	String nome;
	String targhetta;
	static int sede;
	static int vasca;

	public InsertValutazionePanel() {
		
        setLayout(new BorderLayout());

		//Database db = new Database();

		ImageIcon background_image = new ImageIcon("bg.jpg");
		JLabel background = new JLabel("", background_image, JLabel.CENTER);
		add(background, BorderLayout.CENTER);

		JPanel login = new JPanel();
		login.setLayout(null);
		login.setSize(400, 1600);
		login.setBackground(new Color(255, 255, 255, 180));
		login.setBounds(50, 50, 700, 600);

		background.add(login);
        


		JLabel insertTitle = new JLabel("Assegna delle valutazioni");
		insertTitle.setBounds(201, -31, 327, 154);
		insertTitle.setFont(new Font("Dialog", Font.BOLD, 24));
		login.add(insertTitle);

		Button insert_tarta_button = new Button("Insert");
		insert_tarta_button.addActionListener(new ActionListener() {
			private Component frame;

			public void actionPerformed(ActionEvent e) {
				
				 JOptionPane.showMessageDialog(this.frame, "DEBUG", "DEBUG", JOptionPane.ERROR_MESSAGE);
                 return;
			}
		});

		insert_tarta_button.setBounds(280, 523, 100, 30);
		login.add(insert_tarta_button);
		

		JLabel lblNewLabel = new JLabel("Testa");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(185, 105, 78, 30);
		login.add(lblNewLabel);

		JLabel lblNaso = new JLabel("Naso");
		lblNaso.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNaso.setBounds(185, 165, 57, 30);
		login.add(lblNaso);

		JLabel lblBecco = new JLabel("Becco");
		lblBecco.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBecco.setBounds(185, 229, 78, 30);
		login.add(lblBecco);

		JLabel lblCollo = new JLabel("Collo");
		lblCollo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCollo.setBounds(185, 294, 78, 26);
		login.add(lblCollo);

		JLabel lblPinne = new JLabel("Pinne");
		lblPinne.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPinne.setBounds(185, 363, 78, 30);
		login.add(lblPinne);

		JLabel lblCoda = new JLabel("Coda");
		lblCoda.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCoda.setBounds(185, 432, 78, 30);
		login.add(lblCoda);

		JComboBox ComboNaso = new JComboBox();
		ComboNaso.setModel(
				new DefaultComboBoxModel(new String[] { "", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		ComboNaso.setMaximumRowCount(10);
		ComboNaso.setBounds(407, 169, 69, 30);
		login.add(ComboNaso);

		JComboBox ComboBecco = new JComboBox();
		ComboBecco.setModel(
				new DefaultComboBoxModel(new String[] { "", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		ComboBecco.setMaximumRowCount(10);
		ComboBecco.setBounds(407, 233, 69, 30);
		login.add(ComboBecco);

		JComboBox ComboCollo = new JComboBox();
		ComboCollo.setModel(
				new DefaultComboBoxModel(new String[] { "", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		ComboCollo.setMaximumRowCount(10);
		ComboCollo.setBounds(407, 296, 69, 30);
		login.add(ComboCollo);

		JComboBox ComboPinne = new JComboBox();
		ComboPinne.setModel(
				new DefaultComboBoxModel(new String[] { "", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		ComboPinne.setMaximumRowCount(10);
		ComboPinne.setBounds(407, 367, 69, 30);
		login.add(ComboPinne);

		JComboBox ComboCoda = new JComboBox();
		ComboCoda.setModel(
				new DefaultComboBoxModel(new String[] { "", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		ComboCoda.setMaximumRowCount(10);
		ComboCoda.setBounds(407, 436, 69, 30);
		login.add(ComboCoda);

		JComboBox ComboTesta = new JComboBox();
		ComboTesta.setModel(
				new DefaultComboBoxModel(new String[] { "", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		ComboTesta.setMaximumRowCount(10);
		ComboTesta.setBounds(407, 109, 69, 30);
		login.add(ComboTesta);


	}
}