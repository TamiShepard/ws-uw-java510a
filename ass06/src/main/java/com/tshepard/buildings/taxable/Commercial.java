package com.tshepard.buildings.taxable;

import com.tshepard.buildings.Building;

/**
 * Class to create commercial buildings, extended from the Buildings class
 * 
 * @author thugf
 */
public class Commercial extends Building {
	
	// Constants for capacity, cost and type of building 
	public static final int COMMERCIAL_CAPACITY = 250;				
	public static final double COMMERCIAL_COST = 200.00;
	public static final String COMMERCIAL_TYPE = "Commercial";
	
	// Create building (cost, type, capacity, and if it pays taxes)
	public Commercial() {
		super(COMMERCIAL_COST, COMMERCIAL_TYPE, COMMERCIAL_CAPACITY, true);
	}

}
