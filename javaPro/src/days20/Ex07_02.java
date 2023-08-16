package days20;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Ex07_02 {
	public static void main(String[] args) {
		String strMoney = "1,234,567";
		int money;
		
		String pattern = "#,###";
		DecimalFormat df = new DecimalFormat(pattern);
		try {
			Number num = df.parse(strMoney); // Number 타입 : 래퍼클래스 자료형들의 부모
			money = num.intValue();
			System.out.println(money);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		/*
		// [1] 
		money = Integer.parseInt(strMoney.replace(",",""));
		System.out.println(money);
		*/
	}
}
