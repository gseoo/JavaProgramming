package days12;

/**
 * @author 이경서
 * @date 2023. 7. 28. - 오후 2:45:18
 * @subject	"가변배열" 설명
 * @content	행마다 열의 길이가 다른 배열
 * 			출력은 names[행].length까지 하면 알아서 출력됨
 */
public class Ex05_02 {
	public static void main(String[] args) {
		String names[][] = new String[3][];
		names[0] = new String[25];
		names[1] = new String[20];
		names[2] = new String[30];
		
		for(int i=0; i<names.length; i++ ) {
			for(int j=0; j<names[i].length; j++) {
				System.out.print("[]");
			}
			System.out.println();
		}
	}
}
