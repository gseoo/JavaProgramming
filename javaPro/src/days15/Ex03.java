package days15;

import days13.Tv;

public class Ex03 {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 11;
		ctv.channelDown();
		System.out.println(ctv.channel);
		ctv.dispCaption("Hello World~");
		ctv.caption = true; // 여기서 자막 on
		ctv.dispCaption("Hi~");
	}
}

class CaptionTv extends Tv{
	boolean caption; // 자막 기능 on(t)/off(f)
	
	void dispCaption(String text) {
		if(this.caption) {
			System.out.println(text);
		}
	}
	
	
}