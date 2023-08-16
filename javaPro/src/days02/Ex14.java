package days02;

public class Ex14 {

	public static void main(String[] args) {
		float f; // 32비트 [0] 부호비트 [00000000 지수 8]  [000000 가수 23]
		double d; //64비트 [0] 부호비트 [00000000000 지수 11] [000000 가수 52]

		float pi = (float) 3.14;
		
		System.out.printf("pi - %f", pi);
	}

}
