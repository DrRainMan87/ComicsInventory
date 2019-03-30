package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CollanaDbManager {
	//TODO
	public void inserisciCollana(Collana c) {
		//TODO
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
