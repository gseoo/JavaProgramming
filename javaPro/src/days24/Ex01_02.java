package days24;
/*
 2. days19 패키지 안에 있는 
  "1. Java 팀 구성.txt" 파일을 읽어와서
  
   Map 컬렉션 클래스 사용해서
      key : 1조, 2조, 3조
      value :  직위(급)과 이름을 저장하는 클래스를 선언하고
               그 클래스 객체를 저장하는 컬렉션 클래스 사용   
   저장하고 출력하는 코딩을 하세요.    
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Ex01_02 {
	public static void main(String[] args) {
		String fn = ".\\src\\days19\\1. Java 팀 구성.txt";
		String no, leader, name;
		
		ArrayList<MemberVO> teamList = null;
		HashMap<String, ArrayList<MemberVO>> teamMap = new HashMap<String, ArrayList<MemberVO>>();
		StringBuilder sb = new StringBuilder();
		String content = "";
		String line = null;
		
		try(FileReader fr = new FileReader(fn); BufferedReader br = new BufferedReader(fr)) {
			while((line = br.readLine()) != null) {
				sb.append(line + "\r\n");
			}
			content = sb.toString();
			System.out.println(content);
			
			String pattern = "{0}\r\n{1}\r\n"
					+ "{2}\r\n{3}\r\n"
					+ "{4}\r\n{5}\r\n";
			MessageFormat mf = new MessageFormat(pattern);
			Object [] datas = mf.parse(content);
			
			System.out.println(datas[0]);
			System.out.println(datas[2]);
			System.out.println(datas[4]);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
