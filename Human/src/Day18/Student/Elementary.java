package Day18.Student;

public class Elementary extends Student  {
	public Elementary (String name,int grade,String teacher) {
		System.out.println("Elementary 생성자호출");
		super.name=name;
		super.grade=grade;
		super.teacher=teacher;
		
	}
	
	//상위 클래스의 추상 메서드를 반드시 구현한다.
	public String getTeacher() {
		return "담임선생님:"+super.teacher;
	}

}
