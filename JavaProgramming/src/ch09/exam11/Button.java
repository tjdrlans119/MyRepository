package ch09.exam11;


public class Button {
	public static interface OnClickListener {
		void onClick();
	}

	private OnClickListener onClickListener; // 인스턴트 타입 필드만듬
	public void setOnClickListener(OnClickListener onClickListener) {   //외부에서 값받음,인터페이스로 구현된객체의
		this.onClickListener = onClickListener;
	}

	public void click() { // OnClickListener로 구현한 객체
		if (onClickListener != null) {
			onClickListener.onClick();
		}
	}
}
