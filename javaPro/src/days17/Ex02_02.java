package days17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 이경서
 * @date 2023. 8. 4. - 오후 5:03:05
 * @subject 파일 읽어서 출력 + try~catch~finally문
 * @content 한 라인씩 읽어서 출력 - BufferedReader()
 */
public class Ex02_02 {
	public static void main(String[] args) {
		String fileName = "c:\\setup.log";
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr); // 다형성, 업캐스팅
			String line = null;
			int lineNumber = 1;
			
			while((line = br.readLine()) != null) {
				System.out.printf("%d : %s\n", lineNumber++, line);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(fr != null) {
				try {
					fr.close();
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
