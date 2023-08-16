package days14;

public class Person {

	// 필드
	private String name;
	private int age;
	private boolean gender;

	// [Alt + Shift + S] context menu
	
	public Person() {
		// 디폴트 생성자
	}
	
	public Person(boolean b) {
		gender = b;
	}

	// getter, setter 선언
	public void setAge(int n) {
		if(n>=0 && n<=130) {
			age = n;
		} else {
			// 강제로 예외를 발생
			// [예외처리] throw문 - 강제로 예외를 던짐
			throw new RuntimeException("Person.age 0~130 실행 오류!!!");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// setGender를 지우면 이 필드를 읽기 전용으로 사용하겠다는 의도
	public boolean isGender() {
		return gender;
	}

//	public void setGender(boolean gender) {
//		this.gender = gender;
//	}

	public int getAge() {
		return age;
	}
}
