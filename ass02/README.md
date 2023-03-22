# Assignment 02 #

## Synopsis ##
For this assignment you will create a utility class named Numbers which contains 
various class (static) methods.
1. Create a new Java Project
2. Download NumbersDriver.java and add it to your project. (see resources folder).
3. Create a new Class file in your src folder and call it Numbers
4. Create the methods below.

## Details ##
### public class Numbers ###
This utility class implements some common class methods that perform arithmetic 
calculations. The definition for all the calculations can be found on the Math 
Is Fun website http://www.mathisfun.com. The last method is optional, and worth a bonus 
of 10 points. The methods are as follows:

### public static boolean isPrime( int num ) ###
This method will return true if a given number is prime and false if num is not prime. 
1 must be treated as non-prime.

- num
  - The given number; must be greater than 0.
- Returns
  - True, if num is prime.
  
### public static int lcm( int param1, int param2 ) ###
This method will calculate the least common multiple of two given numbers. The numbers 
must be greater than 0.

- param1
  - The first given number.
- param2
  - The second given number.
- Returns
  - The least common multiple of param1 and param2.
  
### public static int gcf( int param1, int param2 ) ###
This method will calculate the greatest common factor of two given numbers. The numbers 
must be greater than 0.

- param1
  - The first given number.
- param2
  - The second given number.
- Returns
  - The greatest common factor of param1 and param2.
  
### public static double mean( double[] arr ) ###
This method will calculate the mean of the numbers in a given array. The array must contain at 
least 1 element.

- arr
  - The given array.
- Returns
  - The mean of the numbers in arr.
  
### public static double median( double[] arr ) ###
This method will calculate the median of the numbers in a given array. The array must contain 
at least 1 element. The original array must not be modified. To perform the calculation, make 
a copy of the array and sort the copy. You may find the java.util.Arrays utility class to 
be helpful.

- arr
  - The given array.
- Returns
  - The median of the numbers in arr.
  
### public static long factorial( long num ) ###
This method will calculate the factorial of the given number. The number must be greater 
than or equal to 0. Note that 0! (0 factorial) is 1. Note also that you will not be able to 
calculate the factorial of a number greater than 20.

- num
  - The given number.
- Returns
  - The factorial of num.
  
### public static BigInteger factorial( BigInteger num ) ###
Optional: This method will calculate the factorial of the given number. The number must be 
greater than or equal to 0. Note that 0! (0 factorial) is 1.

- num
  - The given number.
- Returns
  - The factorial of num.
