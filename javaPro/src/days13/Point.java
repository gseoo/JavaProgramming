package days13;

public class Point {


	public int x = 0;
	public int y = 0;

	public Point(int i, int j) {
		x = i;
		y = j;
	}

	public Point() { 
		// 디폴트 생성자 
	}

	public void dispXY() {
		System.out.printf("> x=%d, y=%d\n", x, y);
	}
	
	// 리턴 자료형이 Point 클래스의 참조타입
	public Point plusPoint(Point p) {
		
		// 새로운 좌표객체를 생성해서 반환
		//The constructor Point() is undefined
		Point p2 = new Point();
		p2.x = p.x + 10;
		p2.y = p.y + 20;
		
		return p2;
	}
	
	// 중복함수
	// 오버로딩
	//p1.plusPoint()로 호출했으니까 여기에 x, y는 p1의 값임
	public Point plusPoint() {
		//System.out.printf("> x=%d, y=%d", x, y);
		
		Point p2 = new Point();
		p2.x = x + 10;
		p2.y = y + 20;
		
		return p2;
	}

}
