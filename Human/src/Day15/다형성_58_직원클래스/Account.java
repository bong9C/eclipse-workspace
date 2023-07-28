package Day15.다형성_58_직원클래스;

public class Account extends Employee {
	
	public Account(String name, String job) {
		super.name=name;					// protect를 썼기때문에 
		super.job=job;						// 생성자메소드를 쓰지않아도
											// 사용가능 생성자 메소드를 대체하여 super.변수명 = 으로 하면됨
	}
	
	

}
