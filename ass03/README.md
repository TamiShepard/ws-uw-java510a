# Assignment 03

## Description ##
For this assignment you will create a class called BankAccount, Add the following fields 
to your class:

- Name for the type of account
- Balance for the amount
- Transactionfee for real number to deduct amount every time a user withdraws money. Default value $5.00 This value can be changed by client. Transaction money should be deducted every time customer call withdraw method. Please note that balance cannot go negative during the withdrawal. If the withdrawal money (amount plus transaction fee) could become negative, don't modify the balance at all.

Implement the following methods to your class:

- public void deposit(double amount)
- public void withdraw(double amount)
- Add a toString() method which should return String that contains the following separated 
by a comma and space: E.g. "Cburke, $50.98"
  - Accounts' name
  - Balance in the account
- public void transfer(BankAccount accountType, double amount)
  - this method will move money from one bank account type to another bank account. There 
is a $5.00 transfer fee that is deducted from the current account's balance before any transfer 
can occur. This method will modify both accounts as follows: "this" current object has its 
balances decreased by the given amount + $5 fee and other accounts balance is increased by 
the given amount. If this account doesn't have enough money to transfer the full amount, transfer 
whatever money is left after the $5 fee deduction. If the account has under $5 or the amount is 
0 or less, no transfer should happen and neither accounts state should be modified.

If you wish, the class may have private helper methods. This problem is vague as intended so 
you can design your own methods. Following concepts would be evaluated for grading for assignment 3:

- Encapsulation
- Class variable
- Class method
- Constructor overloading
- Constructor chaining (using 'this' keyword)
- Accessors
- Mutators
- toString()
- Access Modifiers
- Application Driver

Included is a sample BankAccountDriver.java (resources folder) that used to test the code; The 
expected output from the application driver can be found in SampleOutput.txt (resources folder).
