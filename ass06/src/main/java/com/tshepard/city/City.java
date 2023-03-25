package com.tshepard.city;

import java.util.ArrayList;
import java.util.List;

import com.tshepard.buildings.Building;
import com.tshepard.buildings.Utility;
import com.tshepard.buildings.publicService.Education;

public class City {
 
	private int demand;						// power demand
	private int supply;						// power supply
	private double cityBalance = 3000.00;	// initial balance
	private double taxRate = 0.07;			// city tax rate
	
	private double propertyTax;				// property taxes
	private List <Building> buildings = new ArrayList<>();	// Array to house buildings
	
	/**
	 * Empty constructor
	 */
	public City() {
	}
	
	/**
	 * Getter for demand.
	 * @return demand
	 */
	public int getDemand() {
		return demand;
	}
	
	/**
	 * Setter for demand
	 * @param demand
	 */
	public void setDemand(int demand) {
		this.demand = demand;
	}
	
	/**
	 * Getter for supply
	 * @return supply
	 */
	public int getSupply() {
		return supply;
	}
	
	/**
	 * Setter for supply 
	 * @param supply
	 */
	public void setSupply(int supply) {
		this.supply = supply;
	}
	
	/**
	 * Getter for the city balance
	 * @return city balance
	 */
	public double getCityBalance() {
		return cityBalance;
	}
	
	/**
	 * Setter for the city balance 
	 * @param cityBalance
	 */
	public void setCityBalance(double cityBalance) {
		this.cityBalance = cityBalance;
	}
	
	/**
	 * Getter for the tax rate
	 * @return taxRate
	 */
	public double getTaxRate() {
		return taxRate;
	}
	
	/**
	 * Setter for the tax rate
	 * @param taxRate
	 */
	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}
	
	/**
	 * Getter for the buildings in the city
	 * @return buildings
	 */
	public List<Building> getBuildings() {
		return buildings;
	}
	 
	/**
	 * Setter for the buildings in the city
	 * @param buildings
	 */
	public void setBuildings(List<Building> buildings) {
		this.buildings = buildings;
	}
	
	/**
	 * Getter for the property tax
	 * @return propertyTax
	 */
	public double getPropertyTax() {
		return propertyTax;
	}
	
	/**
	 * Setter for the property tax
	 * @param propertyTax
	 */
	public void setPropertyTax(double propertyTax) {
		this.propertyTax = propertyTax;
	}
	
	/**
	 * Method to return the net needs
	 * @return net need (demand - supply)
	 */
	public int netNeed() {
		return getDemand() - getSupply();
	}
	
	/**
	 * Method to purchase buildings in the city
	 * @param building
	 */
	public void purchase(Building building) {

		// Return if there are not enough funds to make the purchase
		if (getCityBalance() - building.getBuildingCost() < 0) {
			System.out.println("Not enough funds to purchase " + building.getBuildingType() + " building.");
			return;
		}
		
		// Subtract off the cost of the building 
		setCityBalance(getCityBalance() - building.getBuildingCost());

		// Set the supply or demand. 
		if (building instanceof Utility ) {
			setSupply(calculateSupply(building));
		} else  {
			setDemand(calculateDemand(building));
		}
		
		// Add the building to the arraylist of buildings in the city
		buildings.add(building);
	}

	/**
	 * Calculate the supply
	 * @param bldg
	 * @return supply
	 */
	public int calculateSupply(Building bldg) {
		return getSupply() + bldg.getCapacity();
	}
	
	/**
	 * Calculate the demand
	 * @param bldg
	 * @return demand
	 */
	public int calculateDemand(Building bldg) {
		return getDemand() + bldg.getCapacity();
	}
	
	/**
	 * Calculate the taxes and add it to the city balance. 
	 */
	public void collectTaxes() {

		double income = 0;
		
		if (netNeed() > 0) {
			income = getTaxRate() * getSupply();
		} else {
			income = getTaxRate() * getDemand();
		}
		setCityBalance(getCityBalance() + income);
	}

	/**
	 * Subtract off operating costs for educational buildings from the city balance.
	 */
	public void payOperatingCosts() {
		double expense = 0;
		for (Building building : buildings) {
			if (building instanceof Education) {
				expense += ((Education) building).getOperatingCosts();
			}
		}
		setCityBalance(getCityBalance() - expense);  
	}

	/**
	 * To String method
	 * @return String containing the details about the city 
	 */
	@Override
	public String toString() {
		return "City [Demand=" + getDemand() + ", Supply=" + getSupply() + ", CityBalance="
				+ getCityBalance() + ", PropertyTax=" + getTaxRate() + ", NetNeed=" + netNeed() + "]";
	}

}
