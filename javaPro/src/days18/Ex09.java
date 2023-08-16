package days18;

public class Ex09 {
	public static void main(String[] args) {
		
		// StringBuffer, StringBuilder 클래스
		// StringBuffer : 멀티스레드에 안전하지 않음, 동기화 처리 X
		// StringBuidler : 멀티스레드에 안전함, 동기화 처리 O
		// 사용법은 똑같음 - 조건에 맞게 사용
		
		// 두 클래스는 언제 사용하는가?
		// String : 변경 불가능한 클래스
		// StringBuffer, StringBuilder : 변경이 가능한 클래스(삽입, 삭제, 수정, 추가)
		
		// 라인수만큼 객체가 생성됨 -> 좋은 코딩 아님
		String sql = "SELECT "; 
        sql += "a.ano ";
        sql += " ";
        sql += ", a.user_id as userId ";
        sql += " ";
        sql += ", b.user_name as userName ";
        sql += " ";
        sql += ", a.rno ";
        sql += " ";
        sql += ", c.rname ";
        sql += " ";
        sql += ", DATE_FORMAT(a.sd,'%Y-%m-%d') as sd ";
        sql += " ";
        sql += ", DATE_FORMAT(a.ed,'%Y-%m-%d') as ed ";
        sql += " ";
        sql += ", DATE_FORMAT(a.rd,'%Y-%m-%d %T') as rd ";
        sql += " ";
        sql += ", DATE_FORMAT(a.check_in,'%Y-%m-%d %T') as checkIn ";
        sql += " ";
        sql += ", DATE_FORMAT(a.check_out,'%Y-%m-%d %T') as checkOut ";
        sql += " ";
        sql += "-- , a.sign_yn as signYn ";
        sql += " ";
        sql += ", d.code_name as signYn ";
        sql += " ";
        sql += "-- , a.cancel_yn as cancelYn ";
        sql += " ";
        sql += ", e.code_name as cancelYn ";
        sql += " ";
        sql += "FROM tb_reservation a left outer join tb_user b on a.user_id = b.user_id ";
        sql += " ";
        sql += "left outer join tb_rooms c on a.rno = c.rno ";
        sql += " ";
        sql += "left outer join tb_code d on a.sign_yn = d.code_cd ";
        sql += " ";
        sql += "left outer join tb_code e on a.cancel_yn = e.code_cd ";
        
	}
}
