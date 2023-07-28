package Day14.상속_Super;

public class StudentMain {
	public static void main(String[] args) {
		University u = new University();
	u.setName("java");
	u.setGrade(21);
	u.setCourses(12);
	System.out.println(u.getStudInfo());
	}

}
