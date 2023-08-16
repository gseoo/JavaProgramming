package days24;

import java.util.Enumeration;
import java.util.Properties;

public class Ex02 {
	public static void main(String[] args) {
		//[Properties 컬렉션 클래스]
		
//		String userDir = System.getProperty("user.dir");
//		System.out.println(userDir);
		
		Properties sysPros = System.getProperties();
		Enumeration<Object> en = sysPros.keys();
		while (en.hasMoreElements()) {
			String key = (String) en.nextElement();
			String value = System.getProperty(key);
			System.out.printf("%s : %s\n", key, value);
		}
	}
}
