package com.tshepard.city;

import java.util.Scanner;
import com.tshepard.buildings.Utility;
import com.tshepard.buildings.publicService.Education;
import com.tshepard.buildings.taxable.Commercial;
import com.tshepard.buildings.taxable.Industrial;
import com.tshepard.buildings.taxable.Residential;

/** 
 * JavaCity. Driver class that creates a new city containing 
 * various different kinds of  buildings, and as all cities, 
 * collects taxes!
 * 
 * @author thugf
 */
public class JavaCity {

	static boolean exit = false;

	/**
	 * Main driver
	 * @param args n/a
	 */
	public static void main(String[] args) {
		JavaCity menu = new JavaCity();
		menu.runMenu();
	}
		
	/**
	 * Method to print out the header/trailer "graphics", 
	 * as well as presenting the menu.
	 */
	private void runMenu() {
		// Display graphics and menu
		displaySkyline();
		displayHeader();
		displayMenu();
		
		// Create our new city
    	City city = new City();
    	
    	// Collect input from the user, and build different buildings
    	// based on the user selections, and exit if user desires 
        while (!exit) {
            int choice = getInput();
            performAction(choice, city);
    		System.out.println(city);
    		city.collectTaxes();
    		city.payOperatingCosts();
        }
        
        // Display the final city statistics and trailer
        System.out.println("FINAL CITY STATS: ");
        System.out.println(city);
        displayTrailer();
	}

	/**
	 * Method to create the type of building the user wants to build, 
	 * collect taxes, or exit the game.
	 * @param choice type of building
	 * @param city this city
	 */
	private static void performAction(int choice, City city) {
		switch (choice) {
		case 1:  
			city.purchase(new Utility());
			break;
		case 2:  
			city.purchase(new Residential());
			break;
		case 3:  
			city.purchase(new Commercial());
			break;
		case 4:  
			city.purchase(new Industrial());
			break;
		case 5:  
			city.purchase(new Education());
			break;
		case 6:  
			break;
		case 7: 
			exit = true;
			break;
		}
	}

	/**
	 * Method to get the user input from the keyboard 
	 * @return menud choice after validation
	 */
	private static int getInput() {
		@SuppressWarnings("resource")
		Scanner kb = new Scanner(System.in);
		int choice = -1;
		
		while (choice < 1 || choice > 7) {
			try {
				System.out.print("               Please make a selection: ");
				choice = Integer.parseInt(kb.nextLine());
				
			} catch (NumberFormatException e) {
				System.out.println("          Invalid selection. Please try again.");
			}	
		}
		return choice;
	}

	/**
	 * Method to display trailer
	 */
	private void displayTrailer() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(" T h a n k s   f o r   p l a y i n g   J a v a C i t y  ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		displaySkyline();
	}
	
	/**
	 * Method to display the menus choices
	 */
	private void displayMenu() {
		System.out.println("");
		System.out.println("          1. Purchase Utility");
		System.out.println("          2. Purchase Residential Building");
		System.out.println("          3. Purchase Commercial Building");
		System.out.println("          4. Purchase Industrial Building");
		System.out.println("          5. Purchase Educational Building");
		System.out.println("          6. Collect Taxes");
		System.out.println("          7. Quit");
		System.out.println("");
	}

	/**
	 * Method to display welcome message
	 */
	private void displayHeader() {
		System.out.println("        W e l c o m e   t o   J a v a C i t y ! ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
	}

	/**
	 * Method to display the city skyline. 
	 */
	private void displaySkyline() {
		System.out.println("");
		System.out.println("                       .|        ,       +");
		System.out.println("             *         | |      ((             *");
		System.out.println("                       |'|       `    ._____");
		System.out.println("         +     ___    |  |   *        |.   |' .----|");
		System.out.println("       _    .-'   '-. |  |     .--'|  ||   | _|    |");
		System.out.println("    .-'|  _.|  |    ||   '-__  |   |  |    ||      |");
		System.out.println("    |' | |.    |    ||       | |   |  |    ||      |");
		System.out.println(" ___|  '-'     '    ''       '-'   '-.'    '`      |____");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
}
