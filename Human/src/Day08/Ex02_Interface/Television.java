package Day08.Ex02_Interface;

// 인터페이스 구현 키워드 : implements
public class Television implements RemoteControl {
	// Television 빨간줄 에러 이유 ↓
	// RemoteControl을 구현하려면 무조건 오버라이딩 해줘야함!!
	
	//변수
	private int volume;				// 음량
	
	@Override
	public void turnOn() {
		System.out.println("TV 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV 전원을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {   // int volume과 this volume 을 쓴이유는 단순 구분하기위함
		// 유효성 검사
		// - 볼륨 최댓값을 넘지 못하게 지정
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		// - 볼륨 최솟값을 넘지 못하게 지정
		else if( volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	
	}

	
}
