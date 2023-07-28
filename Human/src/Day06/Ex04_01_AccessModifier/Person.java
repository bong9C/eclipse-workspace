package Day06.Ex04_01_AccessModifier;

public class Person {
	
	
	// 접근지정자 테스트 (외부에서 접근할거임 ! Ex04_2번의 클래스에서 접근할예정)
	
	// 이름, 키, 나이, 체중
	public String name;			// public
	protected int height;		// protected 
								// : 같은 패키지 이거나, 아니면 다른패키지인경우 상속받은경우 접근가능
	int age;					// default (안쓴게 기본)
								// : 같은 패키지에서만 접근가능
	private int weight;			// private
								// : 현재 클래스에서만 접근가능

	
	
	// 생성자
	public Person() {
	}


	// 매개변수 생성자

	public Person(String name, int height, int age, int weight) {
		this.name = name;
		this.height = height;
		this.age = age;
		this.weight = weight;
	}

	// getter, setter

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHeight() {
		return height;
	}


	public void setHright(int hright) {
		this.height = height;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	// toSring
	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", age=" + age + ", weight=" + weight + "]";
	}
	
	
	
	
	
}
