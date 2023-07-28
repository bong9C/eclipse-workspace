package Day15.상속_Student.poly.ex2;

public class University extends Student{
	private int courses; // 학점
	
	public University(String name, int grade, int courses) {
		super();
		System.out.println("University 생성자 호출");
		super.name=name;
		super.grade=grade;
		this.courses = courses;
	}

	public University() {
		this("이순신",2,20);
	}
	public int getCourses() {
		return courses;
	}
	//overriding 메소드 (오버라이딩을 해야 자식의 메소드를 불러옴(부모꺼는 덮어버림), 이걸 안하면 부모꺼를 그대로 가져옴)
	public String getStudInfo() { // 학생의 신상정보를 출력해주는 메소드
		System.out.println("University 클래스의 getStudlnfo() 호출");
		return "이름 : " +name + ", 학년 : " + grade+", 신청학점>> "+ getCourses();
	}
}
