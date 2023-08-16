package days20;

import java.text.MessageFormat;
import java.text.ParseException;
import java.util.Arrays;

/**
 * @author 이경서
 * @date 2023. 8. 9. - 오후 3:17:07
 * @subject MessageFormat - 특정 형식의 문자열에서 원하는 값들을 얻어올 때 유용
 * @content 특정 형식에 맞춰서 데이터값 출력
 * 			특정 형식에 맞춰져 있는 데이터값 읽음
 */
public class Ex10_02 {
	public static void main(String[] args) {
		String source = "이름:이준희, 나이:20살, 성별:true";
		String pattern = "이름:{0}, 나이:{1}살, 성별:{2}";
		
		MessageFormat mf = new MessageFormat(pattern);
		try {
			Object objs[] = mf.parse(source);
			for(Object obj : objs) {
				System.out.println(obj);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		

	}
}
