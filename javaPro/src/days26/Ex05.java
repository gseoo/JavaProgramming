package days26;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author 이경서
 * @date 2023. 8. 18. - 오전 10:37:29
 * @subject PiedReader / PipedWriter
 * @content - 스레드 간의 데이터를 입/출력할 때 사용하는 스트림
 * 
 * 			RandomAccessFile
 * 			- 랜덤하게 접근하는 파일 스트림
 * 			- 이거 하나로 읽기/쓰기 모두 가능
 * 			- 장점: 파일의 어느 위치에나 읽기/쓰기가 가능
 * 			- DataOutputStream(출력), DataInputStream(입력)이 구현되어 있음
 * 			- seek(위치) : 원하는 위치로 이동시키는 메소드
 * 			- getFilePointer() : 현재 나의 위치를 반환하는 메소드
 * 			- readXXX() : 읽기용 메소드
 * 			- writeXXX() : 쓰기용 메소드
 */
public class Ex05 {
	public static void main(String[] args) throws IOException {
		String s = "I Love normal Java";
		String q = "javabook";

		String name = ".\\src\\days26\\random.txt";
		String mode = "rw"; // 읽기,쓰기용
		//String mode = "r"; // 읽기용
		//String mode = "w"; // 쓰기용

		try (RandomAccessFile raf = new RandomAccessFile(name, mode)){
			raf.writeBytes(s);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("> 엔터 치면 계속 진행");
		System.in.read();
		System.in.skip(System.in.available());

		try (RandomAccessFile raf = new RandomAccessFile(name, mode)){
			// 임의의 위치로 이동 - 그 위치에서 읽기/쓰기
			raf.seek(7);
			raf.writeBytes(q);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("> 엔터 치면 계속 진행");
		System.in.read();
		System.in.skip(System.in.available());
		
		try (RandomAccessFile raf = new RandomAccessFile(name, mode)){
			// 임의의 위치로 이동 - 그 위치에서 읽기/쓰기
			raf.seek(2);
			String line = raf.readLine();
			System.out.println(line);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("-- END --");

	}
}
