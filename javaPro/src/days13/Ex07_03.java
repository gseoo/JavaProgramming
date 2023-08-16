package days13;

public class Ex07_03 {
	public static void main(String[] args) {
		
	Point p = new Point();
	p.x = 10;
	p.y = 20;
	System.out.printf("> x=%d, y=%d\n", p.x, p.y);
	
	swap(p);
	
	System.out.printf("> x=%d, y=%d\n", p.x, p.y);
	}

	//						참조형 매개변수
	private static void swap(Point p) {
		int temp = p.x;
		p.x = p.y;
		p.y = temp;
		
	}
}
