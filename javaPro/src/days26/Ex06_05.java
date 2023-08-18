package days26;

import java.io.File;

public class Ex06_05 {
	public static void main(String[] args) {
		// days26 폴더 안에 upload 폴더 유무 확인 후 없으면 폴더 생성
		String pathname = ".\\src\\days26";
		File dir = new File(pathname, "upload");
		
		// boolean createNewFile() : 파일 새로 생성 (return boolean)
		// createTempFile : 임시 파일 생성 (return File)
		// delete : 파일 삭제 (return boolean)
		// deleteOnExit() : 응용 프로그램이 종료할 때 파일 삭제(임시파일 삭제할 때 주로 사용) (void)
		// renameTo(File) : 파일명 변경 (return boolean)
		// mkdir() : 폴더 생성 (return boolean)
		// mkdirs() : 폴더들 생성 - 부모폴더 먼저 생성함 (return boolean)
		
		if(!dir.exists())
			System.out.println(dir.mkdir()); // true
		else
			dir.delete();
	}
}
