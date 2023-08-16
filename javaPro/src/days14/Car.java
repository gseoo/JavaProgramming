package days14;

public class Car {

	// 필드
	String name;
	String gearType; // 수동 or 자동
	int door;
	// 엔진 필요
	Engine engine = null;
	
	// 결합력이 높은 코딩 -> 나쁜 코딩
	//Engine engine = new Engine(); // 명시적 초기화
	
//	public Engine getEngine() {
//		return engine;
//	}
//
//	public void setEngine(Engine engine) {
//		this.engine = engine;
//	}

	{
		//this.engine = new Engine(); // 인스턴스 초기화
	}
	
	// 생성자
	Car() {
		// this.engine = new Engine(); // 생성자 초기화
	}
	
	public Car(Engine engine) {
		this.engine = engine;
	}

	// 메소드
	void speedUp(int fuel) {
		this.engine.moreFuel(fuel);
	}
	
	void speedDown(int fuel) {
		this.engine.lessFuel(fuel);
	}
	
	void stop() {
		this.engine.stop();
	}
}
