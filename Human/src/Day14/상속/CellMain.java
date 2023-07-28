package Day14.상속;

public class CellMain {
	
	public static void main(String[] args) {
		// 객체생성은 자식을 가지고 객체생성해야함(부모클래스는 자식이 상속받았기때문)
		DMBCellPhone dmb = new DMBCellPhone();  
		dmb.powerOn();  //오버라이딩 = 부모의 메소드를 상속시에 자식쪽에 받게끔 재정의한다.
		dmb.turnOnDmb(); //값이 변경되기전이라서 0번으로 뜸
		dmb.changeChannelDMb(100);
		dmb.turnOnDmb(); // 값이 변경된 후라서 100번으로 뜸
		
	}

}
