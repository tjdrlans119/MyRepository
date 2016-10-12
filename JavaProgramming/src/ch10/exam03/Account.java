package ch10.exam03;

public class Account {
	private long balance;

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) throws BalanceInsufficientExample {
		if (balance >= money) {
			balance -= money;
		} else {
				throw new BalanceInsufficientExample("잔액부족");
		}
	}

}
