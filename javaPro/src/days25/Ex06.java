package days25;

import java.io.FileOutputStream;
import java.util.Properties;

public class Ex06 {
	public static void main(String[] args) {
		//Properties 컬렉션 클래스
		// hashtable<String, String> + load()/store()
		
		// [days23.Ex10.java]
		String className = "oracle.jdbc.driver.OracleDriver";            
		String url = "jdbc:oracle:thin:@localhost:1521:xe";                  
		String user = "scott";                                                                   
		String password = "tiger"; 
		
		Properties p = new Properties();
		p.setProperty("className", className);
		p.setProperty("url", url);
		p.setProperty("user", user);
		p.setProperty("password", password);
		
		String fileName = ".\\src\\com\\util\\jdbc.properties.xml";
		String comments = "jdbc configuration";
		try (FileOutputStream os = new FileOutputStream(fileName) ){
			p.storeToXML(os, comments);
			System.out.println(" Save End. ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
