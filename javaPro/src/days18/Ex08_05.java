package days18;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex08_05 {
	public static void main(String[] args) {
		
		// E:\Class\Workspace\JavaClass\javaPro
		String userDir = System.getProperty("user.dir");
		//System.out.println(userDir);
		
		// E:\Class\Workspace\JavaClass\javaPro\src\days18\ss19.txt
		String path = userDir.concat("\\src\\days18\\ss19.txt");
		//System.out.println(path);
		
		/*
		try (FileReader fr = new FileReader(path)){
			int code;
			while ((code = fr.read()) != -1) {
				System.out.printf("%c", (char)code);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		String nameArr[] = new String[20];
		int index = 0;
		
		try (FileReader fr = new FileReader(path);
				BufferedReader br = new BufferedReader(fr)){
			String name;
			while ((name = br.readLine()) != null) {
				//System.out.printf("%s\n", name);
				nameArr[index++] = name;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// String.join 메소드
		String nameTags = "<ol><li>"
				.concat(String.join("</li><li>", nameArr))
				.concat("</li><ol>");
		System.out.println(nameTags);
	}
}
