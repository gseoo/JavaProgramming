package days08;

import java.util.Random;

public class Ex09_04 {
	public static void main(String[] args) {
		
		// [람다식과 스트림]
		new Random().ints(1,46).distinct().limit(6).sorted().forEach(n->System.out.println(n));
		// 				1~45 정수			중복제거	   6개만  오름차순 정렬          람다식으로 출력
		
		// 메서드 참조해서 출력
		// forEach(System.out::println);
	}
}
