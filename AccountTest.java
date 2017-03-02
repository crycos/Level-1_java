/* Exercise 9.7
 * (The Account class) Design a class named Account that contains:
 * - A private int data field named id for the account (default 0 ).
 * - A private double data field named balance for the account (default 0 ).
 * - A private double data field named annualInterestRate that stores the current interest rate (default 0 ). Assume all accounts have the same interest rate.
 * - A private Date data field named dateCreated that stores the date when theaccount was created.
 * - A no-arg constructor that creates a default account.
 * - A constructor that creates an account with the specified id and initial balance.
 * - The accessor and mutator methods for id , balance , and annualInterestRate .
 * - The accessor method for dateCreated .
 * - A method named getMonthlyInterestRate() that returns the monthly interest rate.
 * - A method named getMonthlyInterest() that returns the monthly interest.
 * - A method named withdraw that withdraws a specified amount from the account.
 * - A method named deposit that deposits a specified amount to the account.
 * Draw the UML diagram for the class and then implement the class. (Hint: The
 * method getMonthlyInterest() is to return monthly interest, not the interest rate.
 * Monthly interest is balance * monthlyInterestRate . monthlyInterestRate
 * is annualInterestRate / 12 . Note that annualInterestRate is a percentage,
 * e.g., like 4.5%. You need to divide it by 100.)
 * Write a test program that creates an Account object with an account ID of 1122,
 * a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw
 * method to withdraw $2,500, use the deposit method to deposit $3,000, and print
 * the balance, the monthly interest, and the date when this account was create
 */
import java.util.Date;
public class AccountTest {
	public static void main(String[] args) {
		// Account object creation
		Account account1 = new Account(1122, 20000);
		account1.setAnnualInterestRate(4.5);
		account1.withdraw(2500);
		account1.deposit(3000);
		System.out.printf("Balance is $" + "%,.2f", account1.getBalance());
		System.out.println(" and monthly interest is $" + account1.getMonthlyInterest() + 
				". Account #" + account1.getId() + " created on " + account1.dateCreated);
	}
}

// The Account class
class Account {
	private int id;							// field named id for the account (default 0 )
	private double balance;					// field named balance for the account (default 0 )
	private double annualInterestRate;  	// field named annualInterestRate that stores the current interest rate (default 0 )
	Date dateCreated = new java.util.Date();// field dateCreated that stores the date when the account was created.
	
	// no-arg constructor that creates a default account.
	public Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
	}
	
	// constructor that creates an account with the specified id and initial balance.
	public Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
	}
	
	// accessor and mutator methods for id , balance , and annualInterestRate 
	public void setId(int newId) {
		id = newId;
	}
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	// method named getMonthlyInterestRate() that returns the monthly interest rate.
	public double getMonthlyInterestRate() {
		return (annualInterestRate / 12);
	}
	/* Hint: The method getMonthlyInterest() is to return monthly interest, not the interest rate.
	 * Monthly interest is balance * monthlyInterestRate . monthlyInterestRate
	 * is annualInterestRate / 12 . Note that annualInterestRate is a percentage,
	 * e.g., like 4.5%. You need to divide it by 100.
	*/
	// method named getMonthlyInterest() that returns the monthly interest
	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}

	 // method named withdraw that withdraws a specified amount from the account.
	public void withdraw(double amount) {
		balance -= amount; 
	}
	
	// method named deposit that deposits a specified amount to the account.
	public void deposit(double amount) {
		balance += amount;
	}

}	
