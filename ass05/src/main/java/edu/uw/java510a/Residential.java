package edu.uw.java510a;

/**
 * Class to create residential buildings, extended from the Buildings class
 *  
 * @author thugf
 */
public class Residential extends Building {
	
	// Constants for capacity, cost and type of residential buildings
	public static final int RESIDENTIAL_CAPACITY = 100;				
	public static final double RESIDENTIAL_COST = 200.00;
	public static final String RESIDENTIAL_TYPE = "Residential";
	
	// Create residential building 
	public Residential() {
		super(RESIDENTIAL_COST, RESIDENTIAL_TYPE, RESIDENTIAL_CAPACITY);
	}

}
