package Day18.Interfaceex;

public interface RemoteControl {
	int MAX_VOLUME=10;
	int MIN_VOLUME=0;
	//추상메소드: 구현되지 않은 메소드가 ({}가 없다.)
	public void turnOn();
	void turnOff();
	void setVolume(int volume);

	default void setMute(boolean mute) {
		if(mute)
			System.out.println("무음처리함");
		else
			System.out.println("무음처리해제함");
	} // 디폴트 메소드 {} 가 있음, 구현 된 것 
	static void changBattery() {
		System.out.println("건전지를 교체합니다.");
	}
}