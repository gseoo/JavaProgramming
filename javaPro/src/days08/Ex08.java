package days08;

public class Ex08 {
	public static void main(String[] args) {

		// 2^3 = 2*2*2 = 8
		// [거듭제곱 ] = 누승 = 멱 = pow
		// 밑수를 지수만큼 반복해서 곱하는 것

		/*
		// 일반 함수
		double result = pow(2,3);
		double result1 = pow(2,-3);
		System.out.println(result);
		System.out.println(result1);
		*/

		double result = recursivepow(2,3);
		double result1 =recursivepow(2, -3);
		System.out.println(result);
		System.out.println(result1);
	}



	private static double recursivepow(int n, int m) {
		if(m>1) return n*recursivepow(n, m-1);
		else if(m==1) return n;
		else if(m==0) return 1;
		else return (double)1/(recursivepow(n, -1*m));
		
	}



	private static double pow(int n, int m) {
		double result= 1;
		int exp=Math.abs(m); // 절댓값 구하기 (음수를 양수로 만들기 위해)
		
		for(int i=0; i<exp; i++) {
			result *= n;
		}

		if(m<0) return (double)1/result;
		else return result;
	}
}
