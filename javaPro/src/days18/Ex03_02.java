package days18;

// 시험 - 라인 단위 설명
// 어노테이션 설명, 오버라이딩 의미, 조건, if 조건식, 업캐스팅, 다운캐스팅, return문
public class Ex03_02 {
	public static void main(String[] args) {
		// 주민등록번호가 같으면 동일한 사람(객체)로 인식
		Person p1 = new Person("111", "홍길동");
		Person p2 = new Person("111", "홍길둥");
		
		// 3) Object.toString() -> 패키지명.클래스명@해시코드의 16진수값
		System.out.println(p1.toString());
		System.out.println(p2);
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println(p1.equals(p2)); // 
		
		// object에서 물려받은 equals 메소드를 오버라이딩 해야 함
		

		
	}
}

class Person implements Cloneable{
	
	// toString 함수 오버라이딩
	@Override
	public String toString() {
		return String.format("Person [rrn=%s, name=%s]",this.rrn, this.name);
	}

	String rrn;
	String name;
	
	public Person(String rrn, String name) {
		super();
		this.rrn = rrn;
		this.name = name;
	}

	// p1.equals(p2) : 업캐스팅, 매개변수 다형성/ p1 = this, p2 = obj
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person) {
			Person p = (Person)obj; // 다운캐스팅
			return this.rrn.equals(p.rrn);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.rrn.hashCode();
	}

	/*
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = null;
		obj = super.clone();
		return obj;
		//return super.clone(); 위 세 줄 합친 코딩
	}
	*/

	// 오버라이딩 조건에 안 맞음 - Person이 아니라 Object여야 함
	// JDK1.5 공변변환타입(convariant return type) 추가
	// 오버라이딩 할 때 부모메소드의 반환타입을 자식클래스 타입으로 변경 가능
	@Override
	protected Person clone() {
		Person p = null;
		try {
			p = (Person) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
	
	
}