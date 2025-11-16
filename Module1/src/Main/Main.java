package Main;

public class Main {
	public static void main(String[] args) {
		CheckingAccount userAccount = new CheckingAccount(1.25); // new class instance
	// new account details test methods
		userAccount.setFirstName("Chuck");
		userAccount.setLastName("Jones");
		userAccount.setAccountID(12345);
	// show account information	
		userAccount.displayAccount();
	// deposit and withdrawal test methods	
		userAccount.deposit(0.00);
		userAccount.withdrawal(50.00);
	// overdraft fee assessment from CheckingAccount file	
		userAccount.processWithdrawal(75.00);
	}
}