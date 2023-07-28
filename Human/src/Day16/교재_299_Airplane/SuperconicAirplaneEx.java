package Day16.교재_299_Airplane;

public class SuperconicAirplaneEx {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode= SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode= SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
		
	}
}
