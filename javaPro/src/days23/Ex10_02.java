package days23;

import java.io.FileReader;
import java.util.Properties;

public class Ex10_02 {
	public static void main(String[] args) {
		   
		
		Properties p = new Properties();

		String fileName = ".\\src\\com\\util\\jdbc.properties";
		String comments = "jdbc configuration";
		try (FileReader reader = new FileReader(fileName)){
			p.load(reader);
			
			String className = p.getProperty("className");            
			String url = p.getProperty("url");              
			String user = p.getProperty("user");                                                                          
			String password = p.getProperty("password");       
			
			System.out.println(" Load End. ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}