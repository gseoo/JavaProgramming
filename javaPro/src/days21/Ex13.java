package days21;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex13 {
	public static void main(String[] args) {
		/*
		 1. 컬렉션 클래스 - ArrayList
		 	ㄴ 가장 많이 사용되는 컬렉션 클래스
		 	ㄴ List 인터페이스를 구현한 클래스
		 	ㄴ 순서 O, 중복 O
		 	ㄴ 배열처럼 사용됨
			ㄴ ArrayList 안에 있는 값들을 요소(Element)라고 함
		 	ㄴ 배열의 단점(배열 크기가 자동으로 증가/감소되지 않음) 보완
				-> ArrayList
		*/
		
		String names[] = new String[3];
		names[0] = "주강민";
		names[1] = "정하영";
		names[2] = "임경재";
		System.out.println(names.length); // 3
		//names[3] = "이지현"; //ArrayIndexOutOfBoundsException
		// 검색 후 출력
		for(int i=0; i<names.length; i++) {
			if(names[i].equals("정하영"))
				System.out.println(names[i]);
		}
		
		// ArrayList list = new ArrayList();
		// -> 크기 초기화 안 하면 10개
		ArrayList list = new ArrayList(3);
		list.add("주강민");
		list.add("정하영");
		list.add("임경재");
		System.out.println(list.size()); // 3
		list.add("이지현");
		
		System.out.println(list.contains("정하영")); // true
		int index = list.indexOf("정하영");
		if(index != -1) {
			System.out.println(list.get(index)); // 정하영
			list.remove(index);
			list.add(index, "홍길동");
		}
		else System.out.println("없음");
		System.out.println(list); 
		// index = list.lastIndexOf("정하영"); // 뒤에서부터 찾은 인덱스값
		
		//list.clear();
		System.out.println(list);
		
		System.out.println(list.isEmpty());
		
		// iterator()
		// 요소를 순차적으로 처리할 수 있는 반복자(Iterator)를 반환하는 메소드
		Iterator ir = list.iterator();
		
		// hasNext() : 다음 요소가있으면 true/ else false
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
			
		}
	}
}
