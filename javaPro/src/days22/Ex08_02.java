package days22;

import java.util.Arrays;
import java.util.LinkedList;

public class Ex08_02 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("김호영");
		list.add("이지현");
		list.add("김정주");
		System.out.println(list); // [김호영, 이지현, 김정주]
		
		list.addFirst("유희진");
		System.out.println(list); // [유희진, 김호영, 이지현, 김정주]
		
		list.add(1,"임경재");
		System.out.println(list); // [유희진, 임경재, 김호영, 이지현, 김정주]
		
		System.out.println(list.size()); // 5
		
		System.out.println(list.contains("김동현")); // false
		System.out.println(list.indexOf("김동현")); // -1
		System.out.println(list.lastIndexOf("김동현")); // -1
		
		if(list.contains("김정주"))
			list.set(list.indexOf("김정주"), "고경림"); 
		System.out.println(list); // [유희진, 임경재, 김호영, 이지현, 고경림]
		
		/*
		      [비교]      [읽기 속도]   [추가/삭제 속도]   		[비고]
		 1. ArrayList  	   빠름			느림			순차적인 추가, 삭제 빠름
		 2. LinkedList     느림			빠름			데이터가 많을수록 접근성 떨어짐
		 */
		
		
	}
}
