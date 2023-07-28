package Day15.상속_Student.poly.ex2;

public class StudentTest {

	public static void main(String[] args) {
		University u = new University("홍길동",3,23);
		u.calcScore(u);
		Elementary e = new Elementary("java",3);
		e.calcScore(e);
}
}
