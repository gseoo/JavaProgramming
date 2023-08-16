package days15;

// [영업직 클래스] - 최종클래스
// final class : 자식클래스를 가질 수 없는 최종 클래스
public final class SalesMan extends Regular{
	
	// 필드 - name, addr, tel, hiredate, basePay
	// 생성자 x
	// 메소드 - dispEmpInfo(), @toString(), getPay()

	private int sales; // 판매량
	private int comm; //커미션
	
	// 생성자
	public SalesMan() {
		super();
		System.out.println("> SalesMan 디폴트 생성자 호출됨");
	}


	public SalesMan(String name, String addr, String tel, String hiredate, int basePay, int sales, int comm) {
		super(name, addr, tel, hiredate, basePay);
		this.sales = sales;
		this.comm = comm;
		System.out.println("> SalesMan 7 생성자 호출됨");
	}
	
	
	@Override
	public void dispEmpInfo() {
		/*
		super.dispEmpInfo(); // 부모의 멤버들을 가리킬 때의 super
		System.out.printf(", 기본급:%d\n",this.basePay);
		*/
		
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s,"
				+ "기본급:%d, 판매량:%d, 커미션:%d\n",this.getName(), this.getAddr(),
				this.getTel(), this.getHiredate(), this.getBasePay(), this.sales, this.comm);
	}
	
	@Override
	public int getPay() {
		return super.getPay() + this.sales * this.comm;
	}

}




/*
// The type Child cannot subclass the final class SalesMan
class Child extends SalesMan {
}
*/