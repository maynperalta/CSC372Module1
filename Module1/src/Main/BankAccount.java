package Main;

public class BankAccount {
	private String firstName;
	private String lastName;
	private int accountID;
	protected double balance;
	
// constructor to initialize bank account balance to zero.	
	public BankAccount() {
		this.balance = 0.0;
	}
// deposit method	
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.printf("Deposit successful. New balance: $%.2f%n", balance);
			System.out.println();
		} else {
			System.out.println("Deposit amount must be greater than zero.");
			System.out.println();
		}
	}
// withdrawal method
	public void withdrawal(double amount) {
		if (amount > 0 && balance >= amount) {
			balance -= amount;
			System.out.printf("Withdrawal successful. New balance: $%.2f%n", balance);
			System.out.println();
		} else if (amount > balance) {
			System.out.println("Insufficient funds.");
			System.out.println();
		} else {
			System.out.println("Withdrawal amout must be greater than zero.");
			System.out.println();
		}
	}
// setter and getter methods	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAccountID() {
		return accountID; 
	}
// getter method for balance	
	public double getBalance() {
		return balance; 
	}
// method to display account information	
	public void accountSummary() {
		System.out.println("Account Details:");
		System.out.println("Account ID: " + accountID);		
		System.out.println("Name: " + lastName + ", " + firstName);
		System.out.printf("Balance: $%.2f%n", balance);
	}
}
