package edu.uw.java510a;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Assignment #3. This class implements methods to simulate a simple bank that 
 * allows one to deposit, withdraw, and transfer money.
 * 
 * @author tshepard
 */
public class BankAccount {

	private String customerName;
	private String accountType;
	private double balance = 0.00;
	private double transactionFee = 5.00;
	private boolean xfer = false;
	
	/**
	 * Constructor. 
	 * @param customerName - name of the customer
	 * @param accountType - type of account
	 */
	public BankAccount(String customerName, String accountType) {
		this.customerName = customerName;
		this.accountType = accountType;
	}

	/**
	 * Getter.
	 * @return customerName - name of the customer
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * Setter.
	 * @param customerName - name of the customer
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * Getter.
	 * @return accountType
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * Setter.
	 * @param accountType - type of account
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * Getter.
	 * @return balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Setter.
	 * @param balance - balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * Getter.
	 * @return transactionFee
	 */
	public double getTransactionFee() {
		return transactionFee;
	}

	/**
	 * Setter.
	 * @param transactionFee - fee to set
	 */
	public void setTransactionFee(double transactionFee) {
		this.transactionFee = transactionFee;
	}
	
	/**
	 * Deposit.  This method will deposit the amount into the account.
	 * @param amount - amount to deposit
	 */
	public void deposit(double amount) {
		setBalance(getBalance() + amount);
	}
	
	/**
	 * Withdrawal.  This method will withdraw the amount from the account and 
	 * take a transaction fee.  If there is not enough money to handle the fee plus
	 * withdrawal amount, no action will be taken.  For transfers, the amount will
	 * be withdrawn and fees will be calculated in the transfer method.
	 * 
	 * @param amount - amount to withdraw
	 */
	public void withdrawal(double amount) {

		if (xfer) {
			setBalance(getBalance() - amount);
		} else if (amount + getTransactionFee() <= getBalance()) {
			setBalance(getBalance() - amount - getTransactionFee());
		}
	}
	
	/**
	 * Transfer. This method will transfer money from one account to another. If
	 * there is not enough money for the transfer plus fee, the fee will
	 * be taken first, and then the remaining balance will be transferred. If 
	 * there is not enough money to take the fee, no action will be taken. 
	 * 
	 * @param accountType - account type for transfer
	 * @param amount - amount to transfer
	 */
	public void transfer(BankAccount accountType, double amount) {
		
		xfer = true; 	// indicate this is a transfer
		
		// customer has enough $$ to cover transfer amount and fee
		if (amount + transactionFee <= getBalance()) { 		
			this.withdrawal(amount + getTransactionFee());
			accountType.deposit(amount);
		}
		// else if there is enough,take the fee and transfer whatever balance is left
		else if (this.getBalance() > 5.00) {		 		
			this.withdrawal(transactionFee);
			accountType.deposit(this.getBalance());
			this.withdrawal(this.getBalance());
		}
		xfer = false;	// clear transfer flag
	}


	/**
	 * ToString override for formatted output
	 * 
	 * @return String with account information.
	 */
	@Override
	public String toString() {
		
		// Set locale for US and format to dollars 
		Locale usa = new Locale("en", "US");
		NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);
		
		return "Account Name: " + customerName + ", Account Type: " + accountType + ", Balance: " + dollarFormat.format(balance);
	}
	
}