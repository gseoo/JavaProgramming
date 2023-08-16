package days12;

public class Ex01_02 {
	public static void main(String[] args) {
		// 3행 4열 2차원 배열 m 선언
		// 1~12까지 배열 초기화
		int m[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		dispM(m);
		
		// 2차원 배열을 1차원 배열로 변환
		int []n = new int[m.length*m[0].length];
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				n[m[0].length*i+j] = m[i][j];
			}
		}
		dispM(n);
	}

	private static void dispM(int[] n) {
		for(int i=0; i<n.length; i++) {
			System.out.printf("[%d]", n[i]);
		}
	}

	private static void dispM(int[][] m) {
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				System.out.printf("[%02d]",m[i][j]);
			}
			System.out.println();
		}
	}
}
