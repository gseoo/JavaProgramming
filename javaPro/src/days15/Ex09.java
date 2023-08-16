package days15;

public class Ex09 {
	public static void main(String[] args) {
		/*
		1) 문제점
			E e1 = new S();
			E e1 = new R();
			E e1 = new T();
			e.getPay(); <- 오류 : Employee 안에 이 함수가 없어서
			
			왜 Employee 클래스 안에 getPay() 메소드를 선언하지 않았는지?
			
			Employee 클래스에 getPay(); 추가
		*/
		
		
		/*
		 [다형성]
		 : 여러가지 형태를 가질 수 있는 능력
		 
		 ex)
		 E e1 = new R();
		 E e2 = new S();
		 E e3 = new T();
		 
		 */
		
		/*
		// Cannot instantiate the type Employee : Employee를 인스턴스화할(객체 생성할) 수 없음 
		// 왜? 추상클래스이기 때문에 (객체 생성할 수 없음)
		//Employee emp1 = new Employee("이준희", "서울 강남구", "010-1234-1234", "2022.12.12");
		
		Regular emp2 = new Regular("주강민", "서울 양천구", "010-3123-2311", "2021.03.21", 4000000);
		
		SalesMan emp3 = new SalesMan("임경재", "경기도 성남시", "010-9837-2342", "2021.03.12", 500000, 20, 70000);
		
		Temp emp4 = new Temp("박정호", "서울 목동", "010-2319-3422", "2020.01.01", 20, 250000);
		
		emp1.getPay();
		emp2.getPay();
		emp3.getPay();
		*/
		
		
		/*
		Employee [] emps = new Employee[3];
		// 업캐스팅(자동형변환)
		emps[0] = new Regular("주강민", "서울 양천구", "010-3123-2311", "2021.03.21", 4000000);
		emps[1] = new SalesMan("임경재", "경기도 성남시", "010-9837-2342", "2021.03.12", 500000, 20, 70000);
		emps[2] = new Temp("박정호", "서울 목동", "010-2319-3422", "2020.01.01", 20, 250000);
		*/
		
		Employee[] emps = {
				new Regular("주강민", "서울 양천구", "010-3123-2311", "2021.03.21", 4000000),
				new SalesMan("임경재", "경기도 성남시", "010-9837-2342", "2021.03.12", 500000, 20, 70000),
				new Temp("박정호", "서울 목동", "010-2319-3422", "2020.01.01", 20, 250000)
		};
		
		for(int i=0; i<emps.length; i++) {
			emps[i].getPay();
		}
	}
	
}
