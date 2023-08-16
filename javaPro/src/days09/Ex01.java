package days09;

public class Ex01 {
	public static void main(String[] args) {
			int money = 125760;
			int unit = 50000;  
			boolean sw = false;
			int count = 0;
			
			while(unit>=1) {
				count = money/unit;
				System.out.printf("%d원 : %d개\n", unit, count);
				money %= unit;
				
//				if(sw == false) unit /= 5;
//				else unit /= 2;
				unit /= !sw ? 5 : 2;
				
				sw = !sw;
			}
	}
}
