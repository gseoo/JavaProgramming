package days20;

import java.text.DecimalFormat;

/**
 * @author 이경서
 * @date 2023. 8. 9. - 오후 2:10:13
 * @subject 형식화 클래스 4가지
 * @content SimpleDateFormat
 * 			DeiamalFormat
 * 			ChoiceFormat
 * 			MessageFormat
 */
public class Ex07 {
	public static void main(String[] args) {
		
		// DecimalFormat : 숫자를 형식화하는 클래스
		//int money = 3257600;
		double money = 3257600.8;
		
		// 출력형식 : \3,257,600
		
		/*
		// [1]
		String strMoney = String.format("\\%,d", money);
		System.out.println(strMoney);
		*/
		
		// [2] DecimalFormat
		// [패턴에 사용할 수 있는 기호]
		// 0 : 10진수 (값이 없을 경우 0 출력)
		// # : 10진수 (값이 없을 경우 안 찍음)
		// - : 음수 부호
		// , : 단위 구분자
		// E : 지수 기호
		// ; : 패턴 구분자
		// % : 퍼센트
		// ' : escape 문자
		// \u00A4 : 통화기호 (화폐단위)
		
		String pattern = "\u00A4 #,###.00";
		DecimalFormat df = new DecimalFormat(pattern);
		String strMoney = df.format(money);
		System.out.println(strMoney);
	}
}
