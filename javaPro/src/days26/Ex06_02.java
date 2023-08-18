package days26;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex06_02 {
	public static void main(String[] args) {
		// [javaPro 모든 하위 폴더, 파일 목록 정보 조회]
		
		String currentDirectory = System.getProperty("user.dir");
		System.out.println(currentDirectory);
		
		File parent = new File(currentDirectory);
		
		/*
		String list[] = parent.list();
		for(int i=0; i<list.length; i++) {
			File f = new File(parent, list[i]);
			System.out.printf("%s\t%s\t%d\n",
					f.isDirectory() ? "[폴더]" : "파일", f.getName(), f.length());
		}
		*/
		
		File [] list = parent.listFiles();
		for(int i=0; i<list.length; i++) {
			String pattern = "yyyy-MM-dd a h:mm";
			Date date = new Date(list[i].lastModified());
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			String edit = sdf.format(date);
			
			System.out.printf("%s\t%s\t%d\t%s\n",
					list[i].isDirectory() ? "[폴더]" : "파일",
							list[i].getName(), list[i].length(), edit);
		}
	}
}
