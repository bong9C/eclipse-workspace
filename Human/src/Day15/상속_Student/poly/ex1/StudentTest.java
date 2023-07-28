package Day15.상속_Student.poly.ex1;

public class StudentTest {

	public static void main(String[] args) { //업캐스팅 예시(상속은 기본적으로 업캐스팅)
		//College c= new College();
		Student s= new University("박지성",2,20);
		System.out.println(s.getStudInfo());
}
}
