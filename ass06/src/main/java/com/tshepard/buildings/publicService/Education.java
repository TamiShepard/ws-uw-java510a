package com.tshepard.buildings.publicService;

import com.tshepard.buildings.Building;
import com.tshepard.city.CityFunctions;
/**
 * Class to create educational buildings, extended from the Buildings class, 
 * and also implementing the CityFunctions to get the operating costs.
 * @author thugf
 */
public class Education extends Building implements CityFunctions {

	// Constants for capacity, cost and type of building, as well as its operating costs 
	public static final int EDUCATION_CAPACITY = 1000;
	public static final double EDUCATION_COST = 500.00;
	public static final String EDUCATION_TYPE = "Education";
	public static final double EDUCATION_OPERATING_COST = 100.00;
	
	// Create building (cost, type, capacity, and if it pays taxes)
	public Education() {
		super(EDUCATION_COST, EDUCATION_TYPE, EDUCATION_CAPACITY, false);
	}

	/**
	 * Operating costs for educational buildings
	 * @return  EDUCATION_OPERATING_COST (the cost to run this educational building)
	 */
	@Override
	public double getOperatingCosts() {
		return EDUCATION_OPERATING_COST;
	}

}
