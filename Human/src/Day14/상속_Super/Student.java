package Day14.상속_Super;

public class Student {
	protected String name;
	protected int grade;
	public Student() {
		System.out.println("Student 부모 생성자 호출");
	}
	
	public Student(String name, int grade) {
		this.name= name;
		this.grade=grade;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public String getStudInfo() {
		System.out.println("Student 클래스의 getStudeInfo() 호출");
	return "이름은: " + name+ ", 학년은:" + grade;
	}

}
