package days06;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("영어 이름 >>  ");
			String name = sc.nextLine();
			char[] s = sc.nextLine().toCharArray();
			
			for (char ch : s) {
					System.out.printf("%c", ch);
			}
			
			
			// String to char[]
			char [] nameArr = name.toCharArray();
			
			// char[] to String
			name = String.valueOf(nameArr);
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		} 

	}
}
