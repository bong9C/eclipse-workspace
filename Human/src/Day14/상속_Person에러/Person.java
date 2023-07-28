package Day14.상속_Person에러;

public class Person {
	String gender;
	int age;
	
	
	
	
	public Person(String gender, int age) {
		this.gender = gender;
		this.age = age;
	}


	public Person() {
		System.out.println("Person 생성자 호출");
			}
	

	public void setGender(String gender) {
		this.gender=gender;
	}
	
	public void getAge(int age) {
		this.age=age;
	}
	
	public String getGender() {
		return gender;
	}
	
	public int getAge() {
		return age;
	}
	
}
