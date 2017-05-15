package Chapter2_ClassAndObject;

public class BankAccount {
	
	private static int LAST_ACCOUNT_NUMBER = 0;
	private String ownerName;
	private int accountNumber;
	private float balance;
	
	public BankAccount(){
		this("", 0);
	}
	public BankAccount(String initName){
		this(initName, 0);
	}
	public BankAccount(String initName, /*int initAccNum, */float initBal){
		ownerName = initName;
		accountNumber = ++LAST_ACCOUNT_NUMBER;
		balance = initBal;
	}
	//如果需要生成一些特殊的样例账户，可以声明类方法，生成特殊的	实例
	public static BankAccount example1(){
		BankAccount ba = new BankAccount();
		ba.setOwnerName("Li Dakang");
//		ba.setAccountNumber(55400);
		ba.deposit(1000);
		return ba;
	}
	public static BankAccount example2(){
		BankAccount ba = new BankAccount();
		ba.setOwnerName("Hou Liangping");
//		ba.setAccountNumber(55401);
		ba.deposit(1000);
		ba.deposit(2000);
		return ba;
	}
	public static BankAccount example3(){
		BankAccount ba = new BankAccount();
		ba.setOwnerName("Zhao Donglai");
//		ba.setAccountNumber(55402);
		return ba;
	}
	
	public String getOwnerName(){
		return ownerName;
	}
	public int getAccountNumber(){
		return accountNumber;
	}
	public float getBalance(){
		 return balance;
	}
	public void setOwnerName(String newName){
		ownerName = newName;
	}
	//修改构造方法，取消帐号参数, 不允许直接修改账号，取消setAccountNumber方法
/*	public void setAccountNumber(int newNum){
		accountNumber = newNum;
	}																*/
	//取消setBalance方法，仅通过存取款在操作改变余额
/*	public void setBalance(float newBalance){
		balance = newBalance;
	}																*/
	
	//update1: override toString()
	//update3: revise balance format using DecimalFormat，只保留2位小数
	public String toString(){
		return("Account#:" + 
				new java.text.DecimalFormat("000000").format(accountNumber) + 
				" with balance $"+
				new java.text.DecimalFormat("$0.00").format(balance));
	}
	
	//update2: add deposite(), withdraw()
	public float deposit(float anAmount){
		balance += anAmount;
		return balance;
	}
	public float withdraw(float anAmount){
		if(anAmount <= balance)
		balance -= anAmount;
		return anAmount;
	}
	
	
}
