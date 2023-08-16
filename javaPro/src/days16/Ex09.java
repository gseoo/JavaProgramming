package days16;

/**
 * @author 이경서
 * @date 2023. 8. 3. - 오후 2:10:34
 * @subject [인터페이스]의 장점
 * @content	
 */
public class Ex09 {
	
	public static void main(String[] args) {
		/*
		 [인터페이스의 장점]
		 1. 개발 시간을 단축시킬 수 있다.
		 	-> 인터페이스를 구현한 클래스가 없어도 개발을 진행할 수 있음
		 	ex) has-a 관계의 Car, Engine 클래스
		 		Engine 클래스 구현이 안 돼도 Car 클래스에서 구현할 수 있음
		 		Engine 인터페이스 구현 클래스 : H_Engine, K_Engine
		 */
		
		/*
		// 인터페이스 매개변수 다형성
		Engine engine = new K_Engine2();
		Engine engine = new H_Engine();
		Car myacar = new Car(engine);
		*/
		
		
		/*
		 2. 표준화 가능
		 	Engine 인터페이스를 구현해서 클래스를 만들었다면 누가 만들든지
		 	표준화되어져 있을 것
		 	
		 3. 서로 상속관계가 아닌 클래스들에게 인터페이스로 관계를 맺어줄 수 있음
		 	왜 맺어주나? 
		 	
		 4. 독립적인 프로그래밍이 가능
		 
		 */
		
	}
	
}
