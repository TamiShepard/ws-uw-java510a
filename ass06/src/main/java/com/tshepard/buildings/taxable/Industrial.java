package com.tshepard.buildings.taxable;

import com.tshepard.buildings.Building;

/**
 * Class to create residential buildings, extended from the Buildings class
 * 
 * @author thugf
 */
public class Industrial extends Building {

	// Constants for capacity, cost, and type of building
	public static final int INDUSTRIAL_CAPACITY = 325;
	public static final double INDUSTRIAL_COST = 200.00;
	public static final String INDUSTRIAL_TYPE = "Industrial";
	
	// Create building (cost, type, capacity, and if it pays taxes)
	public Industrial() {
		super(INDUSTRIAL_COST, INDUSTRIAL_TYPE, INDUSTRIAL_CAPACITY, true);
	}

}
