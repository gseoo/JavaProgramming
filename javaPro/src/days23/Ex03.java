package days23;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		// Set 인터페이스를 구현한 LinkedHashSet 컬렉션 클래스
		//   ㄴ 순서 유지 O, 중복 허용 X
		
		// 사람은 주민등록번호가 같으면 같은 객체 -> 중복 X
		Set<Person> s = new LinkedHashSet<Person>();
		s.add(new Person("111111-1111111", "김호영", 23));
		s.add(new Person("222222-2222222", "박민석", 25));
		s.add(new Person("333333-3333333", "박정호", 28));
		
		System.out.println(s.size()); // 3
		
		s.add(new Person("222222-2222222", "박민석", 35));
		
		Iterator<Person> ir = s.iterator();
		while (ir.hasNext()) {
			Person p = ir.next();
			System.out.println(p); // 오버라이딩 한 .toString 생략
		}
	}
}

class Person {
	String rrn;
	String name;
	int age;
	
	public Person() {
		super();
	}
	
	public Person(String rrn, String name, int age) {
		super();
		this.rrn = rrn;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [rrn=" + rrn + ", name=" + name + ", age=" + age + "]";
	}

	// 중복된 주민번호 거르기 hashCode(), equals() 오버라이딩
	@Override
	public int hashCode() {
		return this.rrn.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			return this.rrn.equals(p.rrn);
		}
		return false;
	}
}