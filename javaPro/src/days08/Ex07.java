package days08;

public class Ex07 {
	public static void main(String[] args) {
		
		// 재귀함수
		// 1) 1~n 합 재귀함수
		// 2) 팩토리얼 (=계승)
		
		/*
		// 일반함수
		int result = factorial(5);
		System.out.println(result);
		*/
		
		// 재귀함수
		int result = recursivefactorial(5);
		System.out.println(result);
	}

	private static int recursivefactorial(int n) {
		if(n>1) return n*recursivefactorial(n-1);
		else if(n==1 || n==0) return 1;
		else return -1;
	}

	private static int factorial(int n) {
		if(n<0) return -1;
		int mul = 1;
		for(int i=1; i<=n; i++)
			mul *= i;
		return mul;
	}
}
