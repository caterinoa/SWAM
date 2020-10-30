package it.unifi.swam.domainmodel;

public class Item {
	
	private Movie movie;
	private Warehouse warehouse;
	private int numCopies;
	private String wareHousePosition;
	
	public Item(int numCopies, String wareHousePosition) {
		super();
		this.numCopies = numCopies;
		this.wareHousePosition = wareHousePosition;
	}

}
