package days04;

public class Ex07 {
	public static void main(String[] args) {
		/*
		int sum = 0, i=1;
		for(      ;      ;      ) {
			if(i>10) break;
			System.out.printf("%d+",i);
			sum += i;
			i++;
		}
		System.out.printf("\b = %d",sum);
		*/
		
		
		/*
		int sum = 0;
		for(int i =1, j=1, k=10; i<=10 && k<=10 || j>-100; i++, j--, k+=2) {
			System.out.printf("%d+",i);
			sum += i;
		}
		System.out.printf("\b = %d",sum);
		*/
		
		
		// [문제] 1~10 합을 출력하세요
		int sum = 0;
		for(int i =10; i>=1; i--) {
			System.out.printf("%d+",i);
			sum += i;
		}
		System.out.printf("\b = %d",sum);
		
	}
}
