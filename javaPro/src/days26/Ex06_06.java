package days26;

import java.io.File;

public class Ex06_06 {
	public static void main(String[] args) {
		String pathname = ".\\src\\days26\\temp";
		File dir = new File(pathname);

		if(dir.exists()) {
			// then the directory must be empty inorder to be deleted. 
			// 하위 디렉토리가 없어야 삭제할 수 있음
			deleteDir(dir);
			System.out.println(dir.delete());
			// true - 삭제됨, false - 삭제 안 됨
		}
	}

	private static void deleteDir(File dir) {
		File list[] = dir.listFiles();
		if(list != null) {
			for(int i=0; i<list.length; i++) {
				if(list[i].exists()) {
					list[i].delete();
					deleteDir(list[i]);
				} 
			}
		}
		dir.delete();
	}
}
