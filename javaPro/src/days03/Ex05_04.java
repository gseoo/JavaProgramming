package days03;
/**
 * @author 이경서
 * @date 2023. 7. 17. - 오후 2:02:00
 * @subject 논리 연산자
 * @content 참/거짓 boolean
 * 				1) 일반 논리 연산자
 * 					ㄱ. && 일반 논리 AND 연산자 (둘 다 참이면 참) > 논리곱
 * 						참 && 참 --> 참
 * 						참 && 거짓 --> 거짓
 * 						거짓 && 참 --> 거짓
 * 						거짓 && 거짓 --> 거짓
 * 
 * 					ㄴ. || 일반 논리 OR 연산자 (둘 다 거짓이면 거짓) > 논리합
 * 						참 || 참 --> 참
 * 						참 || 거짓 --> 참
 * 						거짓 || 참 --> 참
 * 						거짓 || 거짓 --> 거짓
 * 
 * 					ㄷ. !  부정(NOT) 연산자
 * 						!참 --> 거짓
 * 						!거짓 --> 참
 * 
 * 				2) 비트 논리 연산자 : &  ^  |  ~
 */
public class Ex05_04 {
	public static void main(String[] args) {
		
		// 연산자 우선 순위
		// 산술 > 비교 > 논리 > 대입
		System.out.println(3 <= 5 && 10 > 1); // true
		System.out.println(3 <= 5 && 10 < 1); // false
		System.out.println(3 >= 5 && 10 < 1); // false
		System.out.println(3 >= 5 && 10 < 1); // false
		
		//Dead code : 
		// AND 연산자에서 앞이 거짓이면 뒤에가 참이든 거짓이든 결과는 똑같음
		// OR 연산자에서 앞이 참이니까 뒤에가 참이든 거짓이든 결과는 똑같음
		
		System.out.println(3 <= 5 || 10 > 1); // true
		System.out.println(3 <= 5 || 10 < 1); // true
		System.out.println(3 >= 5 || 10 < 1); // false
		System.out.println(3 >= 5 || 10 < 1); // false
		
		// System.out.println(!3 <= 5);
		//The operator ! is undefined for the argument type(s) int
		// ! 부정 연산자는 int 피연산자에 사용할 수 없음
		// !은 boolean 앞에만 올 수 있음
		// ! 부정 연산자는 단항 연산자로 어떤 연산자보다 우선 순위가 높음
		System.out.println(!(3 <= 5));
	}

}
