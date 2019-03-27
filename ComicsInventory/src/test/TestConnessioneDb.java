package test;

import app.ConnectionDb;
import app.FumettoDbManager;
import org.junit.jupiter.api.Test;

import java.sql.*;

class TestConnessioneDb {

	@Test
	void testConnessioneDb() {
		ConnectionDb connect = new ConnectionDb();
		connect.connessioneDb();
	}

	@Test
	void testApriChiudiConnessioneDb() {
		ConnectionDb connect = new ConnectionDb();
		FumettoDbManager fDB = new FumettoDbManager();
		Connection conn = connect.apriConnessioneDb();
		PreparedStatement prepared;
		try {
			prepared = conn
					.prepareStatement("insert into fumetto (id, titolo, numero, data_uscita, ordinato, mancante, descrizione) values (?,?,?,?,?,?,?)");
			//prepared.setInt(1, 3);
			prepared.setInt(1, fDB.getMaxId()+1);
			prepared.setString(2, "Titolo di prova5");
			prepared.setInt(3, 2);
			prepared.setDate(4, Date.valueOf("2019-01-10"));
			prepared.setString(5, "F");
			prepared.setString(6, String.valueOf('F'));
			prepared.setString(7, "Descrizione di prova5");
			prepared.executeUpdate();
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery("select * from fumetto");
			while (rs.next()) {
				System.out
				.println(rs.getString("titolo") + " " + rs.getString("numero") );
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		connect.chiudiConnessioneDb(conn);
	}
}
