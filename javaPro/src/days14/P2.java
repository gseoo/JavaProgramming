package days14;

public class P2 {
	public static void main(String[] args) {
		Person p = new Person();
//		
//		Point p1 = new Point(1, 2);
//		p1.printPoint();
//		
//		Point p2 = new Point(100, 200);
//		p2.printPoint();
//		
//
//		Point p3 = new Point(40);
//		p3.printPoint();
		
		Point p4 = new Point(10, 20);
		p4.offsetPoint(100);
		p4.printPoint();
		
		// 같은 의미
		p4.offsetPoint(100).printPoint();
				

	}
}
