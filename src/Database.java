import java.awt.Component;
import java.sql.*;
import javax.swing.*;




public class Database {

  //La keyword static serve invece a far si che un attributo di una classe non sia proprio dell'istanza ma comune all'oggetto.
  static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/project_tarta";
  static final String USER = "postgres";
  static final String PASS = "admin";
  //private JFrame frame = new JFrame("Gestione delle tartarughe"); //attributo proprio di questa classe
  private Component frame;
  
  

  //public posso usare il metodo ovunque in qualsiasi classe
  public void cercaTartarugaIdNomeTarghetta(String id) {
    final String QUERY = "SELECT id_tartaruga, nome, targhetta FROM tartaruga WHERE tartaruga.id_tartaruga = " + id ;
    try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
          Statement stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery(QUERY);) {
        while (rs.next()) {
          // Display values
          JOptionPane.showMessageDialog(this.frame, "Il nome della tartaruga è: \nID: " + rs.getInt("id_tartaruga") + " \nNOME: " + rs.getString("nome") + "\nTARGHETTA:  " + rs.getString("targhetta"), "Risultati",
          JOptionPane.INFORMATION_MESSAGE);
          //risultati è il titolo della finestra
        }
      } catch (SQLException error) {
        error.printStackTrace();
      }
      return;
      
  }


  public void inserisciTartaruga(String nome, String targhetta, int sede, int vasca) {
    final String QUERY = "INSERT INTO tartaruga(id_tartaruga,nome,targhetta,id_sede,id_vasca)VALUES(15," + "'"
            + nome + "'" + "," + "'" + targhetta + "'" + "," + sede + "," + vasca + ");";
    try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
          Statement stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery(QUERY);) {
      } catch (SQLException error) {
        error.printStackTrace();
      }
      return;
      
  }
    
}
