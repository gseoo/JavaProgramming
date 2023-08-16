package days24;

import java.util.ArrayList;

public class Ex12 {
	public static void main(String[] args) {
		// [와일드 카드]
		
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		FruitBox<Apple> appleBox = new FruitBox<>();
		FruitBox<Grape> grapeBox = new FruitBox<>();
		
		/*
		// 매개변수가 제네릭인 일반 메소드 호출
		Juice juice = Juicer.makeJuice(fruitBox);
		juice = Juicer.makeJuice(appleBox);
		juice = Juicer.makeJuice(grapeBox);
		*/
		
		// makeJuice 메소드를 제네릭 메소드로 선언(수정)
		// 제네릭 메소드 호출 방법은 다름
		Juice juice = Juicer.<Apple>makeJuice(appleBox);
		// <Apple> 생략 가능
		//Juice juice = Juicer.makeJuice(appleBox);
		
		/*
		[제네릭 메소드]
		: 메소드의 선언부에 제네릭 타입이 선언된 메소드
		
		- 형식
		public static <T> Juice makeJuice(FruitBox<T> box) {
		}
		
		*/
	}
}

class Fruit {
	public String toString() {
		return "Fruit";
	}
}

class Apple extends Fruit {
	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit {
	public String toString() {
		return "Grape";
	}
}


class Box05<T> {
	ArrayList<T> list = new ArrayList<T>();

	void add(T item) {
		this.list.add(item);
	}

	int size() {
		return this.list.size();
	}

	T get(int i) {
		return this.list.get(i);
	}

	public String toString() {
		return this.list.toString();
	}
}


class FruitBox<T extends Fruit> extends Box05<T>{
}


// 클래스 선언
// 매개변수로 과일 박스를 주면 주스를 만들어서 반환
class Juice { }

class Juicer {
	// 제네릭 타입의 매개변수는 오버로딩이 성립되지 않음
	// ? == 와일드카드
	// <? extends Fruit> : Fruit 클래스를 상속받은 자식 클래스만 매개변수로 받음
	// <? super Fruit> : Fruit 클래스의 부모 클래스만 매개변수로 받음
	// <?> : 제한 없음, 모든 타입 가능
	
//	static Juice makeJuice(FruitBox< ? extends Fruit> box) {
//		return new Juice();
//	}
	
	// 일반 함수에 매개변수만 제네릭인 것 -> 제네릭 메소드 아님
	// 위 일반 메소드를 제네릭 메소드로 변경
	static <T extends Fruit> Juice makeJuice(FruitBox<T> box) {
		return new Juice();
	}
}