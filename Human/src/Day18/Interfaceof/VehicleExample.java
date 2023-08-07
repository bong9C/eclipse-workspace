package Day18.Interfaceof;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		// vehicle.checkFare(); (X)  >> vehicle 인터페이스에는 checkfare()가 없음
		Bus bus = (Bus)vehicle;
		
		bus.run();
		bus.checkFare();
	}

}
