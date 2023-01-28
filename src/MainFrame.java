import java.awt.*;
import javax.swing.*;
import javax.swing.border.MatteBorder;

public class MainFrame extends JFrame {

    private SearchPanel panel1;
    private InsertTartarugaPanel panel2;
    private SearchResultPanel panel3;
    private InsertCartellaClinicaPanel panel4;
    private InsertValutazionePanel panel5;

    public MainFrame() {
        
        setTitle("Project Tarta");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setResizable(false);
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

        toolbar.add(panelForButton);

        add(toolbar);


        JPanel panelForNext = new JPanel();
        JPanel panelForSecondNext = new JPanel();
        // Panel 1
        panel1 = new SearchPanel();

        
        

        // Panel 2
        panel2 = new InsertTartarugaPanel();
        JButton next1 = new JButton("NEXT 1");
        next1.setBackground(new Color(0, 240, 240));
        next1.setPreferredSize(new Dimension(80, 40));
        next1.setBounds(50, 50, 100, 100);
        panelForNext.add(next1);
        
        
        

        panel2.add(panelForNext, BorderLayout.SOUTH);



        

        // Panel 3
        panel3 = new SearchResultPanel("pippo","topolino",2,2);


        //panel 4
        panel4 = new InsertCartellaClinicaPanel();
        JButton next2 = new JButton("NEXT 2");
        next2.setBackground(new Color(0, 240, 240));
        next2.setPreferredSize(new Dimension(80, 40));
        panelForSecondNext.add(next2);
        next2.setBounds(50, 50, 100, 100);
        panel4.add(panelForSecondNext, BorderLayout.SOUTH);

        panel5 = new InsertValutazionePanel();

        

        // Add panels to the frame and make panel1 visible by default
        add(panel1, BorderLayout.CENTER);

        button1.addActionListener(e -> {
            button1.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.textHighlight));
            button2.setBorder(null);
            button3.setBorder(null);
            remove(panel2);
            remove(panel3);
            remove(panel4);
            remove(panel5);
            add(panel1, BorderLayout.CENTER);
            revalidate();
            repaint();
        });
        button2.addActionListener(e -> {
            button1.setBorder(null);
            button3.setBorder(null);
            button2.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.textHighlight));
            remove(panel1);
            remove(panel3);
            remove(panel4);
            remove(panel5);
            add(panel2, BorderLayout.CENTER);
            revalidate();
            repaint();
        });
        button3.addActionListener(e -> {
            button1.setBorder(null);
            button2.setBorder(null);
            button3.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.textHighlight));
            remove(panel1);
            remove(panel2);
            remove(panel4);
            remove(panel5);
            add(panel3, BorderLayout.CENTER);
            revalidate();
            repaint();
            
        });


        next1.addActionListener(e -> {
            button2.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.textHighlight));
            button1.setBorder(null);
            button3.setBorder(null);
            remove(panel2);
            remove(panel3);
            add(panel4, BorderLayout.CENTER);
            revalidate();
            repaint();
            
        });


        next2.addActionListener(e -> {
            button2.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.textHighlight));
            button1.setBorder(null);
            button3.setBorder(null);
            remove(panel2);
            remove(panel3);
            remove(panel4);
            add(panel5, BorderLayout.CENTER);
            revalidate();
            repaint();
        });
        

        setLocationRelativeTo(null);
        getContentPane().add(toolbar, BorderLayout.NORTH);
        setVisible(true);
    }

}
