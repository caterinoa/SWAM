package it.unifi.swam.domainmodel;

import java.util.Map;

import javax.persistence.Entity;

@Entity
public class Song {
	
	private Map<Language, LocalizedSong> localizations;
	private String title;
	private String artist;
	private String lyrics;
//	public TranslatableField exegesis;

}
