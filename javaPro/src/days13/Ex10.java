package days13;

public class Ex10 {
	public static void main(String[] args) {
		// [리턴자료형이 참조타입]
		// Point 클래스 안에 plusPoint() 메소드 추가
		//	  ㄴ Point 객체를 매개변수로 받아서
		// 		x, y 좌표를 10씩 증가시킨 후
		//		증가시킨 좌표를 반환하는 메소드
		
		Point p1 = new Point();
		p1.x = 1;
		p1.y = 2;
		
		Point p2 = p1.plusPoint(p1);
		p2.dispXY();
		
		p2 = p1.plusPoint();
		p2.dispXY();
		// 위에 두 함수는 매개변수가 달라도 같은 기능을 함
	}
}
