package days24;

import java.util.Arrays;
import java.util.Comparator;

public class Ex06_02 {
	public static void main(String[] args) {
		String names[] = {"이지현", "김호영", "임경재", "유희진"};
		System.out.println(Arrays.toString(names));

		/*
		부모타입 객체명 = new 부모타입(매개변수...){
		     @Override 재정의 함수 구현
		     // 필드, 메소드도 가능
		}
		 */

		/*
		Comparator c = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		};

		Arrays.sort(names, c);
		 */

		/*
		// sort() 메소드 호출 시 매개변수로 익명 클래스 사용
		Arrays.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		*/
		
		Arrays.sort(names,(o1, o2)->o2.compareTo(o1));
		
		System.out.println(Arrays.toString(names));
	}
}

/*
class StringDescendingComparator implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
}
 */
