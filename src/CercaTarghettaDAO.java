import java.sql.*;

public class CercaTarghettaDAO {

    public boolean CercaTarghettaDAO(String targhetta) {
      boolean reinsert = false;
        final String QUERY = "SELECT COUNT(targhetta) as numero FROM tartaruga WHERE targhetta = " + "'" + targhetta +"'";
        try (Connection conn = DriverManager.getConnection(Database.DB_URL, Database.USER, Database.PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);) {
          while (rs.next()) {
    
            // Display values
            if(rs.getString("numero").equals("0")){
               System.out.println("NON CI STANNO");
              }
              else {
                System.out.println("E' UN REINSERIMENTO");
                reinsert = true;
              }
            
    
            // risultati è il titolo della finestra
          }
        } catch (SQLException error) {
          error.printStackTrace();
        }
        return reinsert;
    
      }
    
}

