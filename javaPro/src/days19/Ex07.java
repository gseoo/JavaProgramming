package days19;

public class Ex07 {
	public static void main(String[] args) {
		// [오토박싱(boxing)]과 [오토언박싱(unboxing)]
		
		int i = 100; // 변수
		Integer j = i; // Integer라고 하는 클래스의 객체 j
		// 기본형 i가 객체 j로 바뀜 -> 오토박싱(기본형->클래스 타입의 객체)
		
		int k = j; // 객체 -> 기본형 변환 > 오토언박싱
		
		test(i); // int 기본
		test(j); // Integer 클래스
		
		// int -> Integer 박싱 -> Object 업캐스팅
		
	}
	/*
	private static void test(int i) { // Integer -> int 형변환 > 오토언박싱
		System.out.println(i);
	}
	*/
	
	// Object : 모든 자료형을 매개변수로 받을 수 있음
	// Object는 모든 자료형의 부모라서 업캐스팅 가능
	private static void test(Object i) { 
		System.out.println(i);
	}
}
