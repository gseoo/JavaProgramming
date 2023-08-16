package days15;

// [사원 클래스]
// 모든 사원들이 공통적으로 가져야 할 멤버(필드, 메소드)를 구현한 클래스
// 추상메소드가 1개라도 있다면 불완전한 클래스 = 추상클래스 -> 객체를 생성할 수 없음
public abstract class Employee {
	
	// 필드
	private String name; // 사원명
	private String addr; // 사원 주소
	private String tel; // 연락처
	private String hiredate; // 입사일자
	
	
	// 생성자
	public Employee() {
		System.out.println("> Employee 디폴트 생성자 호출됨");
	}

	public Employee(String name, String addr, String tel, String hiredate) {
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.hiredate = hiredate;
		System.out.println("> Employee 4 생성자 호출됨");
	}
	
	
	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	
	
	// 메소드
	// 사원들의 정보를 출력하는 메소드
	public void dispEmpInfo() {
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s\n",
				this.name, this.addr, this.tel, this.hiredate);
	}

	@Override
	public String toString() {
		
		return String.format("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s\n",
				this.name, this.addr, this.tel, this.hiredate);
	}
	
	/*
	public int getPay() {
		return 0; // 기능은 하지 않지만 함수를 만듦 -> 물려받는 자식이 오버라이딩해서 사용해라
	}
	*/
	
	// This method requires a body instead of a semicolon : 세미콜론 대신에 함수 바디가 필요함
	// body가 구현이 안 된 불완전한 메소드 = 추상메소드 = abstract 키워드 붙이기
	public abstract int getPay();
	

}
