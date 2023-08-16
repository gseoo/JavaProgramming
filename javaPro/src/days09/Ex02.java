package days09;

import java.util.Arrays;

public class Ex02 {
	static int m[]= new int[32];
	public static void main(String[] args) {
		
		int n =10;
		int share; // 몫
		int reminder; // 나머지
		String s = "";
		int [] binaryArr = new int[32];
		int index = binaryArr.length - 1;
		
		while (n>0) {
			share = n/2; 
			reminder = n%2; 
			binaryArr[index--] = reminder;
			s += reminder;
			n = share;
		}
		System.out.println(Arrays.toString(binaryArr).replace(", ", ""));
		
		/*
		// String, StringBuilder, StringBuffer -> 문자열 다루는 클래스
		StringBuilder sb = new StringBuilder();
		sb.reverse();
		 */

		//System.out.printf("%032d", Integer.parseInt());

	}

}
