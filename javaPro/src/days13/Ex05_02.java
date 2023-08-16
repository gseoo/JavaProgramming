package days13;

public class Ex05_02 {
	public static void main(String[] args) {
		/*
		// 클래스 배열 초기화
		Tv [] tvArr = new Tv[3];
		
		//[1]
		tvArr[0] = new Tv();
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();
		
		//[2]
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i] = new Tv();
		}
		
		//[3]
		Tv tvArr[] = new Tv[] {new Tv(), new Tv(), new Tv()};
		*/
		
		//[3-2]
		Tv tvArr[] = {new Tv(), new Tv(), new Tv()};
		
		
		tvArr[0].powerOnOff();
		System.out.println("Tv : " +( tvArr[0].power ? "ON" : "OFF"));
		tvArr[0].channelUp();
		System.out.println("현재 채널 : " + tvArr[0].channel);
		tvArr[0].powerOnOff();
		System.out.println("Tv : " +( tvArr[0].power ? "ON" : "OFF"));
		System.out.println("end");
	}
}
