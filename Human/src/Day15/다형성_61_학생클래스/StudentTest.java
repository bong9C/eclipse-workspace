package Day15.다형성_61_학생클래스;

public class StudentTest {
	public static void main(String[] args) {
		String sinsang = null;
		Person p1= new Elementary("이순신", 2,"남",15);
		Person p2= new University("홍길동",3,22,"남",22);
		sinsang=((Student)p1).getStudInfo();
		System.out.println("학생정보: "+sinsang);// 하위 클래스의 메소드를 호출하기 위해서 다운 캐스팅한다.
		
		sinsang=((Student)p2).getStudInfo();
		int courses=((University)p2).getCourses(); //하위 클래스의 메소드를 호출하기 위해서 다운 캐스팅한다.
		System.out.println("학생정보: "+sinsang+", 학점: "+courses+"점");
		
		
	}

}
