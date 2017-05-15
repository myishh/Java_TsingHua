package Chapter2_ClassAndObject;

public class BankAccountTest {
	public static void main(String[] args) {
		//1st test
//		BankAccount anAccount;
//		anAccount = new BankAccount("Sha Ruijin", 10001, 0.0f);
//		anAccount.setBalance(anAccount.getBalance() + 100.0f);
//		System.out.println("Here is the account: " + anAccount);
//		System.out.println("Account name: "+anAccount.getOwnerName());
//		System.out.println("Account number: "+anAccount.getAccountNumber());
//		System.out.println("Balance: $"+anAccount.getBalance());
		
		//2nd test
//		BankAccount anAccBankAccount anAccount;ount;
//		anAccount = new BankAccount("Sha Ruijin", 0.0f);
//		anAccount.setBalance(anAccount.getBalance() + 100.0f);
//		System.out.println(anAccount);
//		System.out.println();
//		anAccount = new BankAccount("Gao Yuliang", 0.0f);
//		System.out.println(anAccount);
//		anAccount.deposit(225.67f);
//		anAccount.deposit(300.00f);
//		System.out.println(anAccount);
//		anAccount.withdraw(400.67f);
//		System.out.println(anAccount);
		
		//3rd test
		BankAccount bobsAccount, marysAccount, biffsAccount;
		bobsAccount = BankAccount.example1(); 
		marysAccount = BankAccount.example2();
		biffsAccount = BankAccount.example3();
		marysAccount.setOwnerName("Mary");
		marysAccount.deposit(250);
		System.out.println(bobsAccount);
		System.out.println(marysAccount);
		System.out.println(biffsAccount);
		
	}
	

}
