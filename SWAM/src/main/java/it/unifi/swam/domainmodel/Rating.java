package it.unifi.swam.domainmodel;

import javax.persistence.Embeddable;

@Embeddable
public enum Rating {
	
	T,
	VPA,
	VM12,
	VM14,
	VM18;
	
}
