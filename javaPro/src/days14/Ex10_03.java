package days14;

/**
 * @author 이경서
 * @date 2023. 8. 1. - 오후 3:45:05
 * @subject [초기화 블럭]
 * @content	1. 인스턴스 초기화 블럭
 * 			2. 클래스 초기화 블럭
 */
public class Ex10_03 {
	public static void main(String[] args) {

		Member m1 = new Member();
		System.out.println(m1.name);
		System.out.println(m1.count);
		
		Member m2 = new Member();
	}
}

class Member {
	//[필드]
	// 1. 인스턴스 변수
	String name = "익명";
	int age = 20;
	int count;
	int serialNo;
	// 2. 클래스 변수
	static double rate = 0.05;


	// [클래스 초기화 블럭]
	// 프로그램 시작할 때 한 번 호출됨
	static {
		// 일괄적으로 static 변수가 있다면 초기화하는 데 사용
		rate = 0.08;
		System.out.println("> static 초기화 블럭 호출");
	}

	// 인스턴스 초기화 블럭
	// 오버로딩된 생성자에서 반복되는 코딩이 있으면 여기로 뺌
	{
		count++;
		serialNo = count;	
		System.out.println("> 인스턴스 초기화 블럭 호출");
	}
	
	public Member() {
//		count++;
//		serialNo = count;
		
		name = "무명";
		System.out.println("> Member 디폴트 생성자 호출됨");
	}

	public Member(String name) {
//		count++;
//		serialNo = count;
		
		this.name = name;
		System.out.println("> Member 1 생성자 호출됨");
	}
}
