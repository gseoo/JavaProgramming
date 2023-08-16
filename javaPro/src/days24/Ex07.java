package days24;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex07 {
	public static void main(String[] args) {
		/*
		[제네릭(Generics)]
		1. 제네릭 : 다양한 타입의 객체를 다루는 메소드, 컬렉션 클래스에서 컴파일 시 타입을 체크해주는 기능
		2. 왜? 객체의 타입을 컴파일 시에 체크하기 때문에 객체 타입의 안정성을 높이고 형 변환의 번거로움이 줄어든다.
			  -> 코드가 간결해짐(제네릭의 장점)
		
		 */
		
		/*
		ArrayList list = new ArrayList();
		list.add("홍길동");
		
		String name = (String) list.get(0);
		System.out.println(name);
		
		list.add(20);
		
		int age = (int) list.get(1);
		System.out.println(age);
		
		list.add(true);
		list.add('A');
		*/
		
		// 제네릭 클래스
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("김정주");
		list.add("이지현");
		list.add("김호영");
		
		/*
		String name = list.get(0); // 다운캐스팅 필요 x
		System.out.println(name);
		*/
		
		Iterator<String> ir = list.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}
	}
}
