package days25;

import java.io.File;
import java.io.FileReader;

public class Ex07 {
	public static void main(String[] args) {
		String pathname = ".\\src\\days25\\Ex01.java";
		// File 클래스 : 파일, 폴더(디렉터리)를 다루는 클래스
		File file = new File(pathname);
		
		/*
		String parent = ".\\src\\days25";
		String child = "Ex01.java";
		File f = new File(parent, child);
		*/
		
		// 파일 크기
		System.out.println(file.isDirectory()); // false
		System.out.println(file.isFile()); // true
		
		long fileLength = file.length();
		System.out.println(fileLength); //2840(바이트)
		
		try(FileReader fr = new FileReader(file)) {
			int code;
			
			// 라인 단위로 처리하는 보조스트림을 사용하면 라인 번호 붙이기 쉬워짐
			while((code = fr.read()) != -1) {
				System.out.printf("%c", (int)code);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
