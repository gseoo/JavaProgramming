package days11;

import java.util.ArrayList;

public class Ex02_02 {
	public static void main(String[] args) {
		
		// 검색
		// 1. 순차검색 (sequential Search)
		// 	  : 리스트에서 찾고자 하는 값을 맨 앞에서부터 끝까지 차례대로 찾아 나가는 것
		// 2. 이진검색 (binary Search) -> 정렬 필수
		
		int [] m =  {3,5,2,4,1};
		// 위의 코딩처럼 배열 m 사용 -> 단점
		// 1) 요소 추가 (배열의 크기가 자동으로 증가/감소되지 않음)
		// 2) 요소 삽입 (크기 늘리기 + 삽입한 이후의 값들은 뒤로 밀기)
		// 3) 요소 삭제 (삭제한 이후의 값들을 앞으로 당김 + 크기 줄이기)
		// 4) 요소 수정 x
		
		// -> 컬렉션(collection) 클래스
		// ArrayList<E> jdk 1.5 제네릭스
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(4);
		list.add(1);
		
		int index = list.indexOf(4); // 요소의 위치
		System.out.println(index);
		System.out.println(list);
		
		list.add(index, 100); // 요소 삽입
		System.out.println(list);
	}
}
