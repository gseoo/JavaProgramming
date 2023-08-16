package days18;

public class Ex06 {
	public static void main(String[] args) {
		// Object.clone() - 복제하는 메소드
		Person p1 = new Person("111", "홍길동");
		Person p1Clone;
		
		p1Clone = p1.clone();
		System.out.println(p1Clone);
		
		/*
		try {
			p1Clone = (Person) p1.clone(); // 다운캐스팅
			System.out.println(p1Clone);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} 
		*/
		
//		p1.notify();
//		p1.notifyAll();
//		p1.wait();
//		p1.wait(0);
//		p1.wait(0, 0);
		
	}
}
