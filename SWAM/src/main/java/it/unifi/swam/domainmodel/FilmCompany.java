package it.unifi.swam.domainmodel;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class FilmCompany {
	
	private String name;

	@ManyToMany(mappedBy="filmCompanies")
	private Set<Movie> movies;

	public FilmCompany(String name) {
		super();
		this.name = name;
	}	

}
