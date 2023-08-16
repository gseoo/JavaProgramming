package days07;

public class Ex07 {
	public static void main(String[] args) {
		// 1. 1/2 + 2/3 + 3/4 + ... + 8/9 + 9/10 = ???
		// 1. 1+2+4+7+11+16+...+191=??? --> 20개 항까지의 합을 구해서 출력
		
		/*
		// [1]
		double sum=0;
		for(int i=1; i<10; i++) {
			System.out.printf("%d/%d+",i, i+1);
			sum += (double)i/(i+1);
		}
		System.out.printf("=%f", sum);
		*/
		
		/*
		// [2] 
		int term = 1; // 일반항
		int difference = 0; // 계차
		int sum = 0;
		
		for(int i=0; i<20; i++) {
			term += difference;
			System.out.printf("%d+",term);
			sum+=term;
			difference++;
		}
		System.out.printf("=%d", sum);
		*/
		
		
		// [2] 계차수열 공식으로
		// (n^2-n)/2+1
		int term=0;
		int sum = 0;
		for(int i=1; i<=20; i++) {
			term = (int) ((Math.pow(i, 2)-i)/2+1);
			System.out.printf("%d+",term);
			sum+=term;
		}
		System.out.printf("=%d", sum);
	}
}
