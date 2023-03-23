# Assignment 05
## Description ##
In this assignment you will create a new city with Utilities and Residential buildings

## Details ##

### public class City ###
This class contains the private fields demand, supply, cityBalance, taxRate and an 
array of Building buildings that can hold 10 types of buildings.

The cityBalance is set to 3000 and the taxRate is set to 7%. The class also contains 
the appropriate getter and setters, as well as the following methods:

- netNeed - Calculates and returns the difference of demand and supply
- purchase - takes a parameter of type Building and an int buildingNumber
  - If there isn't enough funds to purchase the building then the method returns false and 
  prints out which building there were not enough funds to purchase
  - otherwise, it subtracts the cost of that particular building from the cityBalance and 
  increases the city supply if the building is a utility or increases the city demand if the 
  building is residential. It also sets the building type in the Building array
  - Returns true if there are enough funds to purchase it.
- collectTaxes - income is collected from residential buildings using the formula: 
taxRate * (number of residential buildings) * (capacity of the residential building)
- toString - prints out the city supply, demand, net need, and city balance

### public abstract class Building ###
This class contains the private fields buildingCost, buildingType, capacity. It also 
contains the appropriate getter and setters and overrides the toString method.

### public class Utility extends Building ###
This class contains a constructor that calls the abstract Building class constructor

- capacity = 600
- cost = 1000
- type = "Utility"

### public class Residential extends Building ###
This class contains a constructor that calls the abstract Building class constructor

- capacity = 100
- cost = 200
- type = "Residential"

### public class JavaCity ###
This is the driver class. You will create a new city and the program will take inputs 
from the console:

- enter 1 to purchase a utility
- enter 2 to purchase a residential building
- enter 3 to collect taxes only
- enter 4 to quit the game

The program will loop asking the user to enter a input until either the user quits the game 
or has used up all 10 buildings. Each time the program loops, the city will collect taxes and 
prints out the results of the city.

 


