package Main;

public class CheckingAccount extends BankAccount {
	private double interestRate;
	
	public CheckingAccount(double rate) {
		super();
		this.interestRate = rate;
	}
	
	public void accountWithdrawal (double amount) {
		if (amount <= 0) {
			System.out.println("Amount of withdrawal cannot be negative.");
			return;
		}
		if (amount > balance) {
			balance -= (amount + 30);
			System.out.printf("Account overdrawn. $30 fee has been charged. Balance: $%.2f%n", balance);
		} else {
			balance -= amount;
			System.out.printf("Withdrawal successful. Balance: $%.2f%n", balance);
		}
	}
	public void displayAccount() {
		accountSummary();
		System.out.printf("Interest rate: %.2f%%n", interestRate);
	}
}
