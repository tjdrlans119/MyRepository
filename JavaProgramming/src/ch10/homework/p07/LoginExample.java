package ch10.homework.p07;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void login(String id, String password) throws NotExistIdexception, WrongPasswordException {//예외 떠넘김
		// id가 "blue"가 아니라면 NotExistIDException 발생시킴
		if (!id.equals("blue")) {
			throw new NotExistIdexception("ID없습니다.");
		}

		// password가 "12345"가 아니라면 WrongPasswordException 발생
		if (!password.equals("12345")) {
			throw new WrongPasswordException("Password틀림");
		}

	}
}
