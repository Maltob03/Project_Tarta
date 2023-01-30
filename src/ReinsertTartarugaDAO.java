import java.sql.*;

public class ReinsertTartarugaDAO {

    public void inserisciTartaruga(Tartaruga tartaruga) {
    final String QUERY = "select nome,targhetta from tartaruga where targhetta = " + "'" + ReinserimentoPanel1.research.getText() + "'";
    try (Connection conn = DriverManager.getConnection(Database.DB_URL, Database.USER, Database.PASS);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(QUERY);) {
            while (rs.next()) {

                String targhetta = rs.getString("targhetta");
                String nome = rs.getString("nome");
                final String QUERY2 = "INSERT INTO tartaruga(nome,targhetta,id_sede,id_vasca)VALUES(" + "'"
        + nome + "'" + "," + "'" + targhetta + "'" + "," + tartaruga.getSede() + "," + tartaruga.getVasca() + ");";
                ResultSet rs2 = stmt.executeQuery(QUERY2);
                System.out.println(QUERY2);
        
        
                
        
                // risultati è il titolo della finestra
              }
    } catch (SQLException error) {
      error.printStackTrace();
    }
    return;

  }
    
}
