import java.awt.*;
import javax.swing.*;
import javax.swing.border.MatteBorder;

public class MainFrame extends JFrame {

    private SearchPanel panel1;
    private InsertTartarugaPanel panel2;
    private SearchResultPanel panel3;
    private InsertCartellaClinicaPanel panel4;
    private InsertValutazionePanel panel5;
    private InsertTartarugaPanel panel6;
    private InsertCartellaClinicaPanel panel7;

    public MainFrame(boolean getPermission) {
        
        setTitle("Project Tarta");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setResizable(false);
        Controller nc = new Controller();
        // Toolbar
        // Panel for button
        JPanel panelForButton = new JPanel(new FlowLayout(FlowLayout.LEFT));

        // Create the toolbar
        JToolBar toolbar = new JToolBar();
        toolbar.setFloatable(false);

        // Add buttons or other components to the toolbar
        JButton button1 = new JButton("Search");
        button1.setBackground(new Color(240, 240, 240));
        button1.setPreferredSize(new Dimension(60, 30));
        button1.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.textHighlight));
        panelForButton.add(button1);

        JButton button2 = new JButton("Insert");
        button2.setBackground(new Color(240, 240, 240));
        button2.setPreferredSize(new Dimension(60, 30));
        button2.setBorder(null);
        panelForButton.add(button2);

        JButton button3 = new JButton("Statistics");
        button3.setBackground(new Color(240, 240, 240));
        button3.setPreferredSize(new Dimension(60, 30));
        button3.setBorder(null);
        panelForButton.add(button3);



        JButton button4 = new JButton("Suspends");
        button4.setBackground(new Color(240, 240, 240));
        button4.setPreferredSize(new Dimension(60, 30));
        button4.setBorder(null);
        panelForButton.add(button4);

        JButton button5 = new JButton("Reinsert");
        button5.setBackground(new Color(240, 240, 240));
        button5.setPreferredSize(new Dimension(60, 30));
        button5.setBorder(null);
        panelForButton.add(button5);

        toolbar.add(panelForButton);

        add(toolbar);


        JPanel panelForNext = new JPanel();
        JPanel panelForSecondNext = new JPanel();
        JPanel panelForReinsert1 = new JPanel();
        JPanel panelForReinsert2 = new JPanel();
        // Panel 1
        panel1 = new SearchPanel();

        
        

        // Panel 2
        panel2 = new InsertTartarugaPanel();
        JButton next1 = new JButton("NEXT");
        next1.setBackground(new Color(0, 240, 240));
        next1.setPreferredSize(new Dimension(80, 40));
        next1.setBounds(50, 50, 100, 100);
        panelForNext.add(next1);
        
        
        

        panel2.add(panelForNext, BorderLayout.SOUTH);



        

        // Panel 3
        panel3 = new SearchResultPanel("pippo","topolino",2,2);

        boolean prova = false;
        //panel 4
        panel4 = new InsertCartellaClinicaPanel(prova);
        JButton next2 = new JButton("NEXT");
        next2.setBackground(new Color(0, 240, 240));
        next2.setPreferredSize(new Dimension(80, 40));
        panelForSecondNext.add(next2);
        next2.setBounds(50, 50, 100, 100);
        panel4.add(panelForSecondNext, BorderLayout.SOUTH);

        //panel 5
        panel5 = new InsertValutazionePanel();

        //panel6
        panel6 = new InsertTartarugaPanel();
        JButton next3 = new JButton("NEXT");
        next3.setBackground(new Color(0, 240, 240));
        next3.setPreferredSize(new Dimension(80, 40));
        next3.setBounds(50, 50, 100, 100);
        panelForReinsert1.add(next3);
        panel6.add(panelForReinsert1, BorderLayout.SOUTH);

        boolean prova2 = true;

        panel7 = new InsertCartellaClinicaPanel(prova2);
        JButton next4 = new JButton("NEXT");
        next4.setBackground(new Color(0, 240, 240));
        next4.setPreferredSize(new Dimension(80, 40));
        next4.setBounds(50, 50, 100, 100);
        panelForReinsert2.add(next4);
        panel7.add(panelForReinsert2, BorderLayout.SOUTH);

        

        // Add panels to the frame and make panel1 visible by default
        add(panel1, BorderLayout.CENTER);

        button1.addActionListener(e -> {
            nc.goToSearch(button1, button2, button3, button5, panel1, panel2, panel3, panel4, panel5, panel6, panel7, this);
        });
        button2.addActionListener(e -> {
            nc.goToInsert(button1, button2, button3, button5, panel1, panel2, panel3, panel4, panel5, panel6, panel7, this);
        });
        button3.addActionListener(e -> {
            nc.goToStatistics(button1, button2, button3, button5, panel1, panel2, panel3, panel4, panel5, panel6,panel7, this);

            
        });

        button5.addActionListener(e -> {
            nc.goToReinsert(button1, button2, button3, button5, panel1, panel2, panel3, panel4, panel5, panel6,panel7, this);

            
        });


        next1.addActionListener(e -> {
            nc.goToInsertCartellaClinica(button1, button2, button3, button5, panel1, panel2, panel3, panel4, panel5, panel6,panel7, this);
            
        });


        next2.addActionListener(e -> {
            nc.goToInsertStatoSalute(getPermission,button1, button2, button3, panel1, panel2, panel3, panel4, panel5, panel6,panel7, this);
        });


        next3.addActionListener(e -> {
            nc.goToReinsertCartellaClinica(button1, button2, button3, button5, panel1, panel2, panel3, panel4, panel5, panel6, panel7, this);
            System.out.println("NUOVO 3");
        });

        next4.addActionListener(e -> {
            nc.goToInsertStatoSalute(getPermission, button1, button2, button3, panel1, panel2, panel3, panel4, panel5, panel6, panel7, this);
            System.out.println("NUOVO 4");
        });

        

        

        
        

        setLocationRelativeTo(null);
        getContentPane().add(toolbar, BorderLayout.NORTH);
        setVisible(true);
    }

}
