package days11;

/**
 * @author 이경서
 * @date 2023. 7. 27. - 오후 3:33:37
 * @subject	다차원 배열은 배열의 배열이다.
 * @content	
 */
public class Ex07_03 {
	public static void main(String[] args) {
		/*
		int[][][] m = new int[2][3][4];
		System.out.println(m.length); // 2 면 크기
		System.out.println(m[0].length); // 2 행 크기
		System.out.println(m[1].length); // 2 행 크기
		System.out.println(m[0][0].length); // 2 열 크기
		System.out.println(m[0][1].length); // 2 열 크기
		System.out.println(m[0][2].length); // 2 열 크기
		System.out.println(m[1][0].length); // 2 열 크기
		System.out.println(m[1][1].length); // 2 열 크기
		System.out.println(m[1][2].length); // 2 열 크기
		*/
		
		int [][][] m = {{{1,2,3},{4,5,6},{7,8,9}},{{1,2,3},{4,5,6},{7,8,9}}};
		dispM(m);
	}

	private static void dispM(int[][][] m) {
		for(int i=0; i<m.length; i++) {
			System.out.printf("[%d]면\n",i);
			for(int j=0; j<m[i].length; j++) {
				for(int k=0; k<m[i][j].length; k++) {
					System.out.printf("m[%d][%d][%d]=%d  ", i, j, k, m[i][j][k]);
				}
				
			}
			System.out.println();
		}
		
	}
}
