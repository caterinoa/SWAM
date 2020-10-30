package it.unifi.swam.domainmodel;

public class LocalizedMovie extends Localization {
	
	private Movie movie;
	private String title;

	public String getTitle() {
		return this.title;
	}

	public LocalizedMovie(Language language, String title) {
		super();
		this.language = language;
		this.title = title;
	}
			
}
