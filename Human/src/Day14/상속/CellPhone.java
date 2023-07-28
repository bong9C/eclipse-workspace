package Day14.상속;

public class CellPhone {
	
	protected String model;     //부모클래스에서 private하면 같은 클래스에서만 쓸수 있기
							  //때문에 get set으로 접근해야만 가능
								//private하면 코드가 복잡해짐 ▶ 상속시에 부모클래스의 속성을 그대로 쓰기위해 protected로 쓴다
	protected String color;	  // 
	
	void powerOn() {System.out.println("전원을 킵니다");} 
	void powerOff() {System.out.println("전원을 끕니다.");}
	void bell() {System.out.println("벨이 울립니다.");}
	

}
