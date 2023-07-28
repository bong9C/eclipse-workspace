package Day15.상속_Student.poly.ex2;

public class Student {
	
	public Student(String name, int grade) { //생성자 메소드  //set을 직접 입력해주거나..
		this.name = name;
		this.grade = grade;
	}
	String name;
	int grade;
	
	public Student() {
//		System.out.println("Student 부모 생성자 호출");
	}
	public void setName(String name){
		this.name = name;
			}
	
	public void setGrade(int grade) {
		this.grade = grade;
			}
	public String getName() {return name;}
	public int getGrade() {return grade;}
	
	public String getStudInfo() { // 학생의 신상정보를 출력해주는 메소드
		System.out.println("Student 클래스의 getStudlnfo() 호출");
		return "이름 : " +name + ", 학년 : " + grade;
	}
	
//	//상속을 받는 객체를 호출(University uni)
//	public void calcScore (University uni) {	// 이렇게도 가능하지만 
//		System.out.println("시험점수 구하기");		//그러면 객체별로 하나하나  
//												//다 써야함!! 코드 넘 많아
//	}
//	//상속을 받는 객체를 호출
//	public void calcScore (Elementary e) {
//		System.out.println("시험점수 구하기다");
		
//	}
	
//	
//	public void calcScore (Student st) {  // 객체를 부모이름으로 호출해야 ! 더 간단히 코드를 사용할수있졍!!
//		System.out.println("시험점수 구하기");
//}
	
	public void calcScore (Student st) {  
		if(st instanceof University)
		System.out.println("시험점수 구하기");
		else if(st instanceof Elementary)
		System.out.println("시험점수 구하기");
												// 객체가 전달해야할게 여러개이면 이렇게 써야 안전하다.
}
	
	
	
}
