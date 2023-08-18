package days26;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author 이경서
 * @date 2023. 8. 18. - 오후 4:42:10
 * @subject [직렬화] : 객체를 스트림으로 만드는 것
 * @content [역직렬화] : 스트림을 객체로 만드는 것
 * 			- 객체를 직렬화해서 읽기/쓰기 할 수 있는 바이트 스트림
 * 			ObjectInputStream
 * 			ObjectOutputStream
 * 			- 직렬화가 가능한 클래스로 만들기 위해서 Serializable 인터페이스를 구현하면 됨
 */
public class Ex07 {
	public static void main(String[] args) {
		// Student 클래스 -> s 객체 -> 파일 저장
		UserInfo u1 = new UserInfo("김호중", "1234", 25);
		UserInfo u2 = new UserInfo("이지현", "4321", 23);
		
		ArrayList<UserInfo> list = new ArrayList<UserInfo>();
		list.add(u1);
		list.add(u2);
		
		String pathname = ".\\src\\days26\\UserInfo.ser";
		
		try (FileOutputStream out = new FileOutputStream(pathname);
			ObjectOutputStream oos = new ObjectOutputStream(out)) {
			
			// NotSerializableException : 직렬화할 수 없음
			oos.writeObject(u1);
			oos.writeObject(u2);
			oos.writeObject(list);
			
			oos.flush();
			
			System.out.println("> u1, u2, list 객체를 직렬화시켜서 oos 파일로 저장 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class UserInfo implements Serializable {
	private static final long serialVersionUID = -4461614692108077735L;
	String name;
	transient String password; // 직렬화 대상에서 제외
	int age;
	
	public UserInfo() {
		this("Unknown", "1111", 0);
	}
	
	public UserInfo(String name, String password, int age) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", password=" + password + ", age=" + age + "]";
	}
	
}