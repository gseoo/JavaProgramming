package days03;
/**
 * 
 * @author 이경서
 * @date 2023. 7. 17. - 오후 12:28:17
 * @subject 산술 연산자
 * @content 산술 연산자 중에 / % 주의(기억)!!
 * 				정수 / 0 --> 산술적 예외
 * 				실수 / 0 --> Infinity 무한대
 * 				정수 % 0 -- > 산술적 예외
 * 				실수 % 0 --> NaN
 */
public class Ex05_02 {
	public static void main(String[] args) {

		int i = 10, j = 3;
		System.out.println(i + j);  // 13
		System.out.println(i - j);  // 7
		System.out.println(i * j);  // 30
		System.out.println(i / j);  // 3 --> 몫, 정수 부분
		System.out.println(i % j);  // 1 --> 나머지
		
		//System.out.println((double)i / j);  // 3.3333333333333335
		
		
		// java.lang.ArithmeticException: / by zero : 0으로 나눠서 산술적 예외가 발생함
		//System.out.println(10/0);
		System.out.println(10.0/0); // Infinity

		
		// java.lang.ArithmeticException: / by zero
		//System.out.println(10%0);
		System.out.println(10.0%0); // NaN --> Not a Number : 상수값
		
	}

}
