package Day15.다형성_61_학생클래스;

public class Person {

	protected String gender;
	protected int age;
	public Person() {
		System.out.println("Person 생성자 호출");
		
	}
	public String getGender() {
		return gender;
			}
	public int getAge() {
		return age;
	}
}
