package days15;

/**
 * @author 이경서
 * @date 2023. 8. 2. - 오전 11:15:12
 * @subject 클래스들간의 관계
 * @content 1) has-a 관계
 * 			2) is-a 관계 (상속)
 */
public class Ex02 {
	public static void main(String[] args) {
		
	/*
	[상속]
	- 정의 : 기존의 클래스를 재사용하여 새로운 클래스로 작성하는 것
	- 장점 : 코드 재사용 가능 → 생산성 향상, 유지보수 용이
	- 선언 형식
    	[접근지정자] [기타제어자] class 새클래스명 **extends 슈퍼클래스(기존클래스)** {  }
	- 기존클래스 = 부모클래스, 상위클래스, 슈퍼클래스, 기초클래스
	- 새로운클래스 = 자식크래스, 하위클래스, 서브클래스, 파생클래스
	- 예) Point : 좌표를 관리하는 기능이 구현된 클래스
	 */
	}
}

class Point2D {
	int x;
	int y;
	Point2D() {
	}
	Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point2D{
	int z;
	Point3D(){
	}
	Point3D(int x, int y, int z) {
		//this.x = x;
		//this.y = y;
		super(x, y); // 부모의 생성자 호출
		this.z = z;
	}
}
