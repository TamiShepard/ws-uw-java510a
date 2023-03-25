package com.tshepard.buildings;
/**
 * Class to create utility buildings, extended from the Buildings class
 * 
 * @author thugf
 */
public class Utility extends Building {

	// Constants  capacity, cost, type of building, and if it pays taxes.
	public static final int UTILITY_CAPACITY = 600;
	public static final double UTILITY_COST = 1000.00;
	public static final String UTILITY_TYPE = "Utility";
	
	// Create building (cost, type, capacity, and if it pays taxes)
	public Utility() {
		super(UTILITY_COST, UTILITY_TYPE, UTILITY_CAPACITY, false);
	}

}
