package Day14.상속_Student;

public class Student {
	
	public Student(String name, int grade) { //생성자 메소드  //set을 직접 입력해주거나..
		this.name = name;
		this.grade = grade;
	}
	String name;
	int grade;
	
	public Student() {
		System.out.println("Student 부모 생성자 호출");
	}
	public void setName(String name){
		this.name = name;
			}
	
	public void setGrade(int grade) {
		this.grade = grade;
			}
	public String getName() {return name;}
	public int getGrade() {return grade;}
	
	public String getStudInfo() { // 학생의 신상정보를 출력해주는 메소드
		System.out.println("Student 클래스의 getStudlnfo() 호출");
		return "이름 : " +name + ", 학년 : " + grade;
	}
	
	
}
