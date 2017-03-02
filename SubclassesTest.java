/* Exercise 11.3
 * 
 */
import java.util.Date;

public class SubclassesTest {
	public static void main(String[] args) {
		
	Account account = new Account(12345678, 5, 0);
	CheckingAccount checkingAccount = new CheckingAccount(12345679, 5, 0);
	SavingsAccount savingsAccount = new SavingsAccount(12345677, 5);
	account.withdraw(75);
	account.deposit(80);
	
	// Print results 
	System.out.println(account.toString());
	System.out.println(checkingAccount.toString());
	System.out.println(savingsAccount.toString());
	}
}

//The Account class
class Account {
	private int id;							// field named id for the account (default 0 )
	private double balance;					// field named balance for the account (default 0 )
	private double annualInterestRate;  	// field named annualInterestRate that stores the current interest rate (default 0 )
	Date dateCreated = new java.util.Date();// field dateCreated that stores the date when the account was created.
	
	// constructor that creates a default account.
	 Account() {
		this (0,0,0);
	}
	
	// constructor that creates an account with the specified id and initial balance.
	Account(int newId, double newBalance, double annualInterestRate) {
		this.id = newId;
		this.balance = newBalance;
		this.annualInterestRate = annualInterestRate;
	}
	
	// accessor and mutator methods for id , balance , and annualInterestRate 
	public void setId(int newId) {
		this.id = newId;
	}
	public void setBalance(double newBalance) {
		this.balance = newBalance;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		this.annualInterestRate = newAnnualInterestRate;
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
	
	// 
	//public String getdateCreated() {
		//return dateCreated.toString();
	//}
	// get date created
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	public String toString() {
		return "Account " + id + " created on " + dateCreated + " has a balance of " + balance  +
				" and annual interest of " + annualInterestRate;
	}
}

//The CheckingAccount class
class CheckingAccount 
	extends Account{
	public double overdraft = -0.01;
	
	// constructor for checking account
	CheckingAccount(int id, double balance, double overdraft) {
		super();
		this.overdraft = overdraft;
	}
	// setter and getter for overdraft 
	public double getOverdraft() {
		return this.overdraft;
	}
	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
	
	// conditional statement for overdraft alert
	public void withdraw(double amount) {
		if (getBalance() - amount > overdraft) 
			super.withdraw(amount);
		}
	
	public String toString() {
		return "Overdraft limit is: " + overdraft;
	}
	
}

// The SavingsAccount class
class SavingsAccount
	extends Account {
	// constructor for savings account
	SavingsAccount(int id, double balance) {
		super();
	}
	
	public String toString() {
		return "Balance is";
	}
	
}



