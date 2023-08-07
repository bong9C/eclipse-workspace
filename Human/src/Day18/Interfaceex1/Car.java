package Day18.Interfaceex1;

public class Car {
	
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
	
};
	/*Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
*/
	
	void run() {
		for(Tire tire :tires) {
			tire.roll();
		}
	}
		/*frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	} 
	*/

}
