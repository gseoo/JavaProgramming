package days03;

/**
 * 
 * @author 이경서
 * @date 2023. 7. 17. - 오후 2:27:06
 * @subject 단항연산자 --> 우선순위 제일 높음
 * @content	++  --  +  -  ~(비트부정연산자)  !  (cast) etc...
 * 				
 */

public class Ex05_05 {
	public static void main(String[] args) {
	
		System.out.println(+3); // 양수 (단항연산자)
		System.out.println(-3); // 음수 (단항연산자)
		
		// 비트 부정(틸드) 연산자 0-->1, 1-->0
		System.out.println(~5); // -6
		//    5 = 0000 0101
		// ~5 = 1111 1010 = -6
		// 2의 보수법 거꾸로
		// 1111 1010 - 1 = 1111 1001 >> 1을 뺀다
		// 1111 1001 --> 0000 0110 = |6| = -6 >> 보수를 취하고 절댓값 풀어줌
		
	}

}
