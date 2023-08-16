package days16;

// unchecked 예외
// 0~100이 아니면 사용자가 정의한 예외 발생시키기 위해서 선언
public class ScoreOutOfBoundException extends RuntimeException {
	
	// 예외 코드번호 필드
	private final int ERROR_CODE;

	// 상수이기 때문에 갚을 한 번만 초기화하면 돼서 set은 만들어지지 않음
	public int getERROR_CODE() {
		return ERROR_CODE;
	}

	
	public ScoreOutOfBoundException(String message) {
		this(1000, message);
	}
	
	public ScoreOutOfBoundException(int eRROR_CODE, String message) {
		super(message);
		ERROR_CODE = eRROR_CODE;
	}
	
	
	
}
