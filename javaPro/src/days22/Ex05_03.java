package days22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Ex05_03 {
	public static void main(String[] args) {
		ArrayList<Person3> list = new ArrayList();
		
		list.add(new Person3("박정호", 23));
		list.add(new Person3("김성준", 21));
		list.add(new Person3("주강민", 29));
		list.add(new Person3("이경서", 20));
		list.add(new Person3("이준희", 30));
		
		System.out.println(list);
		
		list.sort((p1,p2)-> p1.getName().compareTo(p2.getName()));
		
		Iterator ir= list.iterator();
		while (ir.hasNext()) {
			Person3 p = (Person3) ir.next();
			System.out.println(p);
		}
	}
}

class Person3 implements Comparable{
	private String name;
	private int age;
	
	public Person3() {
		super();
	}

	public Person3(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Object o) {
		Person3 p = (Person3)o;
		return this.getName().compareTo(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}