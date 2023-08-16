package days12;

public class Ex01_03 {
	public static void main(String[] args) {
		//3행 4열
		int m[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		int [][] n = new int[2][6];
		
		//3*4 -> 2*6 변환
		// 2차원 -> 1차원 -> 2차원
		// 풀어보기
		// int i=4*행+열;
		// (4*행+열)/6 (4*행+열)%6?
		int []arr = new int[m.length*m[0].length];
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				arr[m[0].length*i+j] = m[i][j];
			}
		}
		//dispM(arr);
		
		for(int i=0; i<arr.length; i++) {
			n[i/6][i%6] = arr[i];
		}
		
		dispM(n);
	}

	private static void dispM(int[][] n) {
		for(int i=0; i<n.length; i++) {
			for(int j=0; j<n[i].length; j++) {
				System.out.printf("[%02d]",n[i][j]);
			}
			System.out.println();
		}
		
	}

	private static void dispM(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.printf("[%d]", arr[i]);
		}
	}
}
