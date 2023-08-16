package days10;

public class Ex01 {
	public static void main(String[] args) {
		int n = 125;
		int share, reminder;
		
		char ch[] = {'a', 'b', 'c', 'd', 'e', 'f'};
		String s = "";
		char one;
		
		while(n!=0) {
			share = n/16;
			reminder = n%16;
			if(reminder >= 10) one = ch[reminder-10];
			else						 one = (char)(reminder+'0');
			
			s = one + s;
			n = share;
		}
		System.out.printf("0x%s", s);
	}
}
