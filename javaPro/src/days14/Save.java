package days14;

// 저축 관련 기능이 구현된 클래스
public class Save {

	// 필드
	private String name = null; // 예금주
	private int money = 0; // 예금액
	
	// static : 인스턴스가 생성될 때마다 필드가 생성되지 않음
	// 클래스가 선언될 때 메소드 영역에 필드 생성
	// -> 객체를 생성하지 않아도 static 필드는 이미 생성돼 있음
	// 모든 객체가 공유하는 필드가 됨 -> 공유변수(필드), shared 변수, static 변수, 정적변수, 클래스 변수
	private static double rate = 0/04; // 이자율
	
	// 생성자
	public Save() {
		
	}

	public Save(String name, int money, double rate) {
		this.name = name;
		this.money = money;
		this.rate = rate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// 인스턴스 메소드
	// static 메소드, 정적 메소드
	public static double getRate() {
		return rate;
	}

	// Cannot use this in a static context
	// 1. static이 붙어 있는 곳 안에서는 this를 사용할 수 없음
	public static void setRate(double rate) {
		// 3. 지역변수 사용 x
		
		
		// 2. 인스턴스 변수 사용 x
		// Cannot make a static reference to the non-static field name
		//name = "홍길동";
		
		// this.rate = rate;

		// The assignment to variable rate has no effect
		Save.rate = rate;
	}
	
	// 예금 정보 출력하는 메소드
	public void dispSave() {
		System.out.printf("> 예금주 : %s\t예금액 : %d\t이자율 : %.2f\n",
				this.name, this.money, this.rate);
	}
}
