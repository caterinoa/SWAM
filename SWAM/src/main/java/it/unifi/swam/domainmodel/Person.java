package it.unifi.swam.domainmodel;

import java.sql.Date;

public abstract class Person {
	
	/* TO CHECK
	 * In Java the fields should be 'protected' to be accessible in the subclasses!
	 * Maybe they need to be public for JPA?
	 */
	public String name;
	public String surname;
	public String country;
//	public TranslatableField biography;
	public Date birthDate;

}
