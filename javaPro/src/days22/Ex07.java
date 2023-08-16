package days22;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class Ex07 {
	public static void main(String[] args) {
		
		/*
		[Vector 컬렉션 클래스]
		- List 인터페이스를 구현한 클래스
		- 순서 유지 O, 중복 O
		- ArrayList와 동일
		
		*/
		Vector v = new Vector();
		
		// StringBuilder : 멀티 스레드 x, 동기화 처리 x
		// StringBuffer : 멀티 스레드 o, 동기화 처리 o
		
		v.addElement("김호영");
		v.add("김성준");
		v.add("이지현");
		
		System.out.println(v.size()); // 3 - 요소의 갯수
		System.out.println(v.capacity()); // 10 - 용량
		
		v.trimToSize(); // 빈 요소 제거
		System.out.println(v.capacity()); // 3
		
		v.setSize(5); // 요소 갯수를 5로 설정 - 빈 곳은 null 삽입
		
		System.out.println(v.size()); // 5
		System.out.println(v); // [김호영, 김성준, 이지현, null, null]
		
		System.out.println(v.get(0)); // 김호영
		System.out.println(v.elementAt(0)); // 김호영
		
		// 반복자가 아니라 열거자를 돌려줌 - 열거자랑 반복차 차이 알아두기
		// 반복자 : 어떤 컬렉션 객체에서 반복자를 가져와 순차적으로 1개씩 접근해 출력하는 작업
		// -> 도중에 그컬렉션 클래스에 접근해 n번째 값을 수정하면 바로 오류 발생
		// 열거자 : 중간에 수정이 일어나도 그 작업을 끝까지 함
		// -> 일단 작업부터 끝냄
		// 차이 : fail-fast : 중간에 수정이 발생하면 오류를 띄우는 것
		Enumeration en = v.elements();
		
		// hasMoreElements() 요소가 더 있으면 True else False 반환
		while (en.hasMoreElements()) {
			String name = (String) en.nextElement();
			System.out.println(name);
		}
		
		/*
		v.remove(0); // 제거한 값 리턴
		v.removeElementAt(0); // 리턴 타입 void
		*/
		
		// Vector 안에 null 요소 제거한 나머지 요소 출력
		v.removeIf(n-> n==null);
		System.out.println(v);
		
		// v.forEach(n->System.out.println(n));
		
		//v.clear(); 
		//v.clone();
		
		// 둘이 같음
		v.firstElement();
		v.get(0);
		
		v.lastElement();
		v.get(v.size()-1);
		
		v.insertElementAt("임경재", 1);
		v.add(1, "임경재");
		
		List sublist = v.subList(0, 2);
		System.out.println(sublist); // [김호영, 임경재]
	}
}
