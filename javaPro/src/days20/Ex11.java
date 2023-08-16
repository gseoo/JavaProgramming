package days20;

import java.time.temporal.ChronoField;

public class Ex11 {
	public static void main(String[] args) {
		
		/*
		<시험>
		// java.time 패키지에 jdk 1.8 새로 추가된 날짜, 시간 클래스 있음
		 			   ㄴ 4개의 하위 패키지로 구성
		1. java.time 패키지 : 날짜, 시간 다루는 핵심 클래스 제공
			1) java.time.chrono : 표준(ISO)이 아닌 달력 시스템을 위한 클래스
			2) java.time.format : 형식화(파싱 포함) 관련 클래스 제공
			3) java.time.temporal : 날짜, 시간에 사용하는 필드와 단위(unit) 관련 클래스 제공
			4) java.time.zone : 시간대(time-zone) 관련 클래스 제공
			
		2. java.time 핵심 클래스
			1) 날짜 : LocalDate 클래스
			2) 시간 : LocalTime 클래스
			3) 날짜 + 시간 : LocalDateTime 클래스
			4) 날짜 + 시간 + 시간대 : ZonedDateTime 클래스  
			-> Temporal, TemporalAdjust 인터페이스를 구현
			
		3. 위 클래스들은 new 연산자로 객체 생성 X -> now(), of() 메소드 사용해서 개체 생성
			
		4. 날짜와 날짜 사이의 간격 : Period
		   시간과 시간 사이의 간격 : Duration
		   -> TemporalAmount 인터페이스 구현
		  
		5. 날짜와 시간의 [단위]를 정의해 놓은 것
			: Temporal[Unit] 인터페이스
			 Temporal[Unit] 인터페이스를 구현한 클래스 : ChronoUnit 클래스
			 
		6. 날짜와 시간의 [필드]를 정의해 놓은 것
			: Temporal[Field] 인터페이스
			Temporal[Field] 인터페이스를 구현한 클래스 : Chrono[Field] 클래스
			
		7. 특정 필드(년, 월, 일, 시간, 분... 등) 가져오기
			ㄴ getXXX() : getYear()
			ㄴ get(필드) : get(ChronoField.YEAR)
			
		8. 특정 필드 수정
			with() : 수정
			plus() : 추가
			minus() : 감소
			
		*/
	}
}
