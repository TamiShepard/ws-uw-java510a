package edu.uw.java510a;

/**
 * Class for creating cities. The city starts out with an initial 
 * balance of 3000.00 dollars, and a tax rate of 0.07.  There is a maximum
 * of 10 buildings in the city.
 *     
 * @author thugf
 */
public class City {

	private int demand;						// power demand
	private int supply;						// power supply
	private double cityBalance = 3000.00;	// initial balance
	private double taxRate = 0.07;			// city tax rte
	private Building [] buildings = new Building[10];	// array to house the buildings in our city
	private int numResidentialBldgs = 0;	// initialize the number of taxable residential buildings
	
	/**
	 * Empty constructor
	 */
	public City() {
	}
	 
	/**
	 * Getter for demand
	 * @return demand
	 */
	public int getDemand() {
		return demand;
	}

	/**
	 * Setter for demand
	 * @param demand demand for the city
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
	 * @param supply supply for the city
	 */
	public void setSupply(int supply) {
		this.supply = supply;
	}
	
	/**
	 * Getter for city balance
	 * @return cityBalance
	 */
	public double getCityBalance() {
		return cityBalance;
	}

	/**
	 * Setter for city balance
	 * @param cityBalance - the city balance
	 */
	public void setCityBalance(double cityBalance) {
		this.cityBalance = cityBalance;
	}

	/**
	 * Getter for tax rate
	 * @return taxRate
	 */
	public double getTaxRate() {
		return taxRate;
	}

	/**
	 * Setter for tax rate
	 * @param taxRate tax rate for the city
	 */
	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	/**
	 * Getter for buildings array
	 * @return array of buildings
	 */
	public Building[] getBuildings() {
		return buildings;
	}

	/**
	 * Setter for buildings array
	 * @param buildings - set buildings for this city
 	 */
	public void setBuildings(Building[] buildings) {
		this.buildings = buildings;
	}
	
	/**
	 * Getter for number of residential buildings
	 * @return numResidentialBuildings
	 */
	public int getNumResidentialBldgs() {
		return numResidentialBldgs;
	}

	/**
	 * Setter for number of residential buildings
	 * @param numResidentialBldgs - number of residential buildings in this city
	 */
	public void setNumResidentialBldgs(int numResidentialBldgs) {
		this.numResidentialBldgs = numResidentialBldgs;
	}

	/**
	 * Method to return the net power needs
	 * @return net need (demand - supply)
	 */
	public int netNeed() {
		return getDemand() - getSupply();
	}

	/**
	 * Method to purchase buildings in the city. 
	 * 
	 * @param bldg: class housing the building to purchase
	 * @param bldgNum: used to index into the building array
	 * @return boolean indicating if there are enough funds to make the purchase
	 */
	public boolean purchase(Building bldg, int bldgNum) {

		// Not enough funds to buy this building - exit
		if (getCityBalance() - bldg.getBuildingCost() < 0) {
			System.out.println("Not enough funds to purchase building.");
			return false;
		}
		
		// Update the city balance
		setCityBalance(getCityBalance() - bldg.getBuildingCost());
		
		// Make the purchase, and count taxable residential buildings
		if (bldg.getBuildingType().equals(Utility.UTILITY_TYPE) ) {
			setSupply(calculateSupply(bldg));
		} else if (bldg.getBuildingType().equals(Residential.RESIDENTIAL_TYPE)) {
			setDemand(calculateDemand(bldg));
			setNumResidentialBldgs(getNumResidentialBldgs() + 1 );
		}
		
		// Store the building in an array
		buildings[bldgNum] = bldg;
		
		// Indicate the purchase went through
		return true;
	}

	/**
	 * Calculate the supply
	 * @param bldg - the building
	 * @return supply
	 */
	public int calculateSupply(Building bldg) {
		return getSupply() + bldg.getCapacity();
	}
	
	/**
	 * Calculate the demand
	 * @param bldg - the building
	 * @return demand
	 */
	public int calculateDemand(Building bldg) {
		return getDemand() + bldg.getCapacity();
	}
	
	/**
	 * Calculate the taxes for the number of residential buildings in the city and update city balance 
	 */
	public void collectTaxes() {
		double income = taxRate * getNumResidentialBldgs() * Residential.RESIDENTIAL_CAPACITY;
		setCityBalance(getCityBalance() + income);
	}

	/**
	 * To string method 
	 * @return string containing city details
	 */
	@Override
	public String toString() {
		return "City ["
				+   "demand=" + demand 
				+ ", supply=" + supply 
				+ ", getCityBalance()=" + getCityBalance() 
				+ ", netNeed()=" + netNeed() + "]";
	}
	
}
