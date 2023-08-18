package days26;

import java.io.File;
import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) throws IOException {
		/*
		[File 클래스]
		 1. 가장 많이 사용되는 입출력의 대상 - 파일
		 2. 파일 + 디렉토리(폴더)
		*/
		
		String pathname = ".\\src\\days26\\Ex01.java";
		File file = new File(pathname);
		
		// OS에서 사용하는 경로 구분자
		System.out.println(File.pathSeparator); // ;
		// OS에서 사용하는 이름 구분자
		System.out.println(File.separator); // \
		
		// 파일 이름
		String fileName = file.getName();
		System.out.println(fileName); // Ex01.java

		// 확장자만
		int index = fileName.indexOf(".");
		System.out.println(fileName.substring(index)); // .java
		// 확장자를 제외한 파일명
		System.out.println(fileName.substring(0, index)); // Ex01
		
		// 파일의 경로 반환
		System.out.println(file.getPath()); // 경로
		// .\src\days26\Ex01.java
		System.out.println(file.getAbsolutePath()); // 절대경로
		// C:\Users\\user\git\JavaProgramming\javaPro\.\src\days26\Ex01.java
		System.out.println(file.getCanonicalPath()); // 표준경로
		// C:\Users\\user\git\JavaProgramming\javaPro\src\days26\Ex01.java
		
		System.out.println(file.getParent()); // .\src\days26 - 문자열로 반환
		System.out.println(file.getParentFile()); // .\src\days26 - 파일 객체로 반환
		
		// com.util.FileUtil.java
	}
}
