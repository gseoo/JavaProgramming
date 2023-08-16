//package days20;
//
//import java.util.Date;
//
//public class Ex03 {
//	public static void main(String[] args) {
//		Date sday = new Date(2023-1900, 7-1, 13, 9, 0, 0);
//		Date today = new Date();
//		
//		dispDiffDays(sday,today);
//		
//		/*
//		System.out.println(sday.getTime()); // 1689206400000
//		System.out.println(today.getTime()); // 1691546731873
//		
//		long diff = today.getTime() - sday.getTime();
//		System.out.println(diff + "ms"); // 2340392471ms
//		System.out.println(diff/1000 + "s"); // 2340392s
//		System.out.println(diff/(1000*60) + "m"); // 39006m
//		System.out.println(diff/(1000*60*60) + "h"); // 650h
//		System.out.println(diff/(1000*60*60*24) + "days"); // 27days
//		 */
//		
////		long l = 0;
////		int time[] = {1, 1000, 60, 60, 24};
////		String times[] = {"ms", "s", "m", "h", "day"};
////		
////		for(int i=0; i<time.length; i++) {
////			l = diff/time[i];
////			System.out.printf("%d%s\n", l, times[i]);
////			l %= time[i];
////		}
//	}
//
//	public static void dispDiffDays(Date sday, Date today) {
//		long diff = today.getTime() - sday.getTime();
//		
//		long 몫 = diff/(1000*60*60*24);
//		System.out.printf("%dd-", 몫);
//		diff %= (1000*60*60*24);
//		
//		몫 = diff/(1000*60*60);
//		System.out.printf("%dh-", 몫);
//		diff %= (1000*60*60);
//		
//		몫 = diff/(1000*60);
//		System.out.printf("%dm-", 몫);
//		diff %= (1000*60);
//		
//		몫 = diff/(1000);
//		System.out.printf("%ds-", 몫);
//		diff %= (1000);
//		
//		몫 = diff/1;
//		System.out.printf("%dms-\n", 몫);
//		
//		try {
//			Thread.sleep(10); // 10ms
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
////		dispDiffDays(sday, new Date());
//		
//	}
//}
