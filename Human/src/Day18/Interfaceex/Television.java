package Day18.Interfaceex;

public class Television implements RemoteControl{
	//인터페이스 상속 받을 땐 implements 사용.
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		RemoteControl.super.setMute(mute);
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME)
			this.volume=RemoteControl.MAX_VOLUME;
		else if(volume<RemoteControl.MIN_VOLUME)
			this.volume=RemoteControl.MIN_VOLUME;
		else
			this.volume=volume;
		
		System.out.println("현재TV소리 : "+this.volume);
	}
	public void print() {
		System.out.println("Television  클래스입니다. ");
	}

}
