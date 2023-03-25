package edu.uw.java510a;

import java.util.Scanner;
/**
 * JavaCity driver class that creates a new city containing Residential
 * and Utility buildings, and as all cities, collects taxes!
 * 
 * @author thugf
 */ 
public class JavaCity {
	
	public static void main(String[] args) {

		Scanner kbInput = new Scanner(System.in);	// Keyboard input
		City city = new City();						// New city
		boolean exit = false;						// Exit the game
		int numBuildings = 0;						// Number of buildings added to the city
		int choice; 								// Menu choice (valid 1 - 4)
		
		displayMainMenu();		// Present main menu to user	
		
		// Keep playing until the user wants to exit or we create 10 buildings
		while (!exit && numBuildings <= 10) {
			
			choice = Integer.parseInt(getInput(kbInput));
			
			if (choice == 1) {
				city.purchase(new Utility(), numBuildings); 
				numBuildings++;

			} else if (choice == 2) {
				city.purchase(new Residential(), numBuildings);
				numBuildings++;
			
			} else if (choice == 3) {
			
			} else if (choice == 4) {
				displayFinalCityStats();
				exit = true;
				
			} else {
				System.out.println("Invalid menu selection. Please enter a number between 1 and 4.");
			
			}
			System.out.println(city);
			city.collectTaxes();
		}
		displayEndOfGame();
	}

	/**
	 * Method to display initial game screen on console.
	 */
	private static void displayMainMenu() {
		System.out.println("");
		System.out.println("             Welcome to Java City!");
		System.out.println("");
		System.out.println("          1: Build Utility Building");
		System.out.println("          2: Build Residential Building");
		System.out.println("          3: Collect Taxes");
		System.out.println("          4: Exit");
		System.out.println("");
	}

	/**
	 * Get input from the user.  Valid choices are 1-4.
	 * 1
	 * @param kbInput - keyboard iput1
	 * @return result
	 */
	private static String getInput(Scanner kbInput) {
		System.out.println("");
		System.out.print("             Please enter your selection: ");
		String result = kbInput.nextLine();
		return (result.equals("1") || result.equals("2")  || result.equals("3") || result.equals("4")) ? result : "999";
	}
	
	/**
	 * Displayed upon exit of the game
	 */
	private static void displayEndOfGame() {
		System.out.println("");
		System.out.println("\n             Thanks for playing Java City!");
	}
	
	/**
	 * Displayed when user chooses to exit, or has created 10 buildings 
	 */
	private static void displayFinalCityStats() {
		System.out.println("");
		System.out.println("Final City Stats: ");
	}
	
}
