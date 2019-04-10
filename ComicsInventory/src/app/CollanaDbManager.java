package app;

import java.sql.*;

public class CollanaDbManager {
	//TODO
	public void inserisciCollana(Collana c) {
		//TODO - modificare metodo per la collana
		ConnectionDb connect = new ConnectionDb();
		Connection conn = connect.apriConnessioneDb();
		PreparedStatement prepared;
		try {
			prepared = conn.prepareStatement(
					"insert into collana (id, nome, casa_editrice, descrizione) values (?,?,?,?)");
			prepared.setInt(1, this.getMaxId()+1);
			prepared.setString(2, c.getNome());
			prepared.setString(3, c.getCasaEditrice());
			prepared.setString(4, c.getDescrizione());
			prepared.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		connect.chiudiConnessioneDb(conn);
	}
	
	public void modificaCollana(Collana c) {
		//TODO
	}
	
	public void cancellaCollana() {
		//TODO
	}
	
	public void cercaCollana() {
		//TODO
	}

	//Query che trova l'id MAX sul DB e lo restituisce, poi dove lo richiamo faccio +1
	public int getMaxId() {
		ConnectionDb connect = new ConnectionDb();
		Connection conn = connect.apriConnessioneDb();
		PreparedStatement prepared;
		int resultId = 0;
		try {
			prepared = conn.prepareStatement(
					"SELECT max(id) FROM collana");
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
