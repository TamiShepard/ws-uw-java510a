package edu.uw.java510a;

/**
 * SImple driver program that initiates transfer and withdrawal for a bank account
 * @author cburke, tshepard
 *
 */
public class BankAccountDriver {

	/**
	 * Main method
	 * @param args - n/a
	 */
    public static void main(String[] args) {
        BankAccount checking = new BankAccount("CBurke", "Checking");
        checking.deposit(80.00);
        
        BankAccount savings = new BankAccount("CBurke", "Savings");
        savings.deposit(20.00);
        
        System.out.println("Initial balance:");
        System.out.println(checking);
        System.out.println(savings);
        
        System.out.println("\nTransfering $20 to savings.....");
        checking.transfer(savings, 20.00);  //checking $55, savings $40 (checking -$25, savings +$20)
        System.out.println(checking);
        System.out.println(savings);
        
        System.out.println("\nTransfering $10 to savings.....");
        checking.transfer(savings, 10.00);  //checking $40, savings $50 (checking -$15, savings +$10)
        System.out.println(checking);
        System.out.println(savings);
        
        System.out.println("\nTransfering $60 to checking.....");
        savings.transfer(checking, 60.00);  //checking $85, savings $0 (checking +$45, savings -$50)
        System.out.println(checking);
        System.out.println(savings);
        
        // additional test of withdrawal method
        System.out.println("\nWithdraw $10 from checking.....");
        checking.withdrawal(10.00);  //checking $70, savings $0
        System.out.println(checking);
        System.out.println(savings);
        
        // additional test of withdrawal from savings which is depleted.  
        System.out.println("\nWithdraw $7 from savings which is already depleted.....");
        savings.withdrawal(7.00);  //checking $70, savings $0
        System.out.println(checking);
        System.out.println(savings);
        
        // deposit $99 into savings
        System.out.println("\nDeposit $99 to savings.....");
        savings.deposit(99.00);  //checking $70, savings $99
        System.out.println(checking);
        System.out.println(savings);
        
        // change fee to .01, and withdraw $9 from savings
        System.out.println("\nChange Fee to .01, and withdraw $9 to savings.....");
        savings.setTransactionFee(.01);
        savings.withdrawal(9.00);  //checking $70, savings $89.99
        System.out.println(checking);
        System.out.println(savings);
        
        // transfer $1 to checking
        System.out.println("\nTransfering $1 to checking.....");
        savings.transfer(checking, 1.00);  //checking $71, savings $88.98
        System.out.println(checking);
        System.out.println(savings);

        // Withdraw $65 from checking
        System.out.println("\nWithdrawing $65 from checking.....");
        checking.withdrawal(65.00);  //checking $1, savings $88.98
        System.out.println(checking);
        System.out.println(savings);
        
        // Transfer $1 from checking to savings - transaction will not occur
        System.out.println("\nTransfering $1 to savings.....");
        checking.transfer(savings, 1.00);  //checking $1, savings $88.98
        System.out.println(checking);
        System.out.println(savings);
        
    }

}
