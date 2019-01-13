package test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.Test;

import app.ConnectionDb;

class TestConnessioneDb {

	@Test
	void testConnessioneDb() {
		ConnectionDb connect = new ConnectionDb();
		connect.connessioneDb();
	}
	
	@Test
	void testApriChiudiConnessioneDb() {
		ConnectionDb connect = new ConnectionDb();
		Connection conn = connect.apriConnessioneDb();
		PreparedStatement prepared;
		try {
			prepared = conn
					.prepareStatement("insert into fumetto (id, titolo, numero, data_uscita, ordinato, mancante, descrizione) values (?,?,?,?,?,?,?)");
			prepared.setInt(1, 2);
			prepared.setString(2, "Titolo di prova2");
			prepared.setInt(3, 2);
			prepared.setDate(4, Date.valueOf("2019-01-10"));
			prepared.setString(5, "F");
			prepared.setString(6, String.valueOf('F'));
			prepared.setString(7, "Descrizione di prova2");
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
