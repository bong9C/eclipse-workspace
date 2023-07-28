package Day14.상속_Person에러;

public class Student extends Person {
//	protected String name;
//	protected int grade;
//	
	
	
	public Student (String name, int grade) {
		super(name, grade);
		System.out.println("Student 부모 생성자 호출");
	}
	
//	public String getName() {
//		return name;
//	}
//	public int getGrade() {
//		return grade;
//	}
	
	public String getStudInfo(String name, int grade) {
		System.out.println("Student 클래스의 getInfo()입니다.");
		return "이름은: "+name+ ", 학년은: "+grade;
	}

}
