package ch06.test.e15;

public class MemberService {

	// Field

	// Constructor
	boolean login(String id, String password) {
		if (id.equals("sung") && password.equals("0000")) {
			return true;
		} else {
			return false;
		}
	}

	void logout(String id){
		System.out.println("로그아웃");
	}
	

	// Method

}
