import java.sql.*;

public class LoginDAO {

  public boolean cercaDipendente(String id) {
    boolean isPresent = false;
    final String QUERY = "select count(matricola) as Numero from dipendente where matricola = " + "'" + id + "'" ;


    try (Connection conn = DriverManager.getConnection(Database.DB_URL,Database.USER,Database.PASS);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(QUERY);) {
      while (rs.next()) {

        if(rs.getString("numero").equals("1")){
          isPresent = true;
        }
        else {
          isPresent = false;
        }


        

        // risultati è il titolo della finestra
      }
    } catch (SQLException error) {
      error.printStackTrace();
    }
    return isPresent;
  }
}
