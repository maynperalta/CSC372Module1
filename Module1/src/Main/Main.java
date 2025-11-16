package Main;

public class Main {
	public static void main(String[] args) {
		CheckingAccount userAccount = new CheckingAccount(1.25); // new class instance
	// new account details test methods
		userAccount.setFirstName("Rosetta");
		userAccount.setLastName("Tharpe");
		userAccount.setAccountID(45678910);
	// show account information	
		userAccount.displayAccount();
	// deposit and withdrawal test methods	
		userAccount.deposit(200.00);
		userAccount.withdrawal(85.00);
	// overdraft fee assessment from CheckingAccount file	
		userAccount.processWithdrawal(30.00);
	}
}