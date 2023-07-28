package Day16.교재_314_필드다형성_Tire;

public class HankookTire extends Tire{

	//필드
	
	//생성자
	public HankookTire(String location, int maxRotation) {
		super(location,maxRotation);
		
	}
	//메소드

	@Override
	public boolean roll() {
		++accumulateRotation;
		if(accumulateRotation<maxRotation) {
			System.out.println(location+"HankookTire 수명: "+(maxRotation-accumulateRotation)+"회");
			return true;
		}else {
			System.out.println("*** " + location+ " HankookTire 펑크 ***");
			return false;
		}
	}
	
}
