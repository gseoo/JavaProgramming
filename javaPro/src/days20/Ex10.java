package days20;

import java.text.MessageFormat;

/**
 * @author 이경서
 * @date 2023. 8. 9. - 오후 3:17:07
 * @subject MessageFormat
 * @content 특정 형식에 맞춰서 데이터값 출력
 * 			특정 형식에 맞춰져 있는 데이터값 읽음
 */
public class Ex10 {
	public static void main(String[] args) {
		String name = "이준희";
		int age = 20;
		boolean gender = true;
		
		/*
		// String.format 데이터값을 특정 형식으로 출력
		String output = String.format("이름:%s, 나이:%d살, 성별:%s", name, age, gender);
		System.out.println(output);
		*/
		
		// MessageFormat
		// 이름:이준희, 나이:20살, 성별:true
		String pattern = "이름:{0}, 나이:{1}살, 성별:{2}";
		String output = MessageFormat.format(pattern, name, age, gender);
		System.out.println(output);

	}
}
