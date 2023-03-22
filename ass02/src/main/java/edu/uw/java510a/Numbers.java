package edu.uw.java510a;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Assignment 2. This utility class implements some common class methods that 
 * perform arithmetic calculations. The definition for all the calculations
 * can be found here: 
 * <em><a href='https://www.mathsisfun.com/'>https://www.mathsisfun.com/</a></em>.
 * 
 * @author ShepardTM
 */
public class Numbers {
	
	/**
	 * This method returns true if a given number is prime and 
	 * false if the number is not prime. 1 must be treated as non-prime.
	 * 
	 * @param num The given number; must be greater than 0.
	 * @return True, if num is prime.
	 */
	
	public static boolean isPrime(int num) {
		
		if (num < 2) {
			return false;
		} 
		
		for (int i = 2; i < num ; i++) {
		    if (num % i == 0) {
		    	return false;
		    } 
		}
		return true;
	}

	
	/**
	 * This method will calculate the least common multiple of two 
	 * given numbers. The numbers must be greater than 0.
	 * 
	 * @param num1 The first given number.
	 * @param num2 The second given number.
	 * @return The least common multiple of param1 and param2   OR   0 if invalid param.
	 */
	public static int lcm(int num1, int num2) {

		return (num1 <= 0 || num2 <= 0) ? 0  :  (num1 * num2) / gcf(num1, num2 )  ;
	
	}

	
	/**
	 * This method calculates the greatest common factor of two given 
	 * numbers. The numbers must be greater than 0. Solution based on 
	 * the Euclidean method demonstrated at 
	 * <em><a href='https://www.youtube.com/watch?v=7XgjqkvKHRQ'>
	 * https://www.youtube.com/watch?v=7XgjqkvKHRQ</a></em>
	 * 
	 * @param num1 The first given number.
	 * @param num2 The second given number.
	 * @return The greatest common factor of param1 and param2   OR   zero if 
	 * params are not greater than zero.
	 */
	public static int gcf(int num1, int num2) {

		if (num1 <= 0 || num2 <= 0) {
			return 0;
		}
		int remainder = -1;		// initialize in prep for while loop
		while (remainder != 0) {
			if (num1 > num2) {
				remainder = num1 % num2;
				num1 = num2;
				num2 = remainder;
			} else {
				remainder = num2 % num1;
				num2 = num1;
				num1 = remainder;
			}
		}
		return num1 != 0  ? num1 : num2;
	}
	

	/**
	 * This method will calculate the mean of the numbers in a given 
	 * array. The array must contain at least 1 element.
	 * 
	 * @param arr The given array with at least one element  
	 * @return The mean of the numbers   OR   zero if no elements in the param.
	 */
	public static double mean(double[] arr) {
		
		if (arr.length < 1) {
			return 0;
		}
		double sum = 0;
		for (double element : arr) {
			sum += element;
		}
		return sum/arr.length;
	}

	/**
	 * This method will calculate the median of the numbers in a given 
	 * array. The array must contain at least 1 element. The original 
	 * array will not be modified. This method makes a copy of the array 
	 * and sorts the copy.
	 * 
	 * @param arr The given array containing at least one element
	 * @return The median of the numbers in the param   OR   0 if no 
	 * elements were passed.
	 */
	public static double median(double[] arr) {
		
		if (arr.length < 1) {
			return 0;
		}
		
		double [] arrSrt  = arr.clone();
		Arrays.sort(arrSrt); 
		return (arrSrt.length % 2 == 0) ? (arrSrt[(arrSrt.length - 1)/2] + arrSrt[arrSrt.length/2]) / 2  : arrSrt[(arrSrt.length)/2] ;
	}

	/**
	 * This method will calculate the factorial of the given number. The number 
	 * must be greater than or equal to 0 and not greater than 20. 
	 * Note that 0! (0 factorial) is 1. 
	 * 
	 * @param num The given number
	 * @return The factorial num   OR   -1 if an invalid param passed.
	 */
	public static long factorial(int num) {
		
		if (num < 0 || num > 20) {
			return -1;
		} 
		
		long factorial = 1;
		for (int i = 2; i <= num; i++) {
			factorial = factorial * (i);
		}
		return factorial;
	}
	
	/** 
	 * Optional: This method will calculate the factorial of the given 
	 * number. The number must be greater than or equal to 0. Note that 0! 
	 * (0 factorial) is 1.
	 * 
	 * @param num The given number
	 * @return The factorial of num   OR   -1 if invalid param passed
	 */
	public static BigInteger factorial(BigInteger num) {
		
		if (num.compareTo(BigInteger.valueOf(0)) < 0) {
			return BigInteger.valueOf(-1);
		}
		
		long numLong = num.longValue();
		BigInteger factorial = BigInteger.ONE;
		for (long i = 2; i <= numLong; i++) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		return factorial;
	}
}
