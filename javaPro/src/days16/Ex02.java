package days16;

import days15.Employee;
import days15.Regular;
import days15.SalesMan;
import days15.Temp;

public class Ex02 {
	public static void main(String[] args) {
		Regular e1 = new Regular();
		dispGetPay(e1);
		SalesMan e2 = new SalesMan();
		dispGetPay(e2);
		Temp e3 = new Temp();
		dispGetPay(e3);
	}

	private static void dispGetPay(Employee emp) {
		
		// instanceof
		// emp가 Regular, SalesMan, Temp 중 어떤 인스턴스의 객체인지 확인하는 연산자
		
		// 자식 클래스 먼저 체크하고 부모 클래스 확인 -> if ~ else if 구문으로
		if(emp instanceof SalesMan){
			System.out.println("> emp 객체는 SalesMan 타입");
			SalesMan s1 = (SalesMan)emp;
		}
		
		else if(emp instanceof Regular){
			System.out.println("> emp 객체는 Regular 타입");
			Regular r1 = (Regular)emp;
		}
		
		else if(emp instanceof Temp){
			System.out.println("> emp 객체는 Temp 타입");  
		}
		
	}
}
