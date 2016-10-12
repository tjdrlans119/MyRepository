package ch06.homework2;

public class Account {
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	private int balance;

	int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
		if (balance < Account.MIN_BALANCE || balance > Account.MAX_BALANCE) {
			return;
		}
	
	}
}
