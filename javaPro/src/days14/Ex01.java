package days14;

public class Ex01 {
	String message;
	
	/*
	public Ex01() {
		System.out.println("> Ex01 디폴트 생성자");
		message = "안녕"; // 생성자로 필드 초기화
	}
	*/
	
	public Ex01(String msg) {
		System.out.println("> Ex01 생성자");
		message = "msg";
	}
	public static void main(String[] args) {
		
		// [객체 생성할 때 디폴트 생성자 호출]
		//Ex01 obj = new Ex01();
		//obj.message = "어떤 메시지...";
		
		// [객체 생성할 때 매개변수 1개 있는 생성자 호출]
		// The constructor Ex01(String) is undefined
		// String이라는 매개변수를 가진 생성자 메소드가 없음
		Ex01 obj = new Ex01("원하는메시지");
		System.out.println(obj.message);
	}
}
