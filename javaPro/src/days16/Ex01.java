package days16;

public class Ex01 {
	public static void main(String[] args) {
		
		// 업캐스팅 > 추상클래스인 Parent한테
		//Parent p1 = new Child();
		
		// 부모모로, 부모의 부모로도 업캐스팅 가능
		Child c1 = new Descendant(); 
		Parent p1 = new Descendant(); 
	}
}

abstract class Parent {
	abstract void dispA();
	abstract void dispB();	
}


abstract class Child extends Parent {

	// 부모가 추상클래스인데 메소드를 하나만 재정의해도 자식클래스는 여전히 추상클래스여야 함
	@Override
	void dispA() {	
	}
}

class Descendant extends Child {

	@Override
	void dispB() {
		
	}
}


/*
class Child extends Parent {

	@Override
	void dispA() {
	}

	@Override
	void dispB() {
	}
}
*/