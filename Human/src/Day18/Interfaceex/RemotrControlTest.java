package Day18.Interfaceex;

import Day18.Interfaceex.Television;

public class RemotrControlTest {
	
	public static void main(String[] args) {
		/*RemoteControl rc=new Television();
		System.out.println(rc);
		rc.turnOn();
		rc.setVolume(-100);
		Television tv =(Television)rc;//다운캐스팅
		
		tv.print();
		rc=new Audio();
		System.out.println(rc);
		Audio au=(Audio)rc;
		au.amp();
		
		rc=new SmartTelevision();
		System.out.println(rc);
		rc.turnOn();
		rc.setVolume(-100);
//		rc.search(null);
		SmartTelevision stv =(SmartTelevision)rc;//다운캐스팅
		stv.search(null);
		
		ISearchable is = new SmartTelevision(); // ISearchable 란 인스턴스를 생성. 
		is.search(null); // 이렇게 하면 굳이 다운캐스팅을 할 필요가 없음. 
	}
		 /*Television tv =new Television(); //객체 생성 
		
		tv.turnOn();
		tv.turnOff();
		tv.setMute(true);
		tv.setVolume(5);
	}
	*/
		
		RemoteControl rc=null;
		rc=new Television();
		rc.setMute(true);
		
		rc= new Audio();
		rc.setMute(true);
		
	}
}
//인터페이스는 자체적으로 인터페이스(객체)를 생성 할 수 없다. 상속을 통해서만 구현 된다. 