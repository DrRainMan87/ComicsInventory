package app;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FumettoDbManager implements IFumettoDbManager {
    //TODO
    public void inserisciFumettoInCollana(Fumetto f) {
        //TODO
    }

    public void inserisciFumetto(Fumetto f) {
        ConnectionDb connect = new ConnectionDb();
        Connection conn = connect.apriConnessioneDb();
        PreparedStatement prepared;
        try {
            prepared = conn.prepareStatement(
                    "insert into fumetto (id, titolo, numero, data_uscita, ordinato, mancante, descrizione) values (?,?,?,?,?,?,?)");
            //Sarebbe da richiamare la getMaxId per l'id del fumetto
            prepared.setInt(1, this.getMaxId()+1);
            prepared.setString(2, f.getTitolo());
            prepared.setInt(3, f.getNumero());
            // prepared.setDate(4, Date.valueOf("2019-01-10"));
            prepared.setDate(4, (Date) f.getDataDiUscita());
            ;
            prepared.setBoolean(5, f.getOrdinato());
            prepared.setBoolean(6, f.getMancante());
            prepared.setString(7, f.getDescrizione());
            prepared.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        connect.chiudiConnessioneDb(conn);
    }

    public void modificaFumetto(Fumetto f) {
        //TODO - Forse come parametri ci vogliono i dati da modificare e se ci sono dei null quei campi non andranno modificati
    }

    public void cancellaFumetto(Fumetto f) {
        //Da Testare
        ConnectionDb connect = new ConnectionDb();
        Connection conn = connect.apriConnessioneDb();
        PreparedStatement prepared;
        try {
            prepared = conn.prepareStatement(
                    "delete fumetto where id = ?");
            prepared.setInt(1, f.getId());
            prepared.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        connect.chiudiConnessioneDb(conn);
    }

    public boolean cercaFumetto(Fumetto f) {
        //Da Testare
        ConnectionDb connect = new ConnectionDb();
        Connection conn = connect.apriConnessioneDb();
        PreparedStatement prepared;
        boolean find = false;
        try {
            prepared = conn.prepareStatement(
                    "select * from fumetto where id = ?");
            prepared.setInt(1, f.getId());
            prepared.executeQuery();
            if (prepared.getResultSet() != null){
                find = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        connect.chiudiConnessioneDb(conn);
        return find;
    }

    //Query che trova l'id MAX sul DB e lo restituisce, poi dove lo richiamo faccio +1
    public int getMaxId() {
        ConnectionDb connect = new ConnectionDb();
        Connection conn = connect.apriConnessioneDb();
        PreparedStatement prepared;
        int resultId = 0;
        try {
            prepared = conn.prepareStatement(
                    "SELECT max(id) FROM fumetto");
            ResultSet result = prepared.executeQuery();
            while (result.next()) {
                resultId = result.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        connect.chiudiConnessioneDb(conn);
        return resultId;
    }
}
