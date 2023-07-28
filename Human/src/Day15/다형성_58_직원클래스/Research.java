package Day15.다형성_58_직원클래스;

public class Research extends Employee{

	private String position;
	public Research(String name, String position) {
		super.name=name;
		this.position=position;  	// 생성된 매개변수는 1개
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position=position;
	}
}
