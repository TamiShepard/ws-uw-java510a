/**
 * SImple driver program that initiates transfer and withdrawal for a bank account
 * @author cburke
 *
 */
public class BankAccountDriver {

	/**
	 * Main method
	 * @param args
	 */
    public static void main(String[] args) {
        BankAccount checking = new BankAccount("CBurke", "Checking");
        checking.deposit(80.00);
        
        
        BankAccount savings = new BankAccount("CBurke", "Savings");
        savings.deposit(20.00);
        
        System.out.println("Initial balance:");
        System.out.println(checking);
        System.out.println(savings);
        
        System.out.println("Transfering $20 to savings.....");
        checking.transfer(savings, 20.00);  //checking $55, savings $40 (checking -$25, savings +$20)
        System.out.println(checking);
        System.out.println(savings);
        
        System.out.println("Transfering $10 to savings.....");
        checking.transfer(savings, 10.00);  //checking $40, savings $50 (checking -$15, savings +$10)
        System.out.println(checking);
        System.out.println(savings);
        
        System.out.println("Transfering $60 to checking.....");
        savings.transfer(checking, 60.00);  //checking $85, savings $0 (checking +$45, savings -$50)
        System.out.println(checking);
        System.out.println(savings);
        

    }

}
