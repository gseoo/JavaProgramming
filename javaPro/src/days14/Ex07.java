package days14;

/**
 * @author 이경서
 * @date 2023. 8. 1. - 오후 2:11:39
 * @subject [static]
 * @content 필드 앞에 
 * 			메소드 앞에
 * 			클래스 앞에
 */
public class Ex07 {
	public static void main(String[] args) {
		// [우리반] -> 기업은행 -> 저축
		// 저축 관련 클래스 선언

		// 인스턴스 변수 호출 : 객체명.필드, 객체명.메소드();
		// 클래스 변수 호출 : 클래스명.static필드

		// 1. static 필드는 언제 사용하나요?
		// 모든 인스턴스가 공유해야 할 필드가 필요해서 (이자율)

		// 2. 정적(static) 메소드는 언제 사용하나요?
		// 	1)static 필드를 사용하기 위해서 만듦
		// 	2) 


//		System.out.println(Save.getRate());
//		Save.setRate(0.08);


		Save s1 = new Save("주강민", 1000, 0.04);
		Save s2 = new Save("정하영", 1500, 0.04);
		Save s3 = new Save("임경재", 34500, 0.04);
		Save s4 = new Save("이재현", 5000, 0.04);
		Save s5 = new Save("이준희", 21000, 0.04);

		Save.setRate(0.08);

		s1.dispSave();
		s2.dispSave();
		s3.dispSave();
		s4.dispSave();
		s5.dispSave();
	}


	/*
		// 클래스 배열로 선언
		Save ss[] = {
					new Save("주강민", 1000, 0.04),
					new Save("정하영", 1500, 0.04),
					new Save("임경재", 34500, 0.04),
					new Save("이재현", 5000, 0.04),
					new Save("이준희", 21000, 0.04)
					};

		for (int i = 0; i < ss.length; i++) {
			ss[i].dispSave();
		}
	 */


	// 모든 사람의 이자율은 동일할 것
	// Save 객체가 생성될 때마다 rate 필드는 필요없음
	// Save 클래스 당 1개만 rate 필드 생성해서 모든 객체가 공유해서 사용
}

