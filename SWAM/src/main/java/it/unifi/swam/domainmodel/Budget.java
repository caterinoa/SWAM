package it.unifi.swam.domainmodel;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class Budget {
	
	@EmbeddedId
	private Long id; 
	
	@ManyToOne
	@MapsId("movie_id")
	private Movie movie;
	
	@ManyToOne
	@MapsId("filmcompany_id")
	private FilmCompany filmCompany;
	
	private int dollars;

	public Budget(int dollars) {
		super();
		this.dollars = dollars;
	}
	

}
