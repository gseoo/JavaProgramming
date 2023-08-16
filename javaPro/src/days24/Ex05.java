package days24;

// 중첩 클래스 사용 예

public class Ex05 {
	public static void main(String[] args) {
		
		Button btnTouch = new Button();
		btnTouch.setOnClickListener(new CallListener());
		btnTouch.touch();
		
		btnTouch.setOnClickListener(new MessageListener());
		btnTouch.touch();
		
	}
}

class Button {
	
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		this.listener.onClick();
	}	
	
	// 중첩 인터페이스
	interface OnClickListener {
		void onClick();
		
	}
}


class CallListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("전화를 건다");
	}
}


class MessageListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("메시지를 보낸다");
	}
}



