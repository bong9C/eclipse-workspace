package Day14.상속_Student;

public class Elementary extends Student{

	//생성자
	public Elementary(String name, int grade) {
		super( name, grade);
		System.out.println("Elementary 생성자 호출");
//		name = name;		// 부모클래스에 이미 있는 데이터로 부모쪽에서 초기화해서
//		grade = grade; 		// 상속받으면 코드도 간결화됨 
	}
}
