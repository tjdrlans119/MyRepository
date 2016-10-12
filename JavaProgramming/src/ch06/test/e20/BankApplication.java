package ch06.test.e20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------- ----------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------- ----------------");
			System.out.print("선택>");
			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				crateAccount();

			}
			if (selectNo == 2) {
				listAcoount();
			}
			if (selectNo == 3) {
				saveAccount();
			}
			if (selectNo == 4) {
				drawAccount();
			}
			if (selectNo == 5) {
				System.out.println("종료합니다");
				run = false;
			}
		}
	}

	private static void drawAccount() {

	}

	private static void saveAccount() {
		System.out.println("입금하기");
		System.out.println("----------계좌목록----------");
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.print("계좌번호: " + accountArray[i].getAno() + "  ");
				System.out.print("계좌주: " + accountArray[i].getOwner() + "  ");
				System.out.print("잔액: " + accountArray[i].getBalance() + "  ");
				System.out.println();
				break;
			}
		}
		System.out.print("계좌번호 선택>");
		String ano = scanner.next();
		System.out.print("입금 금액 입력>");
		int inMoney = scanner.nextInt();
		Account account = findAccount(ano);
		String sum = account.getBalance() + account.getAno();
		System.out.println(ano + "계좌 잔액 : " + sum);

	}

	private static Account findAccount(String ano) {
		Account account = null;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				if (accountArray[i].getAno().equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
			System.out.println("계좌가 없습니다.");
			break;
		}
		return account;
	}

	private static void listAcoount() {
		System.out.println("----------계좌목록----------");
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.print("계좌번호: " + accountArray[i].getAno() + "  ");
				System.out.print("계좌주: " + accountArray[i].getOwner() + "  ");
				System.out.print("잔액: " + accountArray[i].getBalance() + "  ");
				System.out.println();
				break;
			}
		}
		System.out.println("");
	}

	private static void crateAccount() {
		System.out.println("계좌 생성");
		System.out.print("계좌번호입력:");
		String ano = scanner.next();

		System.out.print("계좌주: ");
		String owner = scanner.next();

		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		System.out.println("***SAVE OK***");

		Account account = new Account(ano, owner, balance);

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, balance);
				break;
			}

		}
	}
}
