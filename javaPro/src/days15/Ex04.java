package days15;

public class Ex04 {
	public static void main(String[] args) {
		
		Point center = new Point(50,50);
		int r = 10;
		Circle c = new Circle(center, r);
		c.color = "red";
		
		// shape 부모클래스로부터 물려받은 draw() 메소드 수정 = 재정의 = 오버라이딩
		// 같은 이름으로 중복 함수 = 오버로딩
		// 원점 출력, 색깔 출력
		c.draw();
		
		System.out.println("-".repeat(30));
		
		Point p[] = {new Point(1,1), new Point(20,40), new Point(10,5)};
		Triangle t = new Triangle(p);
		t.draw();
		System.out.println("-".repeat(30));
	
	}
}

// 삼각형 : 한 평면상에 있고 일직선상에 없는 3개의 점 A,B,C를
//		  2개씩 쌍으로 하여 선분을 연결하여 이루어진 도형
class Triangle extends Shape{
	//꼭짓점 3개
	Point p[] = null;
	
	public Triangle(Point p[]) {
		this.p = p;
	}

	@Override
	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s]\n", this.p[0].getXY(),this.p[1].getXY(),this.p[2].getXY());
		super.draw();
	}
}

// 상속
class Circle extends Shape {
	public String color;
	Point center; //has-a 관계
	int r;
	
	public Circle() {
		this(new Point(0,0), 0);
	}

	public Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
	
	@Override
	void draw() {
		//System.out.printf("[color=%s, center=(%d,%d)]\n", this.color, this.center.x, this.center.y);
		System.out.printf("[color=%s, center=%S]\n", this.color, this.center.getXY());
	}
	
}

// 도형 : 삼각형, 사각형, 원, 마름모 등
class Shape {
	String color = "black";
	
	void draw() {
		System.out.printf("[color=%s]\n", this.color);
	}
}


//class Point extends java.lang.Object {
// 자바는 컴파일러가 자동으로 extends Object 상속
class Point {
	int x, y;
	Point() {
		this(0,0);
	}
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getXY() {
		return String.format("(%d,%d)", this.x, this.y);
	}
}
