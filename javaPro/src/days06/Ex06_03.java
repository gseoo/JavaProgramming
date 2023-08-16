package days06;

import java.util.Iterator;

public class Ex06_03 {
	public static void main(String[] args) {
		/*
		// [1] 가로로 구구단 출력
		for(int dan=2; dan<=9; dan++) {
			for(int i=1; i<=9; i++) {
				System.out.printf("%d*%d=%02d   ", dan, i, dan*i);
			}
			System.out.println();
		}
		*/
		
		
		// 세로로 구구단 출력
		for(int i=2; i<=9; i++) {
			System.out.printf("   [%d단]\t", i);
		}
		System.out.println();
		
		for(int i=1; i<=9; i++) {
			for(int dan=2; dan<=9; dan++) {
				System.out.printf("%d*%d=%02d\t", dan, i, dan*i);
			}
			System.out.println();	
		}
		
		
//		System.out.println();
//		
//		for(int i=1; i<=9; i++) {
//			for(int dan=6; dan<=9; dan++) {
//				System.out.printf("%d*%d=%02d   ", dan, i, dan*i);
//			}
//			System.out.println();	
//		}
		
	}
}
