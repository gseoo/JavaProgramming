package days19;

import java.util.Objects;
import java.util.Random;

public class Ex08 {
	public static void main(String[] args) {
		// [Objects 클래스]
		
		Ex08 obj = null;
		
		// if(obj != null) 
		// = if(!Ojbects.isNull(obj))
		// = if(Objects.nonNull(obj)
		
		
		//Object.isNull(obj) :  obj 객체가 null일 때 true를 반환하는 메소드
		//Object.nonNull(obj) : obj 객체가 null이 아닐 떄 true 반환
		
		
		/*
		if(obj == null) {
			new Exception("예외 메시지");
		}
		
		this.name = name;
		*/
		
		// 위아래 두 개 같은 거
		
		//this.name = Objects.requireNonNull(name, "예외 메시지");
		
		// if( a!= null && a.equals(b)) { }
		// = if(Objects.equals(a,b) { } : null 체크랑 같은지 체크 한번에
		
		//java.util.Random 클래스
		Random rnd = new Random();
		rnd.nextBoolean(); // 랜덤으로 t/f 돌려줌
		//rnd.nextInt(bound); // 0 <= 정수 < bound
		
	}
}
