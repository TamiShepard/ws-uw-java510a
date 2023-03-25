package com.tshepard.buildings.taxable;

import com.tshepard.buildings.Building;

/**
 * Class to create residential buildings, extended from the Buildings class
 * 
 * @author thugf
 */
public class Residential extends Building {

	// Constants for capacity, cost, and type of building
	public static final int RESIDENTIAL_CAPACITY = 200;				
	public static final double RESIDENTIAL_COST = 200.00;
	public static final String RESIDENTIAL_TYPE = "Residential";
	
	// Create building (cost, type, capacity, and if it pays taxes)
	public Residential() {
		super(RESIDENTIAL_COST, RESIDENTIAL_TYPE, RESIDENTIAL_CAPACITY, true);
	}

}
