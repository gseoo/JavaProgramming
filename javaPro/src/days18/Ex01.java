package days18;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Ex01 {
	public static void main(String[] args) {
		
		int m[] = {3,5,2,4,1};
		System.out.println(Arrays.toString(m));
		
		// 오름차순 정렬 후 출력
		Arrays.sort(m);
		System.out.println(Arrays.toString(m));
		
		// 내림차순 정렬 후 출력
		// The method sort(int[]) in the type Arrays is not applicable for the arguments (int[], Collections.reverseOrder())
		// int 배열은 이런 형태 사용 불가
		// Arrays.sort(T[] a, Comparator<? super T> c);
		// 여기에서 T는 comparator라는 인터페이스가 구현된 클래스 타입이어야 함
		//Arrays.sort(m, Collections.reverseOrder());
		//System.out.println(Arrays.toString(m));
		
		// int[] -> Integer[] 래퍼 클래스 배열로 변환해야 사용 가능
		Integer temp[] = Arrays.stream(m).boxed().toArray(Integer[]::new);
		Arrays.sort(temp, Collections.reverseOrder());
		System.out.println(Arrays.toString(temp));
	}
}
