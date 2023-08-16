package days07;

public class Ex01 {
	public static void main(String[] args) {
		/*
		// [1] 구구단 가로로 출력
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %02d   ", i, j, i*j);
			}
			System.out.println();
		}
		*/
		
		/*
		// [2] 구구단 세로로 출력
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.printf("%d * %d = %02d   ", j, i, i*j);
			}
			System.out.println();
		}
		*/
		
		/*
		// repeat 함수
		for(int i=1; i<=4; i++) {
			System.out.printf("*".repeat(i) );
			System.out.println();
		}*/
			
		
		
		// [3] 별 찍기
		// 1: __*        i=1  j=2   j=1
		// 2: _***      i=2  j=1   j=3
		// 3: *****    i=3  j=0   j=5
		/*
		for(int i=1; i<=3; i++) { //행 갯수
			for(int j=0; j<3-i; j++) {
				System.out.printf("_");
			}
			for(int j=0; j<2*i-1; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		*/
		
		/*
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=5; j++) {
				if(i+j>=4 && j-i<=2) System.out.printf("*");
				else System.out.printf("_");
			}
			System.out.println();
		}
		*/
		
		// [4]
		// *___   i=1 j=1
		// **__   i=2 j=2
		// ***_   i=3 j=3
		// ****   i=4 j=4
		/*
		for(int i=1; i<=4; i++) {
			for(j=1; j<=4; j++)
				if(i=j) System.out.printf("*");
				else System.out.printf("_");
		}
		*/
		
		
//		****
//		_***
//		__**
//		___*
		/*
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				if(i<=j) System.out.printf("*");
				else System.out.printf("_");
			}
			System.out.println();
		}*/
		
		/*
		// [5] 모래시개
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i+j==6 || i==j) System.out.printf("*");
				else System.out.printf("_");
			}
			System.out.println();
		}
		*/
		
	}
}