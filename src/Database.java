import java.sql.*;

public class Database {

  //La keyword static serve invece a far si che un attributo di una classe non sia proprio dell'istanza ma comune all'oggetto.
  static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/Esame";
  static final String USER = "postgres";
  static final String PASS = "admin";
  
  

  //public posso usare il metodo ovunque in qualsiasi classe
  public void cercaTartaruga(String id) {
    final String QUERY = "SELECT id_tartaruga, nome, targhetta, id_sede, id_vasca FROM tartaruga WHERE tartaruga.id_tartaruga = " + id ;
    try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
          Statement stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery(QUERY);) {
        while (rs.next()) {
          // Display values
          String nome = rs.getString("nome");
          String targhetta = rs.getString("targhetta");
          int sede = rs.getInt("id_sede");
          int vasca = rs.getInt("id_vasca");

          
          new ViewResultFrame(nome,targhetta,sede,vasca).setVisible(true);

          
          //risultati è il titolo della finestra
        }
      } catch (SQLException error) {
        error.printStackTrace();
      }
      return;
      
  }


  public void inserisciTartaruga(String nome, String targhetta, int sede, int vasca) {
    final String QUERY = "INSERT INTO tartaruga(id_tartaruga,nome,targhetta,id_sede,id_vasca)VALUES(11," + "'"
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
