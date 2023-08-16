package days17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 이경서
 * @date 2023. 8. 4. - 오후 5:03:05
 * @subject 파일 읽어서 출력 + try~catch~finally문
 * @content close 안 쓰고 try에서 자동으로 닫히게
 */
public class Ex02_03 {
	public static void main(String[] args) {
		String fileName = "c:\\setup.log";
		try (FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
		){
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
		}
	}
}
