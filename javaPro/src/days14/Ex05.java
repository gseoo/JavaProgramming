package days14;

/**
 * @author 이경서
 * @date 2023. 8. 1. - 오전 11:40:17
 * @subject [this] 설명
 * @content 1. 정의 : 객체 자기 자신의 주소값을 가지는 참조변수
 * 			2. 용도
 * 				1) 멤버를 가리킬 때의 this (this.필드명 this.name, this.메소드명)
 * 					Point(int x, int y) { this.x=x; this.y=y;}
 * 				2) 생성자에서 또다른 생성자를 호출할 때의 this
 * 				3) 단독으로 사용될 때의 this : 리턴값, 매개변수
 */
public class Ex05 {
	public static void main(String[] args) {
		Person p = new Person();
		// p : 변수, 참조변수, 객체명, 객체
		
//		Point p1 = new Point(1, 2);
//		p1.printPoint();
//		
//		Point p2 = new Point(100, 200);
//		p2.printPoint();
		
		// The constructor Point(int) is undefined
		// Point(int) 생성자는 선언이 안 되어 있음
		Point p3 = new Point();
		p3.printPoint();
		
		Point p4 = new Point(10, 20);
//		p4.offsetPoint(100);
//		p4.printPoint();
		
		// 같은 의미
		p4.offsetPoint(100).printPoint();
				

	}
}
