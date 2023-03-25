import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.uw.java510a.Residential;
import org.junit.jupiter.api.Test;

/**
 * JUnit to test Residential class. All tests are automated.
 * 
 * @author thugf
 */
class ResidentialTest {

	Residential r = new Residential();		// create new residential building
	
	/**
	 * Test the constructor
	 */
	@Test
	void testResidentialIntStringInt() {
		assertEquals(200, r.getBuildingCost());
		assertEquals(Residential.RESIDENTIAL_TYPE, r.getBuildingType());
		assertEquals(100, r.getCapacity());
	}

	/**
	 * Getter: Tests getBuildingCost
	 */
	@Test
	void testGetBuildingCost() {
		r.setBuildingCost(11);
		assertEquals(11, r.getBuildingCost());
	}

	/**
	 * Setter: Tests setBuildingCost
	 */
	@Test
	void testSetBuildingCost() {
		r.setBuildingCost(22);
		assertEquals(22, r.getBuildingCost());
	}

	/**
	 * Getter: Test getBuildingType
	 */
	@Test
	void testGetBuildingType() {
		r.setBuildingType(Residential.RESIDENTIAL_TYPE);
		assertEquals(Residential.RESIDENTIAL_TYPE, r.getBuildingType());
	}

	/**
	 * Setter: Tests setBuildingType
	 */
	@Test
	void testSetBuildingType() {
		r.setBuildingType(Residential.RESIDENTIAL_TYPE);
		assertEquals(Residential.RESIDENTIAL_TYPE, r.getBuildingType());
	}

	/**
	 * Getter: Tests getCapacity
	 */
	@Test
	void testGetCapacity() {
		r.setCapacity(33);
		assertEquals(33, r.getCapacity());
	}

	/**
	 * Setter: Tests setCapacity
	 */
	@Test
	void testSetCapacity() {
		r.setCapacity(44);
		assertEquals(44, r.getCapacity());
	}

	/**
	 * Tests the toString method
	 */
	@Test
	void testToString() {
		r.setBuildingCost(55);
		r.setBuildingType(Residential.RESIDENTIAL_TYPE);
		r.setCapacity(66);
	    assertEquals("Building [buildingCost=55.0, buildingType=Residential, capacity=66]", r.toString());	
	}

}
