package ch10.exam03;

public class BalanceInsufficientExample extends Exception {
	public BalanceInsufficientExample() {
	}

	public BalanceInsufficientExample(String message) {
		super(message);
	}
}
