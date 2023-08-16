package days18;

public class Ex03 {
	public static void main(String[] args) {
		// [Object 클래스] : 모든 클래스의 최상위 부모 클래스
		// 필드 없음, 메소드만 11개 존재함
		Item item1 = new Item(10);
		Item item2 = new Item(10);
		
		System.out.println(item1.equals(item2)); // false
		
		Item item3 = item1; // 클래스(객체) 복사 : item3은 item1의 인스턴스를 참조하겠다
		System.out.println(item1.equals(item3)); // true
		
		// boolean Object.equals() : 동일한 객체(인스턴스)를 참조하는지 여부 확인
	}
}

class Item extends Object {
	int value;
	Item(int value) {
		this.value = value;
	}
	
}