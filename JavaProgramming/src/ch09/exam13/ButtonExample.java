package ch09.exam13;

public class ButtonExample {
	public static void main(String[] args) {
		Button btnOk = new Button();
		int value = 10;
		btnOk.setOnClickListener(new Button.OnClickListener() { // 중괄호 안에 정의된
																// 클래스의 생성자.
			// 중괄호 안에잇는것의 생성자는 Button.OnclikListener 이다.
			@Override
			public void onClick() {
				System.out.println("Play sound" + value);
			}
		});
		
		btnOk.click();
	}
}