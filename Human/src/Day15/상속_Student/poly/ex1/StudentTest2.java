package Day15.상속_Student.poly.ex1;

public class StudentTest2 {

	public static void main(String[] args) {
		Student s= new University("홍길동",3,20); //다운캐스팅 예시
		
//		System.out.println((s.getCourses());  
//		상속받은 자식정보에만 있는걸 가져오면 접근 X
//		(오버라이딩 되지 않은 값을 불러오니, 자료타입이 다르니..)
//		오버라이딩사용한건 자식꺼를 접근한다.(부모꺼를 재정의했다.)
		University u = (University)s;
		System.out.println("학점은>>"+u.getCourses()+"점");
}
}
