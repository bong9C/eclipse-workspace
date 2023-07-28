package Day14.상속_Super;

public class University extends Student {
	private int courses;
	public University() {
		super();
		System.out.println("University 생성자 호출");
		super.name=name;
		super.grade=grade;
	}
	public int getCourses() {
		return courses;
	}
	
	public void setCourses(int courses) {
		this.courses = courses;
	}
	public String getStudInfo() {
		System.out.println("University 클래스의 getStudeInfo() 호출");
	return "이름은: " + name+ ", 학년은: " + grade+", 학점: "+ getCourses();
	}
}
