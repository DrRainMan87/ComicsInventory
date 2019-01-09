package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;

public class ConnectionDb {

	public void connessioneDb() {

		String connectionString="jdbc:mysql://localhost:3306/ComicsInventoryDb?user=ComicsInventoryUser&password=ComicsInventoryUser1&serverTimezone=UTC";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(connectionString);
			PreparedStatement prepared = connection
					.prepareStatement("insert into fumetto (id, titolo, numero, data_uscita, ordinato, mancante, descrizione) values (?,?,?,?,?,?,?)");
			prepared.setInt(1, 1);
			prepared.setString(2, "Titolo di prova");
			prepared.setInt(3, 1);
			prepared.setDate(4, Date.valueOf("2019-01-03"));
			prepared.setString(5, "F");
			prepared.setString(6, String.valueOf('F'));
			prepared.setString(7, "Descrizione di prova");
			prepared.executeUpdate();
			Statement stm = connection.createStatement();
			ResultSet rs = stm.executeQuery("select * from fumetto");
			while (rs.next()) {
				System.out
						.println(rs.getString("titolo") + " " + rs.getString("numero") );
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// gestione errore in chiusura
			}
		}
	}
	
	//apri e chiudi connessione andranno richiamate dentro un try catch
	public Connection apriConnessioneDb(){
		String connectionString="jdbc:mysql://localhost:3306/ComicsInventoryDb?user=ComicsInventoryUser&password=ComicsInventoryUser1&serverTimezone=UTC";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection connection = null;

			try {
				connection = DriverManager.getConnection(connectionString);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return connection;
	}
	//Rileggere differenza tra try catch e throws
	public void chiudiConnessioneDb(Connection connection){
		if (connection != null)
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
