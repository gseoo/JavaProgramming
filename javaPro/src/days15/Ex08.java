package days15;

public class Ex08 {
	public static void main(String[] args) {
		
		/*
		// [1]
		Employee emp1 = new Employee("이준희", "서울 강남구", "010-1234-1234", "2022.12.12");
		emp1.dispEmpInfo();
		
		//object.toString() -> 오버라이딩하기(재정의)
		System.out.println(emp1.toString());
		System.out.println(emp1); // 둘이 같음
		*/
		
		// [is-a 관계 (상속)]
		// 정규직은 사원이다. O
		
		/*
		// [2]
		Regular emp2 = new Regular("주강민", "서울 양천구", "010-3123-2311", "2021.03.21", 4000000);
		// 기본급은 출력 안 됨
		emp2.dispEmpInfo();
		System.out.println(emp2); // @toString
		*/
		
		/*
		// [3]
		// Employee = Regular 클래스들간의 자동 형변환 -> 조건 : 상속 관계
		// 부모클래스 emp2 = new 자식클래스
		// [업캐스팅] : 상속관계가 있는 클래스들간의 형변환/ 자식 객체를 생성해서 부모 객체에 참조시킴
		// [이상한 점] 기본급:4000000 출력
		// Employee 클래스의 dispEmpInfo()가 아니라 실제 생성된 Regular 객체의 dispEmpInfo() 메소드 호출
		Employee emp2 = new Regular("주강민", "서울 양천구", "010-3123-2311", "2021.03.21", 4000000);
		emp2.dispEmpInfo();
		//System.out.println(emp2); // @toString 
		
		// [업캐스팅 문제점] : Regular(자식클래스)에 있는 메소드 사용 불가
		// emp2.getPay();
		
		// [다운캐스팅] : 부모 객체를 자식 객체에 참조시킴/ (cast)연산자를 사용해서 강제형변환
		Regular emp = (Regular) emp2;
		
		
		// Type mismatch: cannot convert from Employee to Regular
		// 클래스들간의 형변환에도 (cast)연산자 사용
		// java.lang.ClassCastException
		// 자식 -> 부모 -> 자식 : 가능/ 부모 -> 자식 : 불가능
		//  업캐스팅->다운캐스팅          다운캐스팅
		//Regular emp2 = (Regular) new Employee("이준희", "서울 강남구", "010-1234-1234", "2022.12.12");
		*/
		
		
		/*
		// [4]
		// 참조 : SaleMan -> Regular -> Employee(오류)
		SalesMan emp3 = new SalesMan("임경재", "경기도 성남시", "010-9837-2342", "2021.03.12", 500000, 20, 70000);
		emp3.dispEmpInfo();
		System.out.println(emp3.getPay());
		*/
		
		
		// [5]
		Employee emp4 = new Temp("박정호", "서울 목동", "010-2319-3422", "2020.01.01", 20, 250000);
		emp4.dispEmpInfo();
		System.out.println(emp4.getPay()); // 함수 없음
		
		
	}
}
