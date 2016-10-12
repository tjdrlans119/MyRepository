package ch10.exam03;

public class Example {
	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(10000);
		System.out.println(account.getBalance());
		
		try {
			account.withdraw(1000000);
			System.out.println("출금  완료");
		} catch (BalanceInsufficientExample e) {
			System.out.println(e.getMessage());
			System.out.println("출금  안됨");
			e.printStackTrace();
			
		}	
				

	
	}
}
