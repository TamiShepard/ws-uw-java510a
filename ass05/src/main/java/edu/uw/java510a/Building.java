package edu.uw.java510a;

/**
 * Abstract class for creating buildings.
 * 
 * @author thugf
 */
public abstract class Building {
	
	private double buildingCost;	// Cost of the building
	private String buildingType;	// Type of building (i.e. Residential / Utility, etc)
	private int capacity;			// Capacity of the building
	
	/**
	 * Constructor.
	 * 
	 * @param buildingCost - cost of the building
	 * @param buildingType - type of the building
	 * @param capacity - building capacity
	 */
	public Building(double buildingCost, String buildingType, int capacity) {
		this.buildingCost = buildingCost;
		this.buildingType = buildingType;
		this.capacity = capacity;
	}

	/**
	 * Getter for building cost
	 * @return buildingCost
	 */
	public double getBuildingCost() {
		return buildingCost;
	}

	/**
	 * Setter for buildingCost
	 * @param buildingCost cost of the building
	 */
	public void setBuildingCost(int buildingCost) {
		this.buildingCost = buildingCost;
	}

	/**
	 * Getter for building type
	 * @return buildingType
	 */
	public String getBuildingType() {
		return buildingType;
	}

	/**
	 * Setter for building type
	 * @param buildingType type of the building
	 */
	public void setBuildingType(String buildingType) {
		this.buildingType = buildingType;
	}

	/**
	 * Getter for capacity
	 * @return capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * Setter for capacity
	 * @param capacity capacity of the building
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	/**
	 * To string method.
	 * @return String containing details about the building.
	 */
	@Override
	public String toString() {
		return "Building [buildingCost=" + buildingCost + ", buildingType=" + buildingType + ", capacity=" + capacity + "]";
	}
	
}
