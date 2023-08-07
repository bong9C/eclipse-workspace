package Day18.Interfaceex;

public class SmartTelevision  implements RemoteControl,ISearchable {
	private int volume;
	@Override
	public void search(String url) {
		System.out.println("검색을 합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("스마트TV 전원을 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("스마트TV 전원을 끕니다");
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

}
