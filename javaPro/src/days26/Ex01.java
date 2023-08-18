package days26;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * @author 이경서
 * @date 2023. 8. 18. - 오전 9:01:45
 * @subject DataInputStream / DataOutputStream
 * @content : 기본형 8가지를 읽기/쓰기가 가능한 바이트 스트림
 */
public class Ex01 {
	public static void main(String[] args) {
		String name = "이지현";
		int kor = 85, eng = 14, mat = 64;
		int tot = kor + eng + mat;
		double avg = (double)tot/3;
		boolean gender = true;
		
		// 한 학생 정보를 student.txt 파일에 저장
		// FileWriter, BufferedWriter(보조)
		String fileName = ".\\src\\days26\\student.txt";
		try (FileWriter out = new FileWriter(fileName, true); BufferedWriter bw = new BufferedWriter(out);){
			String data = String.format("%s,%d,%d,%d,%d,%f,%b\n",
					name, kor, eng, mat, tot, avg, gender);
			bw.append(data);
			bw.flush();
			System.out.println(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("-- End --");
	}
}