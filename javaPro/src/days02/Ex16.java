package days02;
/**
 * 
 * @author 이경서
 * @date 2023. 7. 14. - 오후 4:28:11
 * @subject
 * @content
 */
public class Ex16 {

	public static void main(String[] args) {
		// 1. 자동 형 변환
		int i = 10;  //                 [] [] [] []
		long l = i;   // [] [] [] [] [] [] [] []
		System.out.println(l);
		// 좌측의 기억 공간 크기가 우측 값보다 크니까 자동으로 변환되어 할당
		
		long L = l + i; // long + int = long
		
		
		// 2. 강제 형 변환'
		// ( ) cast 연산자 = 강제로 형을 변환해 주는 연산자 -> cast 강제 형 변환
		// (변환하고자 하는 타입)
		
		int a= 20;
		int b = 3;
		System.out.println((double)a/b);
		

	}

}
