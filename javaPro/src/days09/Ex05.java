package days09;

import java.util.Arrays;

public class Ex05 {
	public static void main(String[] args) {
		/*
		 * [배열] + 제어문
		 * 1. 자료형
		 * 		기본형(8가지)
		 * 			ㄴ 숫자형
		 * 					ㄴ 정수형
		 * 							ㄴ 문자
		 * 					ㄴ 실수형
		 * 			ㄴ 논리형
		 * 		참조형 - 배열, 클래스, 인터페이스
		 * 
		 * 2. 정의 : 동일한 자료형을 메모리 상에 연속적으로 놓이게 한 것
		 * 
		 * 3. 배열 선언
		 * 	자료형 [] 변수명;
		 * 	예) int [] m;
		 * 		동적영역(heap)								스택영역
		 * 		[4byte][4byte][4byte]				[0x100 주소값]
		 * 		0x100												m
		 * 		배열 생성
		 * 		m = new int[3]
		 * 
		 * 4. 배열 크기 = 배열명.length
		 * 	upperbound (윗첨자값) = 배열명.length-1
		 * 	lowerbound (아랫첨자값) = 0
		 */
		
		int [] kors = new int[3];
		
		/*
		// 100점을 기본값으로 초기화
		for(int i=0; i<kors.length; i++) {
			kors[i] = 100;
		}
		*/
		
		// Arrays 클래스 - 배열을 사용하기 쉽도록 기능이 구현된 클래스
		// 1) Arrays.toString(kors);
		// Arrays.fill(kors, 100); // 100점으로 초기화
		
		
		// java.lang.NullPointerException
		kors = null;
		//가비지 : 동적영역에서 참조되지 않고 메모리만 차지하고 있는 것
		// 가비지 컬렉터 : 가비지를 제거하고 메모리를 확보하는 것
		
				
		dispKors(kors);
		
	}

	private static void dispKors(int[] kors) {
		for(int i=0; i<kors.length; i++) {
			System.out.printf("kors[%d]=%d\n", i, kors[i]);
		}
		
	}
}
