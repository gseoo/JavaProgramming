package days03;

import java.util.Calendar;

public class Ex02 {
	public static void main(String[] args) {
		
		// java.util.IllegalFormatConversionException: d != java.lang.String
		// 잘못된 형식 컨버전 d는 문자를 출력할 때 사용되는 컨버전이 아님
		//System.out.printf("%d\n", "홍길동");

		Calendar c = Calendar.getInstance();
		System.out.printf("%1$tm %1$te %1$tY\n", c);
		
		// %[argument_index$][flags][width][.precision]conversion
		// %                                #       10                           d
		// %                                0        2                            d        
		
		System.out.printf("%(d\n",-123); // 음수면 양쪽 괄호
		System.out.printf("%,d\n",234954754); // 3자리마다 콤마 찍기
		
	}
}
