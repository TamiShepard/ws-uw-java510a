import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.uw.java510a.Utility;
import org.junit.jupiter.api.Test;

/**
 * JUnit to test Utility class. All tests are automated.
 * 
 * @author thugf
 */
class UtilityTest {

	Utility u = new Utility();		// create new utility building
	
	/**
	 * Tests the constructor
	 */
	@Test
	void testUtilityIntStringInt() {
		assertEquals(1000, u.getBuildingCost());
		assertEquals(Utility.UTILITY_TYPE, u.getBuildingType());
		assertEquals(600, u.getCapacity());
	}

	/**
	 * Getter: Tests getBuildingCost
	 */
	@Test
	void testGetBuildingCost() {
		u.setBuildingCost(111);
		assertEquals(111, u.getBuildingCost());
	}

	/**
	 * Setter: Tests setBuildingCost
	 */
	@Test
	void testSetBuildingCost() {
		u.setBuildingCost(222);
		assertEquals(222, u.getBuildingCost());
	}

	/**
	 * Getter: Tests getBuildingType
	 */
	@Test
	void testGetBuildingType() {
		u.setBuildingType(Utility.UTILITY_TYPE);
		assertEquals(Utility.UTILITY_TYPE, u.getBuildingType());
	}

	/**
	 * Setter: Tests setBuildingType
	 */
	@Test
	void testSetBuildingType() {
		u.setBuildingType(Utility.UTILITY_TYPE);
		assertEquals(Utility.UTILITY_TYPE, u.getBuildingType());
	}

	/**
	 * Getter: Tests getCapacity
	 */
	@Test
	void testGetCapacity() {
		u.setCapacity(333);
		assertEquals(333, u.getCapacity());
	}

	/**
	 * Setter: Tests setCapacity
	 */
	@Test
	void testSetCapacity() {
		u.setCapacity(444);
		assertEquals(444, u.getCapacity());
	}

	/**
	 * Tests the toString method
	 */
	@Test
	void testToString() {
		u.setBuildingCost(888);
		u.setBuildingType(Utility.UTILITY_TYPE);
		u.setCapacity(999);
	    assertEquals("Building [buildingCost=888.0, buildingType=Utility, capacity=999]", u.toString());	
	}

}
