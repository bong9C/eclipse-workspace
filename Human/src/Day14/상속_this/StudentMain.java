package Day14.상속_this;

public class StudentMain {
	
	public static void main(String[] args) {
		String sinsang=null;
		int courses=0;
		
		University u = new University("java",3,22);
		University u1 = new University();
		
		sinsang=u.getStudInfo();
		courses=u.getCourses();
		System.out.println("학생정보: "+sinsang+", 학점: "+courses);
		sinsang=u1.getStudInfo();
		courses=u1.getCourses();
		System.out.println("학생정보: "+sinsang+", 학점: "+courses);
	}
	
}
