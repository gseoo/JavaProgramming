package days06;

public class Ex08 {
	public static void main(String[] args) {
		// ****
		// ****
		// ****
		// ****
		/*
		//[1] 
		for(int i=1; i<=4; i++) {           // 줄
			for(int j=0;j<i; j++) {     // 별 갯수
				System.out.printf("*");
			}
			System.out.println();
		}
		 */

		/*
		//[2] 
		for(int i=4; i>=1; i--) {           // 줄
			for(int j=1; j<=i; j++) {     // 별 갯수
				System.out.printf("*");
			}
			System.out.println();
		}
		 */

		/*
		//[3] 
		for(int i=1; i<=4; i++) {  
			for(int k=0; k<4-i; k++) {
				System.out.printf("_");
			}
			for(int j=0;j<i; j++) {  
				System.out.printf("*");
			}
			System.out.println();
		}
		 */

		/*
		//[4]
		for(int i=4; i>=1; i--) {           // 줄
			for(int k=0; k<4-i; k++) {
				System.out.printf("_");
			}
			for(int j=1; j<=i; j++) {     // 별 갯수
				System.out.printf("*");
			}
			System.out.println();
		}
		 */

		/*
		// [5]
		for(int i=1; i<=3; i++) {  
			for(int k=0; k<3-i; k++) {
				System.out.printf("_");
			}

			for(int j=0;j<2*i-1; j++) {  
				System.out.printf("*");

			}
			for(int k=0; k<3-i; k++) {
				System.out.printf("_");
			}
			System.out.println();
		}
		 */


		/*
		//[6] 
		for(int i=1; i<=3; i++) {  
			for(int k=0; k<3-i; k++) {
				System.out.printf("_");
			}

			for(int j=0;j<2*i-1; j++) {  
				System.out.printf("*");

			}
			for(int k=0; k<3-i; k++) {
				System.out.printf("_");
			}
			System.out.println();
		}

		for(int i=2; i>=1; i--) {  
			for(int k=0; k<3-i; k++) {
				System.out.printf("_");
			}

			for(int j=0;j<2*i-1; j++) {  
				System.out.printf("*");

			}
			for(int k=0; k<3-i; k++) {
				System.out.printf("_");
			}
			System.out.println();
		}
		 */
		
		/*
		 //[6] 다른 풀이 - 다시
		  for(int i=1; i<=5; i++) {
			  for(int j=1; j<=Math.abs(3-i); j++) { //절댓값
				  System.out.printf("_");
				  
			  }
			  for(int j=0; j)
			  System.out.printf("*");
			  System.out.println();
		  }
*/
		

		
		/*
		//[7]
		for(int i=1; i<=5; i++) {           // 줄
			for(int j=0; j<i; j++) {     // 별 갯수

				if(i==j+1) {
					System.out.printf("*");
					for(int k=j+1; k<5; k++) 
						System.out.printf("_");
				}
				else
					System.out.printf("_");
			}
			System.out.println();
		}		
		 */
		
		/*
		//[8]
		for(int i=1; i<=5; i++) {           // 줄
			for(int j=4; j>=0; j--) {     // 별 갯수

				if(i==j+1) {
					System.out.printf("*");
					for(int k=j+1; k<i; k++) 
						System.out.printf("_");
				}
				else
					System.out.printf("_");
			}
			System.out.println();
		}		
		*/
		
		/*
		//[9]
		for(int i=1; i<=5; i++) {           // 줄
			for(int j=0; j<i; j++) {     // 별 갯수

				if(i==j+1) {
					System.out.printf("*");
					for(int k=j+1; k<5; k++) 
						System.out.printf("_");
				}
				else
					System.out.printf("_");
			}
			System.out.println();
			
			*/
		
	}
}
