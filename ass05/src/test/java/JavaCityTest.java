import edu.uw.java510a.JavaCity;
import org.junit.jupiter.api.Test;

/**
 * JUNIT for main JavaCity driver to execute console prompts.
 * 
 * @author thugf
 */
class JavaCityTest {

	/**
	 * Test console prompts.  
	 * 
	 * Directions:
	 * 	   1. Enter x to simulate bad data entry
	 *     2. Enter 1
	 *     3. Enter 2
	 *     4. Enter 3
	 *     5. Enter 4	  
	 */
	@Test
	void testMain() {
		JavaCity.main(null);
	}

	/**
	 * Test creating new class.
	 */
	@Test
	void testNewMain() {
		new JavaCity();
	}
	
}
