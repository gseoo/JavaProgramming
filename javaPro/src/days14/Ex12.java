package days14;

public class Ex12 {
	public static void main(String[] args) {
		
		/*
		[클래스들간의 관계]
		1. has-a 관계
			2개의 클래스 선언
			Car 클래스
			Engine 클래스 - 연료를 이용한 구동장치
			Car has-a Engine
		
		
		2. is-a 관계 (상속)
		 */
		//Engine engine = new Engine(); // 의존성 주입(DI)
		// DI 2가지 방법
		// 1. 생성자를 통해서 DI
		//Car myCar = new Car(engine);
		// 2. setter를 통해서 DI
		Car myCar = new Car();
		//myCar.setEngine(engine); - 이거 쓰려면 engine을 getEngine()으로 바꿔야 함
		
		myCar.speedUp(10);
		int carSpeed = myCar.engine.speed;
		System.out.println(carSpeed);
		
		myCar.speedDown(10);
		carSpeed = myCar.engine.speed;
		System.out.println(carSpeed);
		
		myCar.stop();
		carSpeed = myCar.engine.speed;
		System.out.println(carSpeed);
		
		System.out.println("end");
	}
}
