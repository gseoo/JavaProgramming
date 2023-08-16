package days14;

public class Point {
	private int x;
	private int y;
	
	
	// 디폴트 생성자 선언
	public Point() {
		this(1);
		System.out.println("> Point 디폴트 생성자 호출됨...");
	}

/*
	public Point(int a, int b) {
		System.out.println("> Point 2 생성자 호출됨...");
		x = a;
		y = b;
	}
	*/
	
	public Point(int x, int y) {
		System.out.println("> Point 2 생성자 호출됨...");
		// The assignment to variable x has no effect
		// x에 값을 할당해도 효과가 없음
		this.x = x;
		this.y = y;
	}
	
	
	public Point(int i) {
		this(i,i); //Point(x,y)를 호출하겠다 - 생성자 안에서 또다른 생성자 호출
		System.out.println("> Point 1 생성자 호출됨...");
//		this.x = i;
//		this.y = i;
		
	}

	public void printPoint() {
		System.out.printf("> x=%d, y=%d\n", this.x, this.y);
	}
	
	public Point offsetPoint(int n) {
		this.x += n;
		this.y += n;
		return this;
	}
	
	// 두 좌표를 더해서 새로운 좌표 반환
	// Point p3 = p1.plusPoint(p2);
	public Point plusPoint(Point p) {
		// this : p1
		// p : p2
		int x = this.x + p.x;
		int y = this.y + p.y;
		return new Point(x,y);
	}
}
