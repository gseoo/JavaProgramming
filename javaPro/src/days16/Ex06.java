package days16;

/**
 * @author 이경서
 * @date 2023. 8. 3. - 오전 11:41:49
 * @subject [Singleton pattern]
 * @content 1. DBCP(DataBase Connection Pool)
 * 			2. 객체 생성에 제한을 둠 - 1개 객체 생성
 * 				첫 번째 객체 생성 - 1개 객체 생성
 * 				두 번쨰 객체 생성 - 생성 x, 처음에 생성된 객체를 돌려줌
 */
public class Ex06 {
	public static void main(String[] args) {
		
		/*
		// The constructor BoardDao() is not visible : 디폴트 생성자가 없어서 객체 생성 불가
		BoardDao dao1 = new BoardDao();
		System.out.println(dao1.hashCode());
		BoardDao dao2 = new BoardDao();
		System.out.println(dao2.hashCode());
		BoardDao dao3 = new BoardDao();
		System.out.println(dao3.hashCode());
		BoardDao dao4 = new BoardDao();
		System.out.println(dao4.hashCode());
		*/
		
		BoardDao dao1 = BoardDao.getInstance();
		System.out.println(dao1.hashCode());
		BoardDao dao2 = BoardDao.getInstance();
		System.out.println(dao2.hashCode());
		BoardDao dao3 = BoardDao.getInstance();
		System.out.println(dao3.hashCode());
		BoardDao dao4 = BoardDao.getInstance();
		System.out.println(dao4.hashCode());
	}
}

// 1개 객체만 생성 - 싱글턴
// 클래스 내부에서는 객체 생성 가능
class BoardDao extends Object {
	
	private BoardDao() {
		
	}
	
	// 필드
	private static BoardDao boardDao = null;
	
	// 메소드 앞에 synchronized 키워드
	// 해당 메소드는 스레드에 안전한 동기화 처리가 됨
	public synchronized static BoardDao getInstance() {
		
		if(boardDao == null) {
			boardDao = new BoardDao();
		}
		return boardDao;
	}
}


