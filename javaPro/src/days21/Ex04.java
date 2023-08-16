package days21;

import java.text.MessageFormat;
import java.text.ParseException;

public class Ex04 {
	public static void main(String[] args) {
		String source = "번호:1,이름:홍길동,주소:서울 양천구 목동";
		String pattern = "번호:{0},이름:{1},주소:{2}";
		
		int num;
		String name;
		String addr;
		
		MessageFormat mf = new MessageFormat(pattern);
		try {
			Object objs[] = mf.parse(source);
			
			// java.lang.ClassCastException
			// 클래스 형변환이 안 됐음
			// ( ) cast 연산자 : 강제로 형변환
			//num = (int)objs[0];
			num = Integer.parseInt(objs[0].toString());
			name = (String)objs[1];
			addr = (String)objs[2];
			System.out.println(num);
			System.out.println(name);
			System.out.println(addr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
