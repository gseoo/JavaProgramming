package days26;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * @author 이경서
 * @date 2023. 8. 18. - 오전 9:01:45
 * @subject DataInputStream / DataOutputStream
 * @content : 기본형 8가지를 읽기/쓰기가 가능한 바이트 스트림
 */
public class Ex02 {
	public static void main(String[] args) {
		String name = "이지현";
		int kor = 32, eng = 29, mat = 40;
		int tot = kor + eng + mat;
		double avg = (double)tot/3;
		boolean gender = true;
		
		// FileOutputStream, DataOutputStream(보조)
		String fileName = ".\\src\\days26\\student.dat";
		try (FileOutputStream out = new FileOutputStream(fileName, true); DataOutputStream dos = new DataOutputStream(out)){
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(mat);
			dos.writeInt(tot);
			dos.writeDouble(avg);
			dos.writeBoolean(gender);
			dos.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("-- End --");
	}
}