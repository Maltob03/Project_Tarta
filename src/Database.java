import java.sql.*;

public class Database {

  // La keyword static serve invece a far si che un attributo di una classe non
  // sia proprio dell'istanza ma comune all'oggetto.
  static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/project_tarta";
  static final String USER = "postgres";
  static final String PASS = "admin";

  // public posso usare il metodo ovunque in qualsiasi classe
  // CAMBIA CERCA TARTARUGA CON fillDataTartaruga

}
