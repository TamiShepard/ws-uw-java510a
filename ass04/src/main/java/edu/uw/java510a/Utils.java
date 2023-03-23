package edu.uw.java510a;

import javax.swing.JOptionPane;

/**
 * A set of utilities to demonstrate JOptionPane usage as well
 * as custom exceptions
 * 
 * @author ShepardTM
 */
public class Utils {

	private int min;	// min for range of numbers 
	private int max;	// max for raneg of numbers
	
	/**
	 * Constructor. 
	 */
	public Utils() {
	}
	
	/**
	 * Getter for min.
	 * @return min
	 */
	public int getMin() {
		return min;
	}

	/**
	 * Setter for min.
	 * @param min - min value
	 */
	public void setMin(int min) {
		this.min = min;
	}

	/**
	 * Getter for Max
	 * @return max
	 */
	public int getMax() {
		return max;
	}

	/**
	 * Setter for max
	 * @param max - max value
	 */
	public void setMax(int max) {
		this.max = max;
	}

	
	/**
	 * Prompt user for input between a range of integers of min and max.
	 * @param min - min value
	 * @param max - max value
	 * @return integer value of input from JOptionPane, if data was valid
	 * @throws OpCanceledException, NumberNotInRangeException
	 */
	public static int askInt(int min, int max) throws OpCanceledException {
		
		boolean exit = false;	// while loop control
		String str = "";		// initialize string to house user input
		
		while (!exit) {
			
			str = JOptionPane.showInputDialog(null, "Enter an integer between " + min + " and " + max + " inclusive.");

			try {
				if (str == null) {
					throw new OpCanceledException();
				} else if (Integer.parseInt(str) >= min && Integer.parseInt(str) <= max)  {
					exit = true;
				} else {
					throw new NumberNotInRangeException();
				}
			} catch (NumberNotInRangeException e1) {
				JOptionPane.showMessageDialog(null, "Number must be between " + min + " and " + max + " inclusive. Try again.", "Error", JOptionPane.ERROR_MESSAGE );
			} catch (NumberFormatException e2) {
				JOptionPane.showMessageDialog(null, "\"" + str + "\" is not valid. Try again.", "Error", JOptionPane.ERROR_MESSAGE );
			}
		}
		return Integer.parseInt(str);
	}
}
