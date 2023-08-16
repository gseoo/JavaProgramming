package days11;


public class Ex03 {
	public static void main(String[] args) {
		int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };
		
		// 순차검색 사용 -> max가 있는 위치(index) 모두 출력
		int max = 92;
		int beginIndex = 0;
		int index = 0;
		boolean flag = false;
		
		while((index = sequentialSearch(m, max, beginIndex))!=-1) {
			System.out.println("찾은 위치(index) : "+ index);
			beginIndex = index + 1;
		}
		if(!flag) System.out.println("찾는 값이 없습니다.");
		
		
		/*
		ArrayList list = new ArrayList();
		for(int i=0; i<m.length; i++) {
			if(m[i]==max) list.add(i);
		}
		System.out.println(list);
		*/
	}
	private static int sequentialSearch(int[] m, int n, int beginIndex) {
		int index = -1;
		for(int i=beginIndex; i<m.length; i++) {
			if(m[i]==n) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	private static int sequentialSearch(int[] m, int n) {
		int index = -1;
		for(int i=0; i<m.length; i++) {
			if(m[i]==n) {
				index = i;
				break;
			}
		}
		return index;
	}
}
