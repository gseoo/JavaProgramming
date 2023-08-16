package days05;

public class Ex04 {
	public static void main(String[] args) {
		//[1]1+2+3+4+...+10=?
		/*
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum+=i;
			System.out.printf( i==10 ? "%d" : "%d+",i);
		}
		System.out.printf("=%d",sum);
		*/
		
		/*
		//[2] 1~10 중 홀수의 합
		int sum=0;
		for(int i=1; i<=10; i++) {
			if(i%2!=0 ) {
				sum+=i;
				System.out.printf("%d+",i);
			}
		}
		System.out.printf("=%d",sum);
		*/
		
		/*
		// [3] 1~10 홀수의 합
		// continue; : 반복문에서 continue문을 만나면 밑의 코드는 수행하지 않고 증감식으로 이동
		int sum=0;
		for(int i=1; i<=10; i++) {
			if(i%2==0)  continue;
				sum+=i;
				System.out.printf("%d+",i);
		}
		System.out.printf("=%d",sum);
		*/
		
		/*
		// [4] 1~10 홀수의 합
		// 증감식 수정 -> for문을 5번밖에 돌지 않으므로 성능 good
		int sum=0;
		for(int i=1; i<=10; i+=2) {
				sum+=i;
				System.out.printf("%d+",i);
		}
		System.out.printf("=%d",sum);
		*/

		
		// [5] 1~n까지의 합 
		int n =15;
		int sum=0;
		for(int i=1; i<=n; i++) {
				sum+=i;
				System.out.printf( i==n ? "%d" : "%d+",i);
		}
		System.out.printf("=%d",sum);
		
		
		
		
		
		
	}
}
