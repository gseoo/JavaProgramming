package days03;

/**
 * 
 * @author 이경서
 * @date 2023. 7. 17. - 오후 3:26:31
 * @subject
 * @content
 */
public class Ex08 {
	public static void main(String[] args) {
		
		float pi = 3.141592f;
		
		// 소수점 4번째 자리에서 반올림한 실수값을 얻어와서 출력
		//1. System.out.printf("%.3f",pi);
		
		// 2. 변수에 저장해서 출력 --> String.format 사용
		//pi = Float.parseFloat(String.format("%.3f", pi));
		//System.out.println(pi);
		
		//3. 자를 자리까지 실수 부분으로 올려주고 0.5 더하기
		//    int로 소수부분 자르기
		//    반올림 하고 다시 나눠주기
		System.out.println(pi * 1000 + 0.5);
		System.out.println((int)(pi * 1000 + 0.5));
		System.out.println((int)(pi * 1000 + 0.5)/1000f);
		
		
		
	}
}
