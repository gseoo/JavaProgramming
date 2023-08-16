package days18;

import java.util.Arrays;

public class Ex08_03 {
	public static void main(String[] args) {
		
		String s = "안녕하세요. 입니다. 입니다. 입니다.";
		String name = "홍길동";
		
		// 첫 번째 입니다를 찾아서 그 앞에 홍길동 붙이기
		/*
		//int index = s.indexOf('입');
		int index = s.indexOf("입니다");
		System.out.println(index);
		s = s.substring(0,index) + name + s.substring(index);
		System.out.println(s);
		*/
		
		/*
		// [문제]
		// 마지막 "입니다"를 찾아서 그 앞에 홍길동 붙이기
		int index = s.lastIndexOf("입니다");
		System.out.println(index);
		s = s.substring(0,index) + name + s.substring(index);
		System.out.println(s);
		*/
		
		/*
		// 두 번째 입니다 앞에 홍길동 넣기
		int index = s.indexOf("입니다");
		System.out.println(index);
		int mindex = s.indexOf("입니다", index+"입니다".length());
		System.out.println(mindex);
		s = s.substring(0,mindex) + name + s.substring(mindex);
		System.out.println(s);
		*/

		
		int fromIndex = 0;
		int index = -1;
		while((index = s.indexOf("입니다", fromIndex)) != -1) {
			System.out.println(index); 
			fromIndex = index + "입니다".length();
		}
		
		
		
		/*
		System.out.println("abc".toUpperCase());
		System.out.println("ABC".toLowerCase());
		
		String str[] = "홍길동,김길동,이길동,박길동".split(",", 2);
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		*/
	}
}
