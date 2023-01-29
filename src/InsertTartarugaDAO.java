import java.sql.*;

public class InsertTartarugaDAO {

    public void inserisciTartaruga(Tartaruga tartaruga) {
    final String QUERY = "INSERT INTO tartaruga(id_tartaruga,nome,targhetta,id_sede,id_vasca)VALUES(12," + "'"
        + tartaruga.getNome() + "'" + "," + "'" + tartaruga.getTarghetta() + "'" + "," + tartaruga.getSede() + "," + tartaruga.getVasca() + ");";
    try (Connection conn = DriverManager.getConnection(Database.DB_URL, Database.USER, Database.PASS);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(QUERY);) {
    } catch (SQLException error) {
      error.printStackTrace();
    }
    return;

  }
    
}
