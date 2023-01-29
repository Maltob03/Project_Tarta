

import java.sql.*;

public class Database {

  // La keyword static serve invece a far si che un attributo di una classe non
  // sia proprio dell'istanza ma comune all'oggetto.
  static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/project_tarta";
  static final String USER = "postgres";
  static final String PASS = "admin";

  // public posso usare il metodo ovunque in qualsiasi classe
  // CAMBIA CERCA TARTARUGA CON fillDataTartaruga
  public void cercaTartaruga(String id) {
    Tartaruga turtle = new Tartaruga();
    CartellaClinicaModel cartella = new CartellaClinicaModel();
    StatoSaluteModel salute = new StatoSaluteModel();
    final String QUERY = "SELECT Id_tartaruga, Nome, Targhetta, Id_Sede, Id_Vasca, Specie, Lunghezza, Larghezza, Peso, Luogo_Di_Ritrovamento, Data_Di_Ritrovamento, Testa, Occhi, Naso, Becco, Collo, Pinne, Coda FROM Tartaruga NATURAL JOIN Cartella_Clinica NATURAL JOIN StatoDiSalute WHERE id_tartaruga = "
        + id;
    try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
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


        new ViewResultFrame(turtle,cartella,salute).setVisible(true);

        // risultati è il titolo della finestra
      }
    } catch (SQLException error) {
      error.printStackTrace();
    }
    return;

  }

  public void inserisciTartaruga(Tartaruga tartaruga) {
    final String QUERY = "INSERT INTO tartaruga(id_tartaruga,nome,targhetta,id_sede,id_vasca)VALUES(12," + "'"
        + tartaruga.getNome() + "'" + "," + "'" + tartaruga.getTarghetta() + "'" + "," + tartaruga.getSede() + "," + tartaruga.getVasca() + ");";
    try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(QUERY);) {
    } catch (SQLException error) {
      error.printStackTrace();
    }
    return;

  }
 //ce ne vuole un altra per lo stato di salute
  public void inserisciCartellaClinica(CartellaClinicaModel cartella) {
    final String QUERY = "INSERT INTO Cartella_Clinica (id_cartella_clinica,specie,lunghezza,larghezza,peso,luogo_di_ritrovamento,data_di_ritrovamento,id_tartaruga,id_)VALUES(12,"
        + "'"
        + cartella.getSpecie() + "'" + "," + "'" + cartella.getLunghezza() + "'" + "," + cartella.getLarghezza() + "," + cartella.getPeso() + "," + cartella.getLuogo() + "," + "," + cartella.getData()
        + ");";
    try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(QUERY);) {
    } catch (SQLException error) {
      error.printStackTrace();
    }
    return;

  }

}
