package days24;

/**
 * @author 이경서
 * @date 2023. 8. 16. - 오후 3:06:47
 * @subject 제네릭 타입
 * @content 1) 제네릭 클래스
 * 			2) 제네릭 메소드
 */
public class Ex08 {
	public static void main(String[] args) {
		// [제네릭 클래스]
		
		//Box<String> box1 = new Box<>();
		
		// 자동 호환
		Box box = new Box();
		box.item = "xxxx";
		
	}
}

// 다양한 타입을 사용하기 위해 컴파일 시에 타입을 결정하는 기능 : 제네릭
// 1) Box(클래스명) : 원시타입(raw type)
// 2) T : 타입 변수 or 타입 매개변수
// 3) Box<T> : 제네릭 클래스, 'T'의 Box
class Box<T> {
	T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}
