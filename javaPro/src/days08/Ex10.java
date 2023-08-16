package days08;

public class Ex10 {
	public static void main(String[] args) {
		
		// 신용카드
		String card = "7655-8988-9234-5677";
		String[] cardArr = card.split("-");
		
		int index =(int)(Math.random()*4);
		cardArr[index] = "****";
		
		//String printCard = String.format("%s-%s-%s-%s", cardArr[0],cardArr[1],cardArr[2],cardArr[3]);
		String printCard = String.join("-", cardArr);   // String.join() 함수
		System.out.println(printCard);
	}
}


