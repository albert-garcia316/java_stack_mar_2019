package bank_account2;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(BankAccount.numberOfAcconts);
		System.out.println(BankAccount.vaultBalance);
		BankAccount myAccount = new BankAccount();
		myAccount.showBlanace();
		myAccount.deposit("savings", 200.00);
		myAccount.deposit("checking", 100.00);
		System.out.println(BankAccount.vaultBalance);
		myAccount.withdraw("checking", 10.00);
		myAccount.showBlanace();
		myAccount.withdraw("checking", 100.00);
		System.out.println(BankAccount.vaultBalance);
	}

}
