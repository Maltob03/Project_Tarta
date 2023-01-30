import java.sql.*;

public class ReinsertCartellaClinicaDAO {


    public void reinserisciCartellaClinica(CartellaClinicaModel cartella) {
      final String QUERY = "select specie from cartella_clinica where id_cartella_clinica = 1";// + "'" + ReinserimentoPanel1.research.getText() + "'";
      
        try (Connection conn = DriverManager.getConnection(Database.DB_URL, Database.USER, Database.PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);) {
                while(rs.next()){
                    String specie = rs.getString("specie");
                    final String QUERY2 = "INSERT INTO cartella_clinica (specie,lunghezza,larghezza,peso,luogo_di_ritrovamento,data_di_ritrovamento) VALUES('"
      + specie + "'" + "," + cartella.getLunghezza() + "," + cartella.getLarghezza() + "," + cartella.getPeso() + ", '" + cartella.getLuogo() + "', '" + cartella.getData()
      + "');";
      ResultSet rs2 = stmt.executeQuery(QUERY2);
                }
        } catch (SQLException error) {
          error.printStackTrace();
        }
        return;
    
      }
    
}
