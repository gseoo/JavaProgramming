package days26;

import java.io.File;
import java.io.FilenameFilter;

public class Ex06_03 {
	public static void main(String[] args) {
		//days26 폴더 안에 있는 특정 파일만 조회
		String pathname = ".\\src\\days26";
		File dir = new File(pathname);
		
		/*
		// [1]
		File list[] = dir.listFiles();
		for(int i=0; i<list.length; i++) {
			if(list[i].isFile()) {
				String fileName = list[i].getName();
				if(fileName.endsWith(".java"))
					System.out.println(fileName);
			}
		} 
		*/
		
		/*
		// [2]
		File list[] = dir.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".dat");
			}
		});
		
		for (File file : list) {
			System.out.println(file.getName());
		}
		*/
		
		// [3] 2를 람다식으로
		File list[] = dir.listFiles((d, n)-> n.endsWith(".dat"));
		for (File file : list) {
			System.out.println(file.getName());
		}
		
	}
}
