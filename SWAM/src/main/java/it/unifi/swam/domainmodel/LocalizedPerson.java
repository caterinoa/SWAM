package it.unifi.swam.domainmodel;

public class LocalizedPerson {
	
	private Person person;
	private String biography;
	
	public LocalizedPerson(Person person, String biography) {
		super();
		this.person = person;
		this.biography = biography;
	}

	public String getBiography() {
		return this.biography;
	}

}
