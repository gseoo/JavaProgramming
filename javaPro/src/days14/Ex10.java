package days14;

/**
 * @author 이경서
 * @date 2023. 8. 1. - 오후 3:21:28
 * @subject 변수 초기화
 * @content 1) 지역변수  2) 인스턴스 변수  3) 클래스 변수
 * 
 * 			1. 변수 초기화 : 변수를 선언하고 처음으로 값을 할당하는 것
 * 			2. 지역변수는 반드시 초기화해야 사용 가능
 * 			3. 인스턴스 변수, 클래스 변수는 초기화하지 않으면 각 자료형의 기본값으로 초기화됨
 * 
 *			double - 0.0(0.0D)
 *			int, byte, short - 0
 *			long - 0L
 *			float = 0.0F
 *
 *			String(클래스) == 참조형 - null
 *
 *			char - '\u0000\
 *			boolean - false
 */
public class Ex10 {
	
	double avg; // 인스턴스 변수
	static double rate; // 클래스 변수
	
	public static void main(String[] args) {
		
		// 지역변수
		String name = "홍길동";
		
		// Cannot make a static reference to the non-static field name
		System.out.println(name); // 홍길동
		
		System.out.println(Ex10.rate); // 0.0
		
		Ex10 obj = new Ex10(); // 객체를 생성해야지만 사용 가능
		System.out.println(obj.avg); // 0.0
	}
}
