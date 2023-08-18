package days26;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * @author 이경서
 * @date 2023. 8. 18. - 오전 9:01:45
 * @subject DataInputStream / DataOutputStream
 * @content : 기본형 8가지를 읽기/쓰기가 가능한 바이트 스트림
 */
public class Ex02_02 {
	public static void main(String[] args) {
		String name;
		int kor, eng, mat,tot;
		double avg;
		boolean gender;
		
		// FileInputStream, DataInputStream(보조)
		String fileName = ".\\src\\days26\\student.dat";
		try (FileInputStream in = new FileInputStream(fileName); DataInputStream dis = new DataInputStream(in)){
			name = dis.readUTF();
			kor = dis.readInt();
			eng = dis.readInt();
			mat = dis.readInt();
			tot = dis.readInt();
			avg = dis.readDouble();
			gender = dis.readBoolean();
			
			System.out.printf("%s, %d, %d, %d, %d, %f, %b\n",
					name, kor, eng, mat, tot, avg, gender);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("-- End --");
	}
}