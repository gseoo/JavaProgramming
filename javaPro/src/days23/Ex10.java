package days23;

import java.io.FileWriter;
import java.util.Properties;

public class Ex10 {
	public static void main(String[] args) {
		/*
		[Properties 컬렉션 클래스]
		= Hashtable 컬렉션 클래스
		- Map
		- Hashtable<String, String> == Properties
		- key , value: String

		- 환경설정값들을 Properties 컬렉션 클래스를 사용해서 쓰기/읽기
		 */

		String className = "oracle.jdbc.driver.OracleDriver";            
		String url = "jdbc:oracle:thin:@localhost:1521:xe";                  
		String user = "scott";                                                                   
		String password = "tiger";   
		
		Properties p = new Properties();
		p.setProperty("className", className);
		p.setProperty("url", url);
		p.setProperty("user", user);
		p.setProperty("password", password);
		
		
		String value = p.getProperty("className");
		System.out.println(value); // oracle.jdbc.driver.OracleDriver
		
		
		// ???.properties 확장자로 저장하기
		String fileName = ".\\src\\com\\util\\jdbc.properties";
		String comments = "jdbc configuration";
		try (FileWriter writer = new FileWriter(fileName)){
			p.store(writer, comments);
			System.out.println(" Save End. ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

