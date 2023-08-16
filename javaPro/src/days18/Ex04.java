package days18;

public class Ex04 {
	public static void main(String[] args) {
		// Object.hashCode() 메소드
		// 해시 : 데이터 관리 기법 중의 하나
		// 데이터 관리 : 데이터 저장, 검색 등
		// hashCode() method : 객체가 저장된 주소값을 해시코드로 변환 -> 변환값을 반환하는 메소드
		
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = new String("홍길동");
		String s4 = new String("홍길동");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
	}
}
