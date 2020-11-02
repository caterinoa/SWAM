package it.unifi.swam.domainmodel;

import java.util.List;
import com.google.common.collect.Lists;
import java.sql.Date;

public class Director extends Person {

	private List<Movie> movies;

	public Director(String name, String surname, String country, Date birthDate) {
		super(name, surname, country, birthDate);
		this.movies = Lists.newLinkedList();

	}

	public List<Movie> getMovies() {
		return this.movies;
	}

	public void addMovie(Movie movie) {
		if (!movies.contains(movie)) {
			this.movies.add(movie);
		}
	}

}
