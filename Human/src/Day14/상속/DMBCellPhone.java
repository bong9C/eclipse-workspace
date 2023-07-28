package Day14.상속;

public class DMBCellPhone extends CellPhone {

// 교재 p.290~
//	String model;	부모클래스에 있기 때문에 쓰지 않아야함(코드중복!)
//	String color;	상속은 코드를 줄이기 위해서임!!
	
	int channel;
	public DMBCellPhone() {
//		System.out.println(model);
//		System.out.println(color);
//		System.out.println(channel);
		
	}
	public DMBCellPhone(String model,String color,int channel) {
		this.model = model;			// 함
		this.color = color;			// 부모클래스에서 
		this.channel = channel;		//자식클래스의 것이기에 this.하면 바로 channel나와야함
		
	}
	public void powerOn() {
		System.out.println("DMB폰이 전원을 켭니다");   //오버라이딩
	}
	
	//DMB 폰의 기능
	//↓몇번 채널을 켰다.
	void turnOnDmb() {
		System.out.println("채널 : "+ channel+ "번 수신");
	}
	//↓채널변경.
	void changeChannelDMb(int ch) {
			 this.channel = ch;
			 System.out.println("채널 : " +channel+"번으로 변경됨" );
	}
	void turnOffDmb() {
		
	}
}
