package days14;

public interface Engine {
	
	int speed = 0;
	void moreFuel(int fuel);
	void lessFuel(int fuel);
	void stop();
	
}