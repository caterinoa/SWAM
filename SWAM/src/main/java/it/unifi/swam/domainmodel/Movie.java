package it.unifi.swam.domainmodel;

import java.time.Duration;
import java.time.Year;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.Maps;

public class Movie {

	private Map<Language, LocalizedMovie> localizations;
	private String plot;
	private Duration lenght;
	private Year year;
	private Set<Genre> genre;
	private Soundtrack soundtrack;
	private Rating rating;
	private Collection<FilmCompany> filmCompany;
	private Collection<Character> characters;
	private Collection<Director> director;

	public Movie() {
		super();
		this.localizations = Maps.newHashMap();
	}
	
	public String getTitle(Language locale) {
		return this.localizations.get(locale).getTitle();
	}

	public void addLocMovie(Language l, LocalizedMovie locM) {
		localizations.put(l, locM);
	}
}
