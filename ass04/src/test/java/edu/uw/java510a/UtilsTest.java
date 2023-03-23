package edu.uw.java510a;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test cases for Utils() class.  Getter/Setter tests
 * are fully automated.  Please follow the directions in the
 * test cases for "Test OpCancelledException" and "Test valid conditions".
 *
 * @author thugf
 */
class UtilsTest {

    /**
     * This tests the getter and setter for min.
     */
    @Test
    @DisplayName("Test min getter and setter")
    void testGetSetMin() {
        Utils u = new Utils();
        u.setMin(99);
        assertEquals(99, u.getMin());
    }

    /**
     * This tests the getter and setter for max.
     */
    @Test
    @DisplayName("Test max getter and setter")
    void testGetSetMax() {
        Utils u = new Utils();
        u.setMax(555);
        assertEquals(555, u.getMax());
    }

    /**
     * This tests the boundaries and one additional value.
     *
     * Directions:
     * 1. Enter 7 when prompted
     * 2. Enter 5 when prompted
     * 3. Enter 10 when prompted
     *
     * @throws OpCanceledException
     */
    @Test
    @DisplayName("Test valid conditions (input 7, 5, 10)")
    void testUtilsValidNums() throws OpCanceledException {
        assertEquals(7, Utils.askInt(5, 10));
        assertEquals(5, Utils.askInt(5, 10));
        assertEquals(10, Utils.askInt(5, 10));
    }

    /**
     * This tests that we are indeed throwing the OpCanceledException.
     *
     * Directions:
     * 1. When prompted for input, hit the "Cancel" button.
     *
     * @throws OpCanceledException
     */
    @Test
    @DisplayName("Test OpCanceledException (hit cancel button)")
    void testOpCanceledException() throws OpCanceledException {
        assertThrows(OpCanceledException.class, () -> {
            Utils.askInt(5,10);
        });
    }

}
