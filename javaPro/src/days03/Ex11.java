package days03;

/**
 * @author 이경서
 * @date 2023. 7. 17. - 오후 4:42:03
 * @subject 인덱스(index) 연산자 설명 *** 시험
 * @content     [ ]
 * 				자료형 [ ] 배열명 = new 자료형[배열크기];
 *                 자료형 배열명[ ] = new 자료형[배열크기];
 */
public class Ex11 {
	public static void main(String[] args) {
		//1. 국어 점수를 저장할 변수를 선언
		//int kor;
		
		//인덱스[] 연산자를 사용해서 배열 선언
		//2. 국어 점수를 5명 저장할 변수를 선언
		int [] kors = new int[5];
		kors[0] = 90;
		kors[1] = 100;
		kors[2] = 80;
		
		System.out.println(kors[0]);
		System.out.println(kors[1]);
		System.out.println(kors[2]);
		System.out.println(kors.length);
		
	}
}
