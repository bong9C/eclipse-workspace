package Day16.교재_314_필드다형성_Tire;

public class KumhoTire extends Tire{

	//필드
	
	//생성자
	public KumhoTire(String location, int maxRotation) {
		super(location,maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulateRotation;
		if(accumulateRotation<maxRotation) {
			System.out.println(location+"KumhoTire 수명: "+(maxRotation-accumulateRotation)+"회");
			return true;
		}else {
			System.out.println("*** "+ location + " KumhoTire 펑크 ***");
			return false;
		}
	}
	
}
