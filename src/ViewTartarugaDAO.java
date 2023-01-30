import java.sql.*;

public class ViewTartarugaDAO {

    public void cercaTartaruga(String id) {
        Tartaruga turtle = new Tartaruga();
        CartellaClinicaModel cartella = new CartellaClinicaModel();
        StatoSaluteModel salute = new StatoSaluteModel();
        final String QUERY = "SELECT Id_tartaruga, Nome, Targhetta, Id_Sede, Id_Vasca, Specie, Lunghezza, Larghezza, Peso, Luogo_Di_Ritrovamento, Data_Di_Ritrovamento, Testa, Occhi, Naso, Becco, Collo, Pinne, Coda FROM Tartaruga NATURAL JOIN Cartella_Clinica NATURAL JOIN StatoDiSalute WHERE id_tartaruga = "
            + id;
        try (Connection conn = DriverManager.getConnection(Database.DB_URL, Database.USER, Database.PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);) {
          while (rs.next()) {
    
            // Display values
            turtle.setNome(rs.getString("nome"));
            turtle.setTarghetta(rs.getString("targhetta"));
            turtle.setSede(rs.getInt("id_sede"));
            turtle.setVasca(rs.getInt("id_vasca"));
    
    
            
            cartella.setSpecie(rs.getString("specie"));
            cartella.setLunghezza( rs.getInt("lunghezza"));
            cartella.setLarghezza(rs.getInt("larghezza"));
            cartella.setPeso(rs.getInt("peso"));
            cartella.setLuogo(rs.getString("luogo_di_ritrovamento"));
    
            
            salute.setTesta(rs.getInt("testa"));
            salute.setOcchi(rs.getInt("occhi"));
            salute.setNaso(rs.getInt("naso"));
            salute.setBecco(rs.getInt("becco"));
            salute.setCollo(rs.getInt("collo"));
            salute.setPinne(rs.getInt("pinne"));
            salute.setCoda(rs.getInt("coda"));
    
    
            new ViewResultFrame(turtle,cartella, salute).setVisible(true);
    
            // risultati è il titolo della finestra
          }
        } catch (SQLException error) {
          error.printStackTrace();
        }
        return;
    
      }
    
}
