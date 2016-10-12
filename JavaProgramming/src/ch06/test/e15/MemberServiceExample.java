package ch06.test.e15;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("sung", "0000");
		if(result){
			System.out.println("로그인됨");
			memberService.logout("hong");
		}else{
			System.out.println("id또는 password가 올바르지 않습니다.");
		}

	}

}
