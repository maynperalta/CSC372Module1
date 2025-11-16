package Main;

public class Main {
	public static void main(String[] args) {
		CheckingAccount userAccount = new CheckingAccount(1.25); // new class instance
	// new account details test methods
		userAccount.setFirstName("John");
		userAccount.setLastName("Smith");
		userAccount.setAccountID(8675309);
	// show account information	
		userAccount.displayAccount();
	// deposit and withdrawal test methods	
		userAccount.deposit(100.00);
		userAccount.withdrawal(50.00);
	// overdraft fee assessment from CheckingAccount file	
		userAccount.processWithdrawal(75.00);
	}
}