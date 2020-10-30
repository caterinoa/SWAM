package it.unifi.swam.dbms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public final class DatabaseManager {

	private static final DatabaseManager DATABASE = new DatabaseManager();
	private final String db_url = "jdbc:mariadb://localhost:3307/zzz_ciao";
	private final String user = "root";
	private final String password = "";
	private Connection connection;

	private DatabaseManager() {
		super();
	}

	public static DatabaseManager getDatabaseInstance() {
		return DATABASE;
	}

	public void connect() throws SQLException, ClassNotFoundException {
		Class.forName("org.mariadb.jdbc.Driver");
		connection = DriverManager.getConnection(this.db_url, this.user, this.password);
		System.out.println("Successfully connected to database.");
	}

	public ResultSet executeQuery(String sqlQuery) throws SQLException {
		Statement statement = null;
		statement = connection.createStatement();
		ResultSet result = statement.executeQuery(sqlQuery);
		return result;
	}

	public void disconnect() throws SQLException {
		if (connection != null) {
			connection.close();
		}
	}

}
