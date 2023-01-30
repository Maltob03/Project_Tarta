import java.sql.*;

public class ValutazioneDAO {
    
    public void InserisciValutazione(StatoSaluteModel valutazione) {
      final String QUERY = "INSERT INTO statodisalute(testa,occhi,naso,becco,collo,pinne,coda)VALUES(" + "'"
            + valutazione.getTesta() + "," + valutazione.getOcchi() + "," + valutazione.getNaso() + "," + valutazione.getBecco() + "," + valutazione.getCollo() + "," + valutazione.getPinne() + "," + valutazione.getCoda() + ");";
        try (Connection conn = DriverManager.getConnection(Database.DB_URL, Database.USER, Database.PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);) {
        } catch (SQLException error) {
          error.printStackTrace();
        }
        return;
    
      }
    
}
