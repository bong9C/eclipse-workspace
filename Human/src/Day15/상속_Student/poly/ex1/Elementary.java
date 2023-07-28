package Day15.상속_Student.poly.ex1;

public class Elementary extends Student{

	//생성자
	public Elementary(String name, int grade, int point) {
		super.name=name;
		super.grade=grade;
	}
	public Elementary(String name, int grade) {
		super.name=name;
		super.grade=grade;
	}
	public Elementary() {
		this("이순신",2);
	}
}
