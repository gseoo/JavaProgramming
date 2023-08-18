package days26;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.MessageFormat;
import java.util.Arrays;

/**
 * @author 이경서
 * @date 2023. 8. 18. - 오전 9:01:45
 * @subject DataInputStream / DataOutputStream
 * @content : 기본형 8가지를 읽기/쓰기가 가능한 바이트 스트림
 */
public class Ex01_02 {
	public static void main(String[] args) {
		String name;
		int kor, eng, mat,tot;
		double avg;
		boolean gender;
		
		// 한 학생 정보를 student.txt 파일에 저장한 걸 읽어오기
		// FileReader, BufferedReader(보조)
		String fileName = ".\\src\\days26\\student.txt";
		try (FileReader in = new FileReader(fileName); BufferedReader br = new BufferedReader(in);){
			String line = br.readLine(); // 첫 번째 라인 읽어오기
			// 임경재, 87, 79, 80, 246, 82.00, true
			String pattern = "{0},{1},{2},{3},{4},{5},{6}";
			MessageFormat mf = new MessageFormat(pattern);
			Object obj[] = mf.parse(line);
			
			/*
			name = (String) obj[0];
			kor = Integer.parseInt(obj[1].toString());
			eng = Integer.parseInt(obj[2].toString());
			mat = Integer.parseInt(obj[3].toString());
			tot = Integer.parseInt(obj[4].toString());
			avg = Double.parseDouble(obj[5].toString());
			gender = Boolean.parseBoolean(obj[6].toString());
			
			String data = String.format("%s, %d, %d, %d, %d, %.2f, %b\n",
					name, kor, eng, mat, tot, avg, gender);
			System.out.println(data);
			*/
			
			String s[] = Arrays.asList(obj).toArray(new String[obj.length]);
			name = s[0];
			kor = Integer.parseInt(s[1]);
			eng = Integer.parseInt(s[2]);
			mat = Integer.parseInt(s[3]);
			tot = Integer.parseInt(s[4]);
			avg = Double.parseDouble(s[5]);
			gender = Boolean.parseBoolean(s[6]);
			
			String data = String.format("%s,%d,%d,%d,%d,%f,%b\n",
					name, kor, eng, mat, tot, avg, gender);
			System.out.println(data);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("-- End --");
	}
}