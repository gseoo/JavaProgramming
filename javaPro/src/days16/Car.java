package days16;

public class Car {

	// 필드
	String name;
	String gearType; // 수동 or 자동
	int door;

	Engine engine = null;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}


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
