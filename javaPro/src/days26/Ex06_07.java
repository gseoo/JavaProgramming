package days26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex06_07 {
	public static void main(String[] args) {
		// [주말 문제]
		// javaPro 및 모든 하위 폴더 안에 있는 모든 파일을 찾아서 
		// fileName이라는 keyword로 검색 후에 파일명, 라인번호 출력
		
		String pathname = ".\\src\\days26";
		String keyword = "fileName";
		
		File parent = new File(pathname);
		File list[] = parent.listFiles();
		File f = null;
		String line = null;
		int lineNumber = 1;
		for(int i=0; i<list.length; i++) {
			f = list[i];
			lineNumber = 1;
			String fileName = f.getName();
			System.out.printf("---------- %s ----------\n", fileName);
			
			try (FileReader in = new FileReader(f); BufferedReader br = new BufferedReader(in)){
				while((line = br.readLine()) != null) {
					
					if(line.contains(keyword)) {
						line = line.replaceAll(keyword, "[" + keyword + "]");
						System.out.printf("%d : %s\n", lineNumber, line);
					}
					lineNumber++;
				}
			} catch (Exception e) {
			}
		}
		
		// 재귀함수 추가해서 만들기
		
	}
}
