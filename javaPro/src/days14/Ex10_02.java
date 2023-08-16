package days14;

public class Ex10_02 {
	
	// [필드]
	// 인스턴스 변수
	String name;
	int age;
	boolean gender;
	// 클래스 변수
	static double rate;
	
	Ex10_02() {
		this.name = "홍길동";
		this.age = 10;
		this.gender = false;
		this.rate = 0.01;
	}
	
	
	{
		//인스턴스 초기화 블럭
		// 오버로딩된 생성자에서 중복되는 초기화 코딩이 있다면 
		// 중복 초기화 코딩을 인스턴스 초기화 블럭으로 따로 선언할 때 사용하는 블럭
	}
	
	static {
		// 클래스 초기화 블럭 - 클래스 변수 초기화
		// 객체 생성과 상관없이 프로그램이 시작할 때 한 번 static 초기화 블럭이 실행
	}
	
	public static void main(String[] args) {
		
		/*
		 <필드(멤버변수) 초기화 방법>
		 1. 명시적 초기화 : 선언 뒤에 초기값을 주는 작업
		 	String name = "홍길동";
			int age = 20;
			boolean gender = true;
			static double rate = 0.05;
			
		 2. 생성자 초기화
		 	Ex10_02() {
				this.name = "홍길동";
				this.age = 10;
				this.gender = false;
				this.rate = 0.01;
			}
			
		 3. 초기화 블럭
		 	1) 인스턴스 초기화 블럭 - 인스턴스 변수 초기화
		 	2) 클래스 초기화 블럭 - 클래스 변수 초기화
		 
		 <초기화 순서>
		 명시적 초기화
		 -> 클래스 초기화 	(객체 생성될 때 1번 초기화)
		 -> 인스턴스 초기화 (객체 생성될 때마다 초기화)
		 	  ㄴ 생성자의 중복되는 코딩들을 초기화 블럭으로 만듦
		 -> 생성자 초기화	(객체 생성될 때마다 초기화)
		 */
	}
}
