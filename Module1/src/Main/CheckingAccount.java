package Main;

public class CheckingAccount extends BankAccount {
	private double interestRate;
// inherit from BankAccount and add interest rate attribute	
	public CheckingAccount(double rate) {
		super();
		this.interestRate = rate;
	}
// checking account withdrawal (different from generic bank account withdrawal)	
	public void processWithdrawal (double amount) {
		if (amount <= 0) {
			System.out.println("Withdrawal amout must be greater than zero.");
			return;
		}
// if checking account withdrawal request greater than balance. add overdraft fee.		
		if (amount > balance) {
			balance -= (amount + 30);
			System.out.printf("Account overdrawn. $30 fee charged. Balance: $%.2f%n", balance);
		} else {
			balance -= amount;
			System.out.printf("Withdrawal successful. Balance: $%.2f%n", balance);
		}
	}
// displays attributes from superclass method and adds interest rate	
	public void displayAccount() {
		accountSummary();
		System.out.printf("Interest rate: %.2f%%%n", interestRate);
	}
}
