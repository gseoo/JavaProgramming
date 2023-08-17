package days25;

import java.io.File;
import java.io.FileWriter;

public class Ex07_02 {
	public static void main(String[] args) {
		// [파일에 저장하기]
		String pathname = ".\\src\\days25\\sample.txt";
		File file = new File(pathname);
		
		// 파일 존재 유무를 true/false로 반환
		//System.out.println(file.exists()); // false
		
		// true : 원래 파일 뒤에 이어서 생성
		// false : 새로 생성 + 덮어쓰기
		try (FileWriter fw = new FileWriter(file, false)){
			/*
			fw.append('a');
			fw.append("append_string");
			
			fw.write(98);
			fw.write("write_string");
			*/
			fw.write("새로 실행해서 텍스트 추가");
			/*
			fw.flush();
			// flush 안 하고 close해도 자동으로 flush됨
			fw.close(); 
			*/
			
			System.out.println("End");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
