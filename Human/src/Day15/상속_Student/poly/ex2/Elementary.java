package Day15.상속_Student.poly.ex2;

public class Elementary extends Student{

	//생성자
	public Elementary(String name, int grade, int point) {
		System.out.println("Elementry 생성자 호출");
		super.name=name;
		super.grade=grade;
	}
	public Elementary(String name, int grade) {
		System.out.println("Elementry 생성자 호출");
		super.name=name;
		super.grade=grade;
	}
	public Elementary() {
		this("이순신",3);
		System.out.println("Elementry 생성자 호출");
	}
}
