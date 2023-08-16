package days19;

public class Ex05 {
	public static void main(String[] args) {
		// [Math 클래스]
		// 수학 관련된 static 메소드
		// static 필드 2개
		System.out.println(Math.PI); // 3.141592653589793
		System.out.println(Math.E); // 2.718281828459045

		System.out.println(Math.random()); // 0.2075173734505893
		System.out.println(Math.max(2, 4)); // 4
		System.out.println(Math.min(2, 4)); // 2
		System.out.println(Math.pow(2, 3)); // 8.0
		System.out.println(Math.abs(-100)); // 100
		System.out.println(Math.sqrt(4)); // 2.0

		// 소수점 첫 번째 자리에서 올림
		System.out.println(Math.ceil(2.179)); // 3.0 double
		System.out.println(Math.ceil(2.579)); // 3.0 double
		System.out.println(Math.ceil(2.979)); // 3.0 double
		System.out.println(Math.ceil(2.0)); // 2.0 double

		// 내림(절삭)
		System.out.println(Math.floor(2.179)); // 2.0 double
		System.out.println(Math.floor(2.579)); // 2.0 double
		System.out.println(Math.floor(2.979)); // 2.0 double
		
		// 반올림
		System.out.println(Math.round(2.179)); // 2
		System.out.println(Math.round(2.579)); // 3
		System.out.println(Math.round(2.979)); // 3
		
		// Math 클래스 : 최대 성능을 얻기 위해서 JVM이 설치된 OS의 메소드를 호출해서 처리
		// 문제점 : OS가 다르면 결과가 달라짐
		
		// StrictMath 클래스 : 성능은 포기하더라도 OS마다 동일한 결과값을 나오게 하기 위해 사용

	}
}
