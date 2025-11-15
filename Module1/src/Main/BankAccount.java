package Main;

public class BankAccount {
	private String firstName;
	private String lastName;
	private int accountID;
	private double balance;
	
	public BankAccount() {
		this.firstName = "";
		this.lastName = "";
		this.accountID = 0;
		this.balance = 0.0;
	}
	public void deposit(double value) {
		if(value > 0) {
			balance += value;
		} else {
			System.out.println("Amount of deposit cannot be negative.");
		}
	}
	public void withdrawal(double value) {
		if (value > 0 && balance >= value) {
			balance -= value;
		} else if (value > balance) {
			System.out.println("Insufficient funds.");
		} else {
			System.out.println("Amount of withdrawal cannot be negative.");
		}
	}
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
	public double getBalance() {
		return balance; 
	}
	public void accountSummary() {
		System.out.println("Account Details:");
		System.out.println("Account ID: " + accountID);		
		System.out.println("Name: " + lastName + ", " + firstName);
		System.out.printf("Balance: $%.2f%n", balance);
	}
}
