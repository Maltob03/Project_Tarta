import java.sql.*;

public class InsertTartarugaDAO {

    public void inserisciTartaruga(Tartaruga tartaruga) {
    final String QUERY1 = "select count(targhetta) as Numero from tartaruga where targhetta =" + "'" + tartaruga.getTarghetta() + "'";
    final String QUERY2 = "INSERT INTO tartaruga(targhetta,id_sede,id_vasca)VALUES(" + "'"
    + "'" + tartaruga.getTarghetta() + "'" + "," + tartaruga.getSede() + "," + tartaruga.getVasca() + ");";
    final String QUERY3 = "INSERT INTO tartaruga(nome,targhetta,id_sede,id_vasca)VALUES(" + "'"
        + tartaruga.getNome() + "'" + "," + "'" + tartaruga.getTarghetta() + "'" + "," + tartaruga.getSede() + "," + tartaruga.getVasca() + ");";


    try (Connection conn = DriverManager.getConnection(Database.DB_URL, Database.USER, Database.PASS);
        Statement stmt = conn.createStatement();
        
        ResultSet rs1 = stmt.executeQuery(QUERY1);) {
          while (rs1.next()) {
            if(rs1.getString("numero").equals("1")){
              ResultSet rs2 = stmt.executeQuery(QUERY2);
            }
            else {
              ResultSet rs3 = stmt.executeQuery(QUERY3);
            }
          }
    } catch (SQLException error) {
      error.printStackTrace();
    }
    return;

  }
    
}
