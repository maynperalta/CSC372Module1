package Main;

public class Main {
	public static void main(String[] args) {
		CheckingAccount userAccount = new CheckingAccount(1.25);
		
		userAccount.setFirstName("John");
		userAccount.setLastName("Smith");
		userAccount.setAccountID(8675309);
		
		userAccount.deposit(100.00);
		userAccount.withdrawal(50.00);
		userAccount.processWithdrawal(75.00);
		
		userAccount.displayAccount();
	}
}