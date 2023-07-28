package Day14.상속_Student;

public class StudentTest {

	public static void main(String[] args) {
		Student st = new Student();
		st.setName("자바");
		st.setGrade(6);
		
		System.out.println("부모 : "+st.getStudInfo()); //부모만 단독으로도 할 수 있음
		
		String sinsang=null;
		Elementary e = new Elementary("남지영",2);	// 단독으로 객체생성
		University u = new University("송민우",3,20);
		Student st2=new Elementary("java", 5);   // 업캐스팅 예시
		System.out.println(st2.getStudInfo());// 객체생성한걸 출력?
		
		st2=new University("javajava", 4, 20);
		System.out.println(st2.getStudInfo());
		
		sinsang = e.getStudInfo();		
		System.out.println("학생 정보: " + sinsang);
		sinsang = u.getStudInfo();
		System.out.println("학생 정보: "+sinsang+", 수강학점: "+u.getCourses()+"점");
	}
}
