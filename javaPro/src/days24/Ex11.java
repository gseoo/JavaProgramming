package days24;

import java.util.ArrayList;

public class Ex11 {
	public static void main(String[] args) {
//		// [제한된 제네릭 클래스]
//		// T 모든 타입이 아니라 과일 타입만 제한해서 제네릭 클래스 사용하려면?
//		FruitBox<Apple> box1 = new FruitBox<Apple>();
//		//FruitBox<Toy> box2 = new FruitBox<Toy>();
	}
}

//interface Eatable { }
//
//class Fruit implements Eatable {
//	public String toString() {
//		return "Fruit";
//	}
//}
//
//class Apple extends Fruit {
//	public String toString() {
//		return "Apple";
//	}
//}
//
//class Grape extends Fruit {
//	public String toString() {
//		return "Grape";
//	}
//}
//
//class Toy {
//	public String toString() {
//		return "Toy";
//	}
//}
//
//// Box04 제네릭 클래스 선언
//class Box4<T> {
//	ArrayList<T> list = new ArrayList<T>();
//
//	void add(T item) {
//		this.list.add(item);
//	}
//
//	int size() {
//		return this.list.size();
//	}
//
//	T get(int i) {
//		return this.list.get(i);
//	}
//
//	public String toString() {
//		return this.list.toString();
//	}
//}
//
//// 과일만 담을 수 있는 제네릭 클래스로 제한해서 선언
////class FruitBox<T extends Fruit> extends Box4<T>{
//
//// Fruit 클래스의 자식클래스이고 Eatable 인터페이스도 구현
//class FruitBox<T extends Fruit & Eatable> extends Box4<T>{
//	
//}

