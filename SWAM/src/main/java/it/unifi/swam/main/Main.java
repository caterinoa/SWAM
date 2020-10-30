package it.unifi.swam.main;
import java.sql.ResultSet;
import java.sql.SQLException;

import it.unifi.swam.dbms.DatabaseManager;
import it.unifi.swam.domainmodel.Language;
import it.unifi.swam.domainmodel.LocalizedMovie;
import it.unifi.swam.domainmodel.Movie;
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
			db.disconnect();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
//		Movie m = new Movie();
//		m.addLocMovie(Language.ITA, new LocalizedMovie(Language.ITA,"A"));
//		m.addLocMovie(Language.ENG, new LocalizedMovie(Language.ENG,"B"));
//		System.out.println();
//		System.out.println(m.getTitle(Language.ENG));
	}
	
}