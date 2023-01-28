import javax.swing.*;
import java.awt.*;

public class ViewResultFrame extends JFrame {

  private SearchResultPanel panel1;
  private ViewCartellaClinicaPanel panel2;
  private ViewStatoSalutePanel panel3;

  
  public ViewResultFrame(String nome, String targhetta, int sede, int vasca,String specie, int lunghezza, int larghezza, int peso, String luogo, int testa, int occhi, int naso, int becco, int collo, int pinne, int coda) {
      
      setTitle("Project Tarta");
      setSize(800, 800);
      setLayout(new BorderLayout());
      setResizable(false);
      


      JPanel panelForNextResult = new JPanel();
      JPanel panelForSecondNext = new JPanel();



      // Panel 1
      panel1 = new SearchResultPanel(nome,targhetta,sede,vasca);
      panel1.add(panelForNextResult, BorderLayout.SOUTH);
      JButton NextResult = new JButton("NEXT 1");
      NextResult.setBackground(new Color(0, 240, 240));
      NextResult.setPreferredSize(new Dimension(80, 40));
      NextResult.setBounds(50, 50, 100, 100);
      panelForNextResult.add(NextResult);

      //panel2
      panel2 = new ViewCartellaClinicaPanel(specie, larghezza, lunghezza, peso, luogo, "prova");
      panel2.add(panelForSecondNext, BorderLayout.SOUTH);
      JButton NextResult2 = new JButton("NEXT 2");
      NextResult2.setBackground(new Color(0, 240, 240));
      NextResult2.setPreferredSize(new Dimension(80, 40));
      NextResult2.setBounds(50, 50, 100, 100);
      panelForSecondNext.add(NextResult2);

      //panel3
      panel3 = new ViewStatoSalutePanel(testa, occhi, naso, becco, collo, pinne, coda);
      

      // Add panels to the frame and make panel1 visible by default
      add(panel1, BorderLayout.CENTER);


      NextResult.addActionListener(e -> {
          remove(panel1);
          //remove(panel3);
          add(panel2, BorderLayout.CENTER);
          revalidate();
          repaint();
          
      });

      NextResult2.addActionListener(e -> {
        remove(panel2);
        //remove(panel3);
        add(panel3, BorderLayout.CENTER);
        revalidate();
        repaint();
        
    });

/* 
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
*/

      setVisible(true);
  }

}
