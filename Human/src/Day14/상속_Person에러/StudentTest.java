package Day14.상속_Person에러;

import Day14.상속_Student.Student;

public class StudentTest {
	

	public static void main(String[] args) {
		String sinsang = null;
		String gender = null;
		int age=0;
		
		Elementary e = new Elementary("남지영",3,"여",28);
		sinsang=e.getStudInfo(gender, age);
		System.out.println("학생정보: "+sinsang);
		gender=e.getGender();
		age=e.getAge();
		System.out.println("학생의 성별: "+gender+", 학생의 나이: "+age);
	}

}
