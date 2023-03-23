# Assignment 06

## Description ##
In this assignment you will build onto your previous JavaCity while adding additional 
features. You will also create packages to group similar pieces of code together in the 
same package.

Package name ex. com.cburke.city

## Details ##

### public class JavaCity in package [com.<firstInitial_LastName>.city] ###

This is the driver class. You will create a new city and the program will take inputs 
from the console:

- enter 1 to purchase a utility
- enter 2 to purchase a Residential building
- enter 3 to purchase a Commercial building
- enter 4 to purchase a Industrial building
- enter 5 to purchase a Education building
- enter 6 to collect taxes only
- enter 7 to quit the game

The program will loop asking the user to enter a input until either the user quits the 
game. Each time the program loops, the city will collect taxes, pay operating costs, and 
prints out the results of the city.

### public interface CityFunctions in package [com.<firstInitial_LastName>.city] ###
This interface contains an abstract method getOperatingCosts();

### public class City in package [com.<firstInitial_LastName>.city] ###
This class contains the private fields demand, supply, cityBalance, propertyTax and an 
ArrayList of Building buildings.

The cityBalance is set to 3000 and the taxRate is set to 7%. The class also contains the 
appropriate getter and setters, as well as a the following methods:

- public int netNeed() - Calculates and returns the difference of demand and supply
- public void purchase(Building building) - takes a parameter of type Building
  - If there isn't enough funds to purchase the building then the method returns and prints out which building there were not enough funds to purchase
  - otherwise, it subtracts the cost of that particular building from the cityBalance and increases the city supply if the building is a utility or increases the city demand if the building is not an instance of Utility. This building is then added to the List of buildings
- public void collectTaxes() -
  - if the netNeed() is greater than 0 then you will only collect taxes based on what your city can supply at the time. (taxRate * getSupply())
  - else you will collect taxes based on the city demand (taxRate * getDemand())
- public String toString() - prints out the city supply, demand, net need, and city balance
- public void payOperatingCosts() - If you built education buildings, each building comes with an operating cost that gets deducted from the city balance each turn.

### public abstract class Building in package [com.<firstInitial_LastName>.buildings] ###
This class contains the private fields int buildingCost, String buildingType, int capacity, 
and boolean paysTaxes. It also contains the appropriate getter and setters and overrides the 
toString method.

### public class Utility extends Building in package [com.<firstInitial_LastName>.buildings] ###
This class contains a constructor that calls the abstract Building class constructor

- capacity = 600
- cost = 1000
- type = "Utility"
- paysTaxes = false

### public class Residential extends Building in package [com.<firstInitial_LastName>.buildings.taxable] ###
This class contains a constructor that calls the abstract Building class constructor

- capacity = 200
- cost = 200
- type = "Residential"
- paysTaxes = true

### public class Commercial extends Building in package [com.<firstInitial_LastName>.buildings.taxable] ###
This class contains a constructor that calls the abstract Building class constructor

- capacity = 250
- cost = 200
- type = "Commercial"
- paysTaxes = true

### public class Industrial extends Building in package [com.<firstInitial_LastName>.buildings.taxable] ###
This class contains a constructor that calls the abstract Building class constructor

capacity = 325
cost = 200
type = "Industrial"
paysTaxes = true

### public class Education extends Building implements CityFunctions in package [com.<firstInitial_LastName>.buildings.publicService] ###
This class contains a constructor that calls the abstract Building class constructor

- capacity = 1000
- cost = 500
- type = "Education"
- paysTaxes = false
- operatingCost = 100