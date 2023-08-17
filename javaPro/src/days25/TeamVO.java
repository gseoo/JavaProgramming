package days25;

public class TeamVO {
	private String name;
	private int totalNumber;
	private String leaderName;
	
	public TeamVO() {
		super();
	}
	
	public TeamVO(String name, int totalNumber, String leader) {
		super();
		this.name = name;
		this.totalNumber = totalNumber;
		this.leaderName = leader;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
	}

	public String getLeaderName() {
		return leaderName;
	}

	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}

	@Override
	public String toString() {
		return String.format("[%s(%d명) - %s]", this.name, this.totalNumber, this.leaderName);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		TeamVO vo = (TeamVO) obj;
		return this.name.equals(vo.name);
	}
	
}
