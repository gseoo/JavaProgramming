package days10;

public class Ex01_02 {
	public static void main(String[] args) {
		int n = 125;
		int share, reminder;
		
		char ch[] = {'0','1','2','3','4','5','6','7','8','9','a', 'b', 'c', 'd', 'e', 'f'};
		String s = "";

		while(n!=0) {
			share = n/16;
			reminder = n%16;
			s = ch[reminder] + s;
			n = share;
		}
		System.out.printf("0x%s", s);
	}
}
