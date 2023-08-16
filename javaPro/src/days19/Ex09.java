package days19;

import java.io.FileReader;

public class Ex09 {
	public static void main(String[] args) {
		// days19.Ex01.java 파일 읽어와서
		// 알파벳 대소문자 구문하지 않고 
		// a~z까지 갯수 배열에 저장 후 ### 막대그래프 작성
		
		// 상대경로 : . (현재 디렉토리) == ~ 프로젝트명까지
		//			.. (상위 디렉토리)
		String path = ".\\src\\days19\\Ex01.java"; // .이 javaPro까지 나타냄 
		int [] counts = new int[26]; // counts[0] = 'a' & 'A'
		try (FileReader fr = new FileReader(path)){
			int code;
			char one;
			while((code = fr.read()) != -1) {
				one = (char)code;
				one = Character.toUpperCase(one);
				if(Character.isUpperCase(one))
					counts[one-'A']++; // one-'A' : 몇 번째 알파벳인지를 인덱스로 one-65
			}
			for(int i=0; i<counts.length; i++) {
				System.out.printf("%c(%d) : %s\n", i+'A', counts[i], "#".repeat(counts[i]));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
