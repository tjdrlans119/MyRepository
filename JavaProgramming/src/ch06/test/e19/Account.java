package ch06.test.e19;

public class Account {

	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
		if (balance < Account.MIN_BALANCE || balance > Account.MIN_BALANCE) {
			return;
		}
		this.balance = balance;
	}

	public static int getMinBalance() {
		return MIN_BALANCE;
	}

	public static int getMaxBalance() {
		return MAX_BALANCE;
	}

}
