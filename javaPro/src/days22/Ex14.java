package days22;

import java.util.HashSet;

public class Ex14 {
	public static void main(String[] args) {
		/*
		[Set 인터페이스를 구현한 컬렉션 클래스]
		- Set 인터페이스 : Collection 인터페이스의 자식
		- 특징 : 순서 유지 x, 중복 허용 x
		- HashSet 컬렉션 클래스
		- (참고) Set + 순서 유지 o -> LinkedHashSet
		 */
		
		HashSet hs = new HashSet();
		hs.add(9);
		hs.add(1);
		hs.add(15);
		hs.add(10);
		
		// 저장 순서 유지 X
		System.out.println(hs); // [1, 9, 10, 15]
		
		// 중복 허용 X
		hs.add(1);
		System.out.println(hs); // [1, 9, 10, 15]
		
		System.out.println(hs.size()); // 4
		
	}
}
