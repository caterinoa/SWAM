package it.unifi.swam.domainmodel;

import java.sql.Date;
import java.util.Map;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.google.common.collect.Maps;


@Entity
@Table(name = "persons")
public abstract class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	/*
	 * TO CHECK In Java the fields should be 'protected' to be accessible in the
	 * subclasses! Maybe they need to be public for JPA?
	 */
	private String name;
	private String surname;
	private String country;
	private Map<Language, LocalizedPerson> localizations;
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	
	public Person(String name, String surname, String country, Date birthDate) {
		super();
		this.name = name;
		this.surname = surname;
		this.country = country;
		this.localizations = Maps.newHashMap();
		this.birthDate = birthDate;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public String getBiography(Language language) {
		LocalizedPerson locPerson = this.localizations.get(language);
		return locPerson.getBiography();
	}

	public void setBiography(Language language, String biography) {
		LocalizedPerson locPerson = new LocalizedPerson(this, biography);
		this.localizations.put(language, locPerson);
	}
	
	public Date getBirthDate() {
		return this.birthDate;
	}
}
