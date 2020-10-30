import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		
		// Just a test for MariaDB
		DatabaseManager db = DatabaseManager.getDatabaseInstance();
		try {
			db.connect();
			ResultSet results = db.executeQuery("SELECT * FROM ciao");
			System.out.println("\nid\tName\tAge\n");
			while (results.next()) {
				System.out.println(results.getString(1) + "\t" + results.getString(2) + "\t" + results.getString(3));
			}
			System.out.println();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
