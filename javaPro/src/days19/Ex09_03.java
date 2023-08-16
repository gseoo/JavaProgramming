package days19;
// 대소문자 + 0~9 숫자 갯수 출력
import java.io.FileReader;

public class Ex09_03 {
	public static void main(String[] args) {
		// days19.Ex01.java 파일 읽어와서
		// 알파벳 대소문자 구문하지 않고 
		// a~z까지 갯수 배열에 저장 후 ### 막대그래프 작성
		
		// 상대경로 : . (현재 디렉토리) == ~ 프로젝트명까지
		//			.. (상위 디렉토리)
		String path = ".\\src\\days19\\Ex01.java"; // .이 javaPro까지 나타냄 
		int [][] counts = new int[2][26]; // 0행 : 대문자, 1행 : 소문자
		int nums[] = new int[10];
		
		try (FileReader fr = new FileReader(path)){
			int code;
			char one;
			while((code = fr.read()) != -1) {
				one = (char)code;
				if(Character.isUpperCase(one))
					counts[0][one-'A']++; // one-'A' : 몇 번째 알파벳인지를 인덱스로 one-65
				else if(Character.isLowerCase(one))
					counts[1][one-'a']++;
				else if(Character.isDigit(one))
					nums[one-'0']++;
			} 
			for(int i=0; i<counts.length; i++) {
				System.out.printf("[%c]문자\n", i==0 ? '대' : '소');
				
				for(int j=0; j<counts[i].length; j++) {
					System.out.printf("%c(%d) : %s\n", i==0?j+'A' : j+'a', counts[i][j], "#".repeat(counts[i][j]));
				}
			}
			
			System.out.println("숫자");
			for(int i=0; i<nums.length; i++) {
				System.out.printf("%c(%d) : %s\n", i+'0', nums[i], "#".repeat(nums[i]));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
