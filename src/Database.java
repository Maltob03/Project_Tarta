import java.sql.*;
import javax.swing.*;




public class Database {

  //La keyword static serve invece a far si che un attributo di una classe non sia proprio dell'istanza ma comune all'oggetto.
  static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/Esame";
  static final String USER = "postgres";
  static final String PASS = "admin";
  private JFrame frame = new JFrame("Gestione delle tartarughe"); //attributo proprio di questa classe
  
  

  //public posso usare il metodo ovunque in qualsiasi classe
  public void cercaTartarugaIdNomeTarghetta(String id, String QUERY) {
    try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
          Statement stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery(QUERY);) {
        while (rs.next()) {
          // Display values
          JOptionPane.showMessageDialog(frame, "Il nome della tartaruga è: \nID: " + rs.getInt("id_tartaruga") + " \nNOME: " + rs.getString("nome") + "\nTARGHETTA:  " + rs.getString("targhetta"), "Risultati",
          JOptionPane.INFORMATION_MESSAGE);
          //risultati è il titolo della finestra
        }
      } catch (SQLException error) {
        error.printStackTrace();
      }
      return;
      
  }
    
}
