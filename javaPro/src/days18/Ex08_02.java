package days18;

public class Ex08_02 {
	public static void main(String[] args) {
		String directory = "C:\\temp\\days09";
		String fileName = "Ex01.java";
		String sep = System.getProperty("file.separator"); // "\"
		
		String path;
		if(directory.endsWith(sep))
			path = directory + fileName;
		else path = directory + sep + fileName;

		System.out.println(path);
		
		String dir = System.getProperty("user.dir");
		System.out.println(dir);
	}
}
