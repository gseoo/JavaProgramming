package days14;

public class MyApp {
	
	// 디폴트 생성자
	public MyApp() {
		
		app_init();
		System.out.println("> MyApp 디폴트 생성자 호출 - 필드 초기화");
	}
	
	private void app_init() {
		System.out.println("> MyApp 디폴트 생성자 호출 - 필드 초기화 app_init() 호출");
		
	}
}
