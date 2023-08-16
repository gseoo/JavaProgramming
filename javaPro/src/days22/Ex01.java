package days22;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex01 {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		String s1 = dt.toString();
		String pattern = "yyyy/MM/dd E요일   hh:mm:ss.SSS";
		
		DateTimeFormatter sdf = DateTimeFormatter.ofPattern(pattern);
		System.out.println(sdf.format(dt));
	}
}

//class Person {
//	String name;
//	int age;
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	public Person(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}
//	
//	
//	
//}