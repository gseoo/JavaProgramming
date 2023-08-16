package days16;

public class Ex08 {
	public static void main(String[] args) {
		
	}
}

interface Movable {
	// 상수, 추상 메소드, default 메소드, static 메소드
	void move(int x, int y); // (public abstract)
}

interface Attackable {
	void attack(Unit unit);
}

// 인터페이스끼리 상속 가능, 다중 상속도 가능
interface Fightable extends Attackable, Movable {
	
}



abstract class Unit {
	int currentHP; // 현재 유닛의 체력
	int x; // 유닛의 위치(x좌표)
	int y; // 유닛의 위치(y좌표)
}

// 하늘 유닛
class AirUnit extends Unit {
	
}

// 땅 유닛
class GroundUnit extends Unit {
	
}

// 군인
class Fighter implements Fightable {

	@Override
	public void attack(Unit unit) {
		// 총, 칼 등등의 공격
	}

	@Override
	public void move(int x, int y) {
		// 군인이 걷는 코딩
	}
	
}

// 수리가 가능한 유닛
// 상수 x, 추상 메소드 x
interface Repairable {
	
}

// 땅에서 싸우는 유닛
class Tank extends GroundUnit implements Fightable, Repairable{

	@Override
	public void attack(Unit unit) {
		// 포 쏘는 공격
	}

	@Override
	public void move(int x, int y) {
		// 탱크가 움직이는 코딩
	}
	
}

// SCV
// 수리 가능 : Repairable 인터페이스를 구현한 클래스 (Tank, SCV)
// 수리 불가능 : Repairable 인터페이스 X(Fighter)

class SCV extends GroundUnit implements Repairable {
	
	SCV() {	}
	
	// 건물 짓기 메소드
	// 다른 유닛 수리하는 메소드
	void repair(Repairable unit) { // Repairable unit : 매개변수 다형성
		
		if(unit instanceof Tank) {
			// 탱크 수리 코딩
		} else if(unit instanceof SCV) {
			// SCV 수리 코딩
		} else if(unit instanceof DropShip) {
			// 수송선 수리 코딩
		}
		
	}
}

// 수송선 : 탱크, 군인, 무기 등등을 수송
class DropShip extends AirUnit implements Fightable, Repairable {

	@Override
	public void attack(Unit unit) {
		// 수송선이 공격
	}

	@Override
	public void move(int x, int y) {
		// 수송선 움직임
	}
	
}