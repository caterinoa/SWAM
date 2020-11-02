package it.unifi.swam.domainmodel;

import javax.persistence.Embedded;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class CharacterVoice {
	
	private Character character;
	private Dubber dubber;
	@Embedded
	private Locale locale;
	@Enumerated(EnumType.STRING)
	private Language language;

}
