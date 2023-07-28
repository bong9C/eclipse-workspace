package Day06.Ex04_02_AccessModifier;

import Day06.Ex04_01_AccessModifier.Person;

public class Manager {
	
	public static void main(String[] args) {
		Student student = new Student();
		student.defaultSetting();
		System.out.println("name : "+ student.name);
		System.out.println("height : "+ student.getHeight()); 
		// 같은패키지도 아니고 다른패키지이지만 매니저는 펄슨을 상속받지 않아 접근 불가능)
		System.out.println("age : "+ student.getAge());
		System.out.println("weight : "+ student.getWeight());
		
		System.out.println();
		Person person = new Person("김휴먼", 175, 20, 60);
		System.out.println("name : " + person.name);
		System.out.println("height : " + person.getHeight());
		System.out.println("age : " + person.getAge());
		System.out.println("weight : " + person.getWeight());
		
		System.out.println();
	}

}
