package it.unifi.swam.domainmodel;

import java.time.Year;
import java.util.Collection;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Soundtrack {

	@Id
	@GeneratedValue
	private Long id;

	private String title;
	private Year year;

	private Collection<Song> songs;

}
