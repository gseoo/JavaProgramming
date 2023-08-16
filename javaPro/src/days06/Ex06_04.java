package days06;

public class Ex06_04 {
	public static void main(String[] args) {
		
		/* [1] 가로로 구구단 출력
		for(int dan=2; dan<=9; dan++) {
			for(int i=1; i<=9; i++) {
				System.out.printf("%d*%d=%02d ", dan, i, dan*i);
			}
			System.out.println();
		}
		*/
		
		// 세로로 구구단 출력
		/*
		for(int dan=2; dan<=5; dan++) {
			System.out.printf("   [%d단]\t", dan);
		}
		System.out.println();
		
		for(int i=1; i<=9; i++) {
			for(int dan=2; dan<=5; dan++) {
				System.out.printf("%d*%d=%02d\t", dan, i, dan*i);
			}
			System.out.println();	
		}
		
		
		System.out.println();
		
		
		for(int dan=6; dan<=9;dan++) {
			System.out.printf("   [%d단]\t", dan);
		}
		System.out.println();
		
		for(int i=1; i<=9; i++) {
			for(int dan=6; dan<=9; dan++) {
				System.out.printf("%d*%d=%02d\t", dan, i, dan*i);
			}
			System.out.println();	
		}
		*/
		
		
		// k=1 -->2
		// k=2 -->6
		// 4*k-2
		//반복되는 구문 줄이기
		/*
		for(int k=1; k<=2; k++) {
			for(int dan=4*k-2; dan<=4*k+1; dan++) {
				System.out.printf("   [%d단]\t", dan);
			}
			System.out.println();
			
			for(int i=1; i<=9; i++) {
				for(int dan=4*k-2; dan<=4*k+1; dan++) {
					System.out.printf("%d*%d=%02d\t", dan, i, dan*i);
				}
				System.out.println();	
			}
			System.out.println();
		}
		*/
		
		
		
		// k=1 --> 2 
		// k=2 --> 5
		// k=3 --> 8
		// k*3-1
		/*
		for(int k=1; k<=3; k++) {
			for(int dan=k*3-1; dan<=k*3+1; dan++) {
				if (dan>=10) continue;
				System.out.printf("   [%d단]\t", dan);
			}
			System.out.println();
			
			for(int i=1; i<=9; i++) {
				for(int dan=k*3-1; dan<=k*3+1; dan++) {
					if (dan>=10) continue;
					System.out.printf("%d*%d=%02d\t", dan, i, dan*i);
				}
				System.out.println();	
			}
			System.out.println();
		}
		*/
		
		/*
		for(int k=1; k<=3; k++) {
			for(int dan=k*3-1; dan<=k*3+1&& dan!=10; dan++) {
				System.out.printf("   [%d단]\t", dan);
			}
			System.out.println();
			
			for(int i=1; i<=9; i++) {
				for(int dan=k*3-1; dan<=k*3+1&& dan!=10; dan++) {
					System.out.printf("%d*%d=%02d\t", dan, i, dan*i);
				}
				System.out.println();	
			}
			System.out.println();
		}
		*/
	}
}
