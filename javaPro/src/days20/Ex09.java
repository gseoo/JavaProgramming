package days20;

import java.text.ChoiceFormat;

/**
 * @author 이경서
 * @date 2023. 8. 9. - 오후 2:50:08
 * @subject 형식화 클래스 - ChoiceFormat
 * @content 
 */
public class Ex09 {
	public static void main(String[] args) {
		// 1) 특정 범위에 속하는 값을 문자열로 변환
		// 2) 불연속적인 범위의 값을 처리하는 데 if, switch문을 대신해서 사용할 수 있음
		//    -> 복잡한 처리를 간단한 코딩으로 처리할 수 있음
		
		// 문제) 국어점수 -> 수우미양가 출력
		
		double[] limits = {0,60,70,80,90 }; // 작은값부터
		String[] formats = {"가","양","미","우","수"};
		ChoiceFormat cf = new ChoiceFormat(limits, formats);
		
		
//		String newPattern = "0#가|60#양|70#미|80#우|90#수";
//		ChoiceFormat cf = new ChoiceFormat(newPattern);
		
		int kors[] = {100,67,23,99};
		for(int i=0; i<kors.length; i++) {
			System.out.printf("%d -> %s 등급\n", kors[i], cf.format(kors[i]));
		}
		
	}
}
