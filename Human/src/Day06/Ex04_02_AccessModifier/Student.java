package Day06.Ex04_02_AccessModifier;

import Day06.Ex04_01_AccessModifier.Person;   // ctrl + shift + O

public class Student extends Person {    
	
	// 알트 +쉬프트 + s + 제너럴.... super (다 체크 후) 생성 하면 아래처럼 됨

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int hright, int age, int weight) {
		super(name, hright, age, weight);
		// TODO Auto-generated constructor stub
	}

	public void defaultSetting() {
		name = "이름없음";
		height = 160;
		// age = 20;			// default 라서 같은 패키지에서만 접근 가능
		// weight = 50;			// private 이라서 해당 클래스에서만 접근 가능
		setAge(20);
		setWeight(50);
		
	}
	
	
}
