

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
        String nome = rs.getString("nome");
        turtle.setNome(nome);
        String targhetta = rs.getString("targhetta");
        turtle.setTarghetta(targhetta);
        int sede = rs.getInt("id_sede");
        turtle.setSede(sede);
        int vasca = rs.getInt("id_vasca");
        turtle.setVasca(vasca);


        String specie = rs.getString("specie");
        cartella.setSpecie(specie);
        int lunghezza = rs.getInt("lunghezza");
        cartella.setLunghezza(lunghezza);
        int larghezza = rs.getInt("larghezza");
        cartella.setLarghezza(larghezza);
        int peso = rs.getInt("peso");
        cartella.setPeso(peso);
        String luogo = rs.getString("luogo_di_ritrovamento");
        cartella.setLuogo(luogo);

        
        int testa = rs.getInt("testa");
        salute.setTesta(testa);
        int occhi = rs.getInt("occhi");
        salute.setOcchi(occhi);
        int naso = rs.getInt("naso");
        salute.setNaso(naso);
        int becco = rs.getInt("becco");
        salute.setBecco(becco);
        int collo = rs.getInt("collo");
        salute.setCollo(collo);
        int pinne = rs.getInt("pinne");
        salute.setPinne(pinne);
        int coda = rs.getInt("coda");
        salute.setCoda(coda);


        new ViewResultFrame(turtle.getNome(), turtle.getTarghetta(), turtle.getSede(), turtle.getVasca(), cartella.getSpecie(), cartella.getLunghezza(),cartella.getLarghezza(),cartella.getPeso(),cartella.getLuogo(),salute.getTesta(),salute.getOcchi(),salute.getNaso(),salute.getBecco(),salute.getCollo(),salute.getPinne(),salute.getCoda()).setVisible(true);

        // risultati è il titolo della finestra
      }
    } catch (SQLException error) {
      error.printStackTrace();
    }
    return;

  }

  public void inserisciTartaruga(String nome, String targhetta, int sede, int vasca) {
    final String QUERY = "INSERT INTO tartaruga(id_tartaruga,nome,targhetta,id_sede,id_vasca)VALUES(12," + "'"
        + nome + "'" + "," + "'" + targhetta + "'" + "," + sede + "," + vasca + ");";
    try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(QUERY);) {
    } catch (SQLException error) {
      error.printStackTrace();
    }
    return;

  }
 //ce ne vuole un altra per lo stato di salute
  public void inserisciCartellaClinica(String specie, float lunghezza, float larghezza, float peso, String luogo,
      String data) {
    final String QUERY = "INSERT INTO Cartella_Clinica (id_cartella_clinica,specie,lunghezza,larghezza,peso,luogo_di_ritrovamento,data_di_ritrovamento,id_tartaruga,id_)VALUES(12,"
        + "'"
        + specie + "'" + "," + "'" + lunghezza + "'" + "," + larghezza + "," + peso + "," + luogo + "," + "," + data
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
