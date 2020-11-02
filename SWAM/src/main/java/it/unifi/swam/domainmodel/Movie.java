package it.unifi.swam.domainmodel;

import java.time.Duration;
import java.time.Year;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.google.common.collect.Maps;

import it.unifi.swam.businesslogic.DurationConverter;
import it.unifi.swam.businesslogic.YearConverter;

@Entity
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
	private Map<Language, LocalizedMovie> localizations;
	
	
	@Lob
	private String plot;

	@Convert(converter = DurationConverter.class)
	private Duration lenght;

	@Convert(converter = YearConverter.class)
	private Year year;
	
	@Enumerated(EnumType.STRING)
	private Collection<Genre> genre;
	private Soundtrack soundtrack;
	
	@Enumerated(EnumType.STRING)
	private Rating rating;
	
	@ManyToMany
	@JoinTable(name = "budgets",
		joinColumns = {@JoinColumn(name = "movie_id")},
		inverseJoinColumns = {@JoinColumn(name = "filmcompany_id")})
	private Set<FilmCompany> filmCompanies;
	
	
	private Collection<Character> characters;
	private Collection<Director> directors;
	private Warehouse warehouse;

	public Movie() {
		super();
		this.localizations = Maps.newHashMap();
	}
	
	public Long getId() {
		return this.id;
	}
	
	public String getTitle(Language locale) {
		return this.localizations.get(locale).getTitle();
	}

	public void addLocMovie(Language l, LocalizedMovie locM) {
		localizations.put(l, locM);
	}
	
	
}
