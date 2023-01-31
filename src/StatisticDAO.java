import java.sql.*;

public class StatisticDAO {
    
    public String[] getStatistics(int mese, int anno) {
        String[] item = new String[3]; 
      final String QUERY = "SELECT COUNT(id_tartaruga) AS num_tartarughe FROM tartaruga";
      final String QUERY2 = "SELECT COUNT(*) as num_month FROM cartella_clinica WHERE EXTRACT(MONTH FROM data_di_ritrovamento) = '" + mese + "'" + ";";
      final String QUERY3 = "SELECT SUM(pinne + coda + testa + occhi + naso + becco + collo)/(COUNT(pinne) + COUNT(coda)+ COUNT(collo)+ COUNT(becco)+ COUNT(naso)+ COUNT(occhi)+ COUNT(testa)) as prova FROM statodisalute NATURAL JOIN cartella_clinica WHERE EXTRACT(YEAR FROM data_di_ritrovamento) = '" + anno + "';" ;
        try (Connection conn = DriverManager.getConnection(Database.DB_URL, Database.USER, Database.PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);) {
                while(rs.next()){
                    item[0] = rs.getString("num_tartarughe");
                }
                ResultSet rs2 = stmt.executeQuery(QUERY2);
                while(rs2.next()){
                    item[1] = rs2.getString("num_month");
                }

                ResultSet rs3 = stmt.executeQuery(QUERY3);
                while(rs3.next()){
                    item[2] = rs3.getString("prova");
                }
                /* 
                while(rs2.next()){
                    item[1] = rs2.getString("num_month");
                }
                */
        } catch (SQLException error) {
          error.printStackTrace();
        }
        return item;
    
      }
    
}