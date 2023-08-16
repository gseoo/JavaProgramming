package days18;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Ex01_02 {
	public static void main(String[] args) {
		
		String names[] = {"김호영", "박정호", "주강민", "김정주", "고경림"};
		
		// String 배열을 출력하는 방법? object 배열을 사용
		// -> 매개변수 다형성
		System.out.println(Arrays.toString(names));
		
		// 이름을 오름차순 정렬 출력
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		// 이름을 내림차순 정렬 출력
		Arrays.sort(names, Collections.reverseOrder());
		
		/*
		// [익명 클래스] 사용
		Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		*/
		
		/*
		// 익명 클래스를 [람다식]으로 표현
		Arrays.sort(names,(o1, o2) -> o2.compareTo(o1));
		*/
		
		System.out.println(Arrays.toString(names));
	}
}
