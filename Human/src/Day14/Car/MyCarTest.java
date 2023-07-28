package Day14.Car;

public class MyCarTest {

	public static void main(String[] args) {
		Car myCar = new Car("스파크", "검은색", 995, 60); // 인스턴스는 생성과 동시에 할 수 있다
//		myCar = new Car();   			// 동시에 안하면 주석처럼 써야함
//		myCar.setCarName("스파크");
//		myCar.setCarColor("화이트");
//		myCar.setCarSize(995);
//		myCar.setVelocity(60);
		
		String carName= myCar.getCarName();
		String carColor= myCar.getCarColor();
		int carSize=myCar.getCarSize();
		int velocity=myCar.getVelocity();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedDown();
		velocity = myCar.getVelocity();
		
		
		// toString을 사용한경우 아래내용처럼 하나하나 입력해야함
//		System.out.println("내 차 정보 출력");
//		System.out.println("차이름 : "+carName+", 색상 :"+carColor+", 배기량 : "+carSize+", 현재 속도 : "+ velocity + "입니다.");
		
		// toString을 사용한경우 아래와 같이 출력가능
		System.out.println(myCar);
	}
}
