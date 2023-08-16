package days06;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2023. 7. 25. - 오전 11:05:35
 * @subject
 * @content
 */
public class Practice {

	public static void main(String[] args) {
		int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };
		
		int max = 92;
		ArrayList list = new ArrayList();
		for(int i=0; i<m.length; i++) {
			if(m[i]==max) list.add(i);
		}
		System.out.println(list);
	}

}






