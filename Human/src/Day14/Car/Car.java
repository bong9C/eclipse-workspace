package Day14.Car;

public class Car {
	private String carName;
	private String carColor;
	private int carSize;
	private int velocity;
	
	
	

	public Car() {
	}

	public Car(String carName, String carColor, int carSize, int velocity) {
//		this.carName = carName;
//		this.carColor = carColor;
//		this.carSize = carSize;			/생성자 메소드 생성시, 해당 내용으로 나옴
//		this.velocity = velocity;		/이렇게 하면 set 메소드와 중복이 됨으로 아래와 같이 수정
		setCarName(carName);		
		setCarColor(carColor);
		setCarSize(carSize);
		setVelocity(velocity);
		
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public int getCarSize() {
		return carSize;
	}

	public void setCarSize(int string) {
		this.carSize = string;
	}

	public int getVelocity() {
		return velocity;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}
	
	

	@Override
	public String toString() {
		return "Car [차 이름 : " + carName + ", 색상 : " + carColor + ", 배기량 : " + carSize + "cc , 현재속도" + velocity
				+ "입니다.]";
	}

	public void speedUp() {
		velocity = velocity + 1;
			}
	
	public void speedDown() {
		velocity = velocity -1;
		if (velocity <0) {
			velocity = 0;
		}
	}
	
	public void stop() {
		velocity = 0;
						
	}
	
	public void park() {
		System.out.println("주차합니다.");
	}


		
	}


		
	
