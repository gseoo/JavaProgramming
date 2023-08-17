package days25;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex07_05 {
	public static void main(String[] args) {
		// 실행 파일 복사 - 바이트 스트림 사용
		String pathname = "E:\\image.JPG";
		String copyPathname = "C:\\Users\\user\\Documents\\image_copy.JPG";
		
		// > 복사 처리 시간(ns) : 122976900(ns)
		//fileCopy_textStream(pathname, copyPathname);
		// > 복사 처리 시간(ns) :    795500(ns)
		fileCopy_textStream02(pathname, copyPathname);
	}

	private static boolean fileCopy_textStream(String pathname, String copyPathname) {
		long start = System.nanoTime();
		
		final int BUFFER_SIZE = 1024;
		
		try(FileInputStream fis = new FileInputStream(pathname);
			FileOutputStream fos = new FileOutputStream(copyPathname);){
			
			int b;
			while((b=fis.read()) != -1) {
				fos.write(b);
			}
				
			System.out.println("파일 복사 완료!!!");
			
			long end = System.nanoTime();
			System.out.printf("> 복사 처리 시간(ns) : %d(ns)\n", end-start);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	private static boolean fileCopy_textStream02(String pathname, String copyPathname) {
		long start = System.nanoTime();
		
		final int BUFFER_SIZE = 1024;
		
		try(FileInputStream fis = new FileInputStream(pathname);
			FileOutputStream fos = new FileOutputStream(copyPathname);
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos)){
			
			byte [] b = new byte[BUFFER_SIZE];
			int readByteNumber = 0;
			while((readByteNumber = bis.read(b)) != -1) {
				bos.write(b, 0, readByteNumber);
			}
			bos.flush();
				
			System.out.println("파일 복사 완료!!!");
			
			long end = System.nanoTime();
			System.out.printf("> 복사 처리 시간(ns) : %d(ns)\n", end-start);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
