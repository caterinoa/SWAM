package it.unifi.swam.domainmodel;

import java.util.Collection;

public class Warehouse {
	
	private String address;
	private int capacity;
	private Collection<Movie> movies;
	
	public Warehouse(String address, int capacity) {
		super();
		this.address = address;
		this.capacity = capacity;
	}
	
}
