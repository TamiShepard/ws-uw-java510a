package edu.uw.java510a;

import java.io.Serial;

/**
 * Custom exception for the Utils class that indicates the 
 * operator entered an integer that is out of the allowed
 * range.
 * 
 * @author ShepardTM
 */
public class NumberNotInRangeException extends NumberFormatException {
	@Serial
	private static final long serialVersionUID = 1L;
}
