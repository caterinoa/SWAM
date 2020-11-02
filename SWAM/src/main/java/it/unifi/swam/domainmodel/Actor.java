package it.unifi.swam.domainmodel;

import java.sql.Date;
import java.util.List;

import com.google.common.collect.Lists;

public class Actor extends Person {
	
	private List<Character> characters;

	public Actor(String name, String surname, String country, Date birthDate) {
		super(name, surname, country, birthDate);
		this.characters = Lists.newLinkedList();
	}
	
	public List<Character> getCharacters(){
		return this.characters;
	}
	
	public void addCharacter(Character character) {
		if (!characters.contains(character)) {
			this.characters.add(character);
		}
	}

}
