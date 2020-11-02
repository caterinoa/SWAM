package it.unifi.swam.domainmodel;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public abstract class Localization {
	
	@Enumerated(EnumType.STRING)
	protected Language language;
	
}
