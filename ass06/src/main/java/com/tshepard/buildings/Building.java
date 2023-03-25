package com.tshepard.buildings;
/**
 * Abstract class for creating buildings.
 * 
 * @author thugf
 */
public abstract class Building {
	
	private double buildingCost;	// Cost of the building
	private String buildingType;	// Type of building (i.e. Residential / Utility, etc)
	private int capacity;			// Capacity of the building
	private boolean paysTaxes;		// Indicates if building pays taxes 
	
	/**
	 * Constructor.
	 * 
	 * @param buildingCost
	 * @param buildingType
	 * @param capacity
	 * @param paysTaxes 
	 */
	public Building(double buildingCost, String buildingType, int capacity, boolean paysTaxes) {
		this.buildingCost = buildingCost;
		this.buildingType = buildingType; 
		this.capacity = capacity;
		this.paysTaxes = paysTaxes;
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
	 * @param buildingCost
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
	 * @param buildingType
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
	 * @param capacity
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	/**
	 * Getter for paysTaxes
	 * @return paysTaxes
	 */
	public boolean isPaysTaxes() {
		return paysTaxes;
	}

	/**
	 * Setter for paysTaxes
	 * @param paysTaxes
	 */
	public void setPaysTaxes(boolean paysTaxes) {
		this.paysTaxes = paysTaxes;
	}

	/**
	 * To string method
	 * @return String describing the building
	 */
	@Override
	public String toString() {
		return "Building [buildingCost=" + buildingCost + ", buildingType=" + buildingType + ", capacity=" + capacity + ", paysTaxes=" + paysTaxes + "]";
	}
	
}
