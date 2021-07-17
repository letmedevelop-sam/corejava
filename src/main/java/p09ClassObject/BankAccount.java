package p09ClassObject;

public class BankAccount {

	String accountHolder;
	double balance;
	int accountNumber;
	
	public void deposit (double amount) {
		System.out.println(" depositing $ " + amount + " to Account " + accountNumber);
		balance+=amount;
	}

	public void withdraw ( double amount) {
		System.out.println("Withdrawing $" + amount + " from Account " + accountNumber);
		balance-=amount;
		
		if(balance<0) {
			balance-=35;
		}
		
	}
	public void showBalance() {
		System.out.println("--------------------------------");
		System.out.println("Account Holder : " + accountHolder);
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Balance        : " + balance);
		System.out.println("--------------------------------");
	}
	
	public void charge (double price, String item) {
		if(balance >= price) {
			System.out.println("Buying " + item + " for $ " +  price + " from Account " + accountNumber);
			balance -= price;
			
		}else{
			System.out.println(" Insufficient funds to purchase " + item + " from Account " + accountNumber);
		}
	}
}
