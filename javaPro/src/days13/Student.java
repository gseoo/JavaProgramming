package days13;

public class Student {

	// 멤버 = 클래스의 구성요소 = 멤버변수(필드) + 멤버함수(메소드)
	// 필드 선언
	public int no;
	public String name;
	public int kor;
	public int eng;
	public int mat;
	public int tot;
	public double avg;
	public int rank;
	public int wrank;

	// 메소드 선언
	public void printStudentInfo() {
		System.out.printf("%d번\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d등\n",
				no, name, kor, eng, mat, tot, avg, rank);
	}
}
