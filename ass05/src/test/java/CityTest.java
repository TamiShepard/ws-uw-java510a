import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.uw.java510a.Building;
import edu.uw.java510a.City;
import edu.uw.java510a.Residential;
import edu.uw.java510a.Utility;
import org.junit.jupiter.api.Test;

/**
 * JUnit to test City class. All tests are automated.
 * 
 * @author thugf
 */

class CityTest {

	City c = new City();				// Create new city
	Building u = new Utility();			// Create new utility building
	Building r = new Residential();		// Create new residential building

	/**
	 * Getter: Tests getDemand
	 */
	@Test
	void testGetDemand() {
		c.setDemand(11);
		assertEquals(11,c.getDemand());
	}

	/**
	 * Setter: Tests setDemand
	 */
	@Test
	void testSetDemand() {
		c.setDemand(22);
		assertEquals(22,c.getDemand());
	}

	/**
	 * Getter: Tests getSupply
	 */
	@Test
	void testGetSupply() {
		c.setSupply(33);
		assertEquals(33, c.getSupply());
	}

	/**
	 * Setter: Tests setSupply
	 */
	@Test
	void testSetSupply() {
		c.setSupply(33);
		assertEquals(33, c.getSupply());
	}

	/**
	 * Getter: Tests getCityBalance
	 */
	@Test
	void testGetCityBalance() {
		c.setCityBalance(44.44);
		assertEquals(44.44, c.getCityBalance());
	}

	/**
	 * Setter: Tests setCityBalance
	 */
	@Test
	void testSetCityBalance() {
		c.setCityBalance(55.55);
		assertEquals(55.55, c.getCityBalance());
	}

	/**
	 * Getter: Tests getTaxRate
	 */
	@Test
	void testGetTaxRate() {
		c.setTaxRate(0.66);
		assertEquals(0.66, c.getTaxRate());
	}

	/**
	 * Setter: Tests setTaxRate
	 */
	@Test
	void testSetTaxRate() {
		c.setTaxRate(0.66);
		assertEquals(0.66, c.getTaxRate());
	}

	/**
	 * Getter: Tests getBuildings
	 */
	@Test
	void testGetBuildings() {
		Utility b1 = new Utility();
		Residential r1 = new Residential();
		Building buildings [] = { b1, r1};
		c.setBuildings(buildings);
		assertEquals(buildings, c.getBuildings());
	}

	/**
	 * Setter: Tests setBuildings
	 */
	@Test
	void testSetBuildings() {
		Utility b1 = new Utility();
		Residential r1 = new Residential();
		Building buildings [] = { b1, r1};
		c.setBuildings(buildings);
		assertEquals(buildings, c.getBuildings());
	}

	/**
	 * Tests netNeed method (Demand minus Supply).
	 */
	@Test
	void testNetNeed() {
		c.setDemand(100);
		c.setSupply(5);
		assertEquals(95, c.netNeed());
	}

	/**
	 * Tests purchase method when there are not enough funds
	 */
	@Test
	void testPurchaseNotEnoughFunds() {
		c.setCityBalance(100);
		u.setBuildingCost(105);
		assertEquals(false, c.purchase(r, 0));
	}
	
	/**
	 * Tests purchase method for happy path Utility
	 */
	@Test 
	void testPurchaseUtility() {
		u.setBuildingType(Utility.UTILITY_TYPE);
		u.setCapacity(99);
		c.setSupply(100);
		assertEquals(true, c.purchase(u, 1));
	}
	
	/**
	 * Tests purchase method for happy path Residential
	 */
	@Test 
	void testPurchaseResidential() {
		r.setBuildingType(Residential.RESIDENTIAL_TYPE);
		r.setCapacity(99);
		c.setDemand(100);
		assertEquals(true, c.purchase(r, 1));
	}

	/**
	 * Tests calculating the supply
	 */
	@Test
	void testCalculateSupply() {
		c.setSupply(100);
		u.setCapacity(7);
		assertEquals(107, c.calculateSupply(u));
	}
	
	/**
	 * Tests calculating the demand
	 */
	@Test
	void testCalculateDemand() {
		c.setDemand(200);
		r.setCapacity(50);
		assertEquals(250, c.calculateDemand(r));
	}
	
	/**
	 * Tests collecting taxes
	 */
	@Test
	void testCollectTaxes() {

		Residential r1 = new Residential();
		r1.setCapacity(10);
		r1.setBuildingCost(50);
		
		City c1 = new City();
		c1.setCityBalance(5000.00);
		c1.purchase(r1,	0); 	
		c1.collectTaxes();
		
		assertEquals(4957.0, c1.getCityBalance());
	}
	
	/**
	 * Tests the to string method
	 */
	@Test
	void testToString() {
		c.setDemand(99);
		c.setSupply(88);
		c.setCityBalance(777.77);
		assertEquals("City [demand=99, supply=88, getCityBalance()=777.77, netNeed()=11]", c.toString());
	}

}
