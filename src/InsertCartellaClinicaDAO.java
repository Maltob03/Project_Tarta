import java.sql.*;

public class InsertCartellaClinicaDAO {


    public void inserisciCartellaClinica(CartellaClinicaModel cartella) {
        final String QUERY = "INSERT INTO Cartella_Clinica (id_cartella_clinica,specie,lunghezza,larghezza,peso,luogo_di_ritrovamento,data_di_ritrovamento,id_tartaruga,id_)VALUES(12,"
            + "'"
            + cartella.getSpecie() + "'" + "," + "'" + cartella.getLunghezza() + "'" + "," + cartella.getLarghezza() + "," + cartella.getPeso() + "," + cartella.getLuogo() + "," + "," + cartella.getData()
            + ");";
        try (Connection conn = DriverManager.getConnection(Database.DB_URL, Database.USER, Database.PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);) {
        } catch (SQLException error) {
          error.printStackTrace();
        }
        return;
    
      }
    
}
