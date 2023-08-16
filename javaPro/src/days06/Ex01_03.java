package days06;

import java.util.Random;
import java.util.stream.IntStream;

public class Ex01_03 {
	public static void main(String[] args) {
		
		int a=5, b=7, c=1;
		
		// jdk 1.5 제네릭
		// 2. jdk 1.8 람다식과 스트림
		// OptionalInt[7]
		// System.out.println(IntStrea.of(a,b,c).max();
		
		/* [1]
		int max = IntStream.of(a,b,c).max().getAsInt();
		System.out.println(max);
		*/
		
		
		/* [2] System.out::println -> 메소드 참조
		IntStream.of(a,b,c).max().ifPresent(System.out::println);
		*/
		
//		-------------------------------------------------------------------------
		
		// 10개 정수 배열에서 가장 큰 값 구하기 (람다식과 스트림)
		int max = new Random().ints(5,16).limit(10).max().getAsInt();
		System.out.println(max);
	}
}
