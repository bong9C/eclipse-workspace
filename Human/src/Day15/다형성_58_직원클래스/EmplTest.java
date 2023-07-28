package Day15.다형성_58_직원클래스;

public class EmplTest {
	public static void main(String[] args) {
		Employee e= new Account("주세희", "과장");
		Employee e1= new Research("남지영", "연구원");
		e.getEmpInfo(e);
		e1.getEmpInfo(e1);
				
	}

}
