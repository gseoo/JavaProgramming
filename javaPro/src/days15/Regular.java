package days15;

// [정규직 클래스]
public class Regular extends Employee {
	
	// [Object] 멤버들도 상속
	// [Empolyee]
	// 필드 - name, addr, tel, hiredate
	// 생성자는 상속 x
	// 메소드 - dispEmpInfo(), @toString()
	
	private int basePay; // 기본급

	// 생성자
	public Regular() {
		super();
		System.out.println("> Regular 디폴트 생성자 호출됨");
	}
	
	public Regular(String name, String addr, String tel, String hiredate, int basePay) {
		// The field Employee.name is not visible : 접근 지정자 때문에 발생
		//this.name = name; // X
		//this.setName(name); // O
		super(name, addr, tel, hiredate); // 부모의 생성자 호출해서 상속받은 후 초기화
		this.basePay = basePay;
		System.out.println("> Regular 디폴트 생성자 호출됨");
	}
	

	// getter, setter
	public int getBasePay() {
		return basePay;
	}

	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}

	
	@Override
	public void dispEmpInfo() {
		/*
		super.dispEmpInfo(); // 부모의 멤버들을 가리킬 때의 super
		System.out.printf(", 기본급:%d\n",this.basePay);
		*/
		
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s,"
				+ "기본급:%d\n",this.getName(), this.getAddr(),
				this.getTel(), this.getHiredate(), this.basePay);
	}

	@Override
	public String toString() {
		return super.toString() + String.format(", 기본급:%d\n",this.basePay);
	}
	
	public int getPay() {
		return this.basePay;
	}
	
}
