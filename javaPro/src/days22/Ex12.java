package days22;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Ex12 {
	public static void main(String[] args) {
		// ListIterator(반복자) : iterator에 양방향으로 조회하는 기능이 추가된 것
		// 양방향 조회가 가능한데 왜 앞에 List가 붙어 있나?
		// List 인터페이스를 구현한 클래스만 ListIterator를 사용할 수 있음
		
		Vector v = new Vector();
		v.add("유희진");
		v.add("임경재");
		v.add("김호영");
		v.add("이지현");
		
		ListIterator ir = v.listIterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}
		
		System.out.println("---역방향---");
		
		while (ir.hasPrevious()) {
			String name = (String) ir.previous();
			System.out.println(name);
		}
	}
}