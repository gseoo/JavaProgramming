package days24;

// ~VO == Value Object : 값 읽기/쓰기 작업을 위한 객체
// DTO, DAO, VO
public class MemberVO {
	
	private String name;
	private String position; // 팀장, 팀원
	
	public MemberVO() {
		super();
	}
	
	public MemberVO(String name, String position) {
		super();
		this.name = name;
		this.position = position;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", position=" + position + "]";
	}
	
}
