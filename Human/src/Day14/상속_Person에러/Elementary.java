package Day14.상속_Person에러;

public class Elementary extends Student {
	public Elementary(String name, int grade) {
		super(name,grade);
	}
	public Elementary(String name, int grade, String gender, int age) {
		super(name,grade);
		System.out.println("인자 4개인 Elementary 생성자 호출");
//		name = name;
//		grade = grade;
		this.gender=gender;
		this.age=age;
	}
}
