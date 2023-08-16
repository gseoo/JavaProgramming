package days22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex06 {
	public static void main(String[] args) {
		// List - ArrayList 컬렉션 클래스
		
		// String [] -> ArrayList 변환
		String nameArr[] = {"송해영", "유희진", "임경재", "정하영"};
		/*
		// [1] 로직대로
		ArrayList list = new ArrayList();
		for (int i = 0; i < nameArr.length; i++) {
			list.add(nameArr[i]);
		} // for
		System.out.println(list);
		*/
		
		// [2] Type == 클래스
		//List<T> list = Arrays.asList(T...a);
		List list = Arrays.asList(nameArr);
		System.out.println(list);
		
		// List 말고 ArrayList에 담기
		ArrayList list2 = new ArrayList(list); // 매개변수 다형성(List가 ArrayList의 부모 클래스)
		System.out.println(list2);
	}
}
