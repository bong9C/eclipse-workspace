package Day19.Collectionex;

import java.util.ArrayList;

public class EmployeeTest {
	public static void main(String[] args) {
		Manager m1=new Manager("자바", new MyDate(2000,01,01), 50000, "관리자", 2233);
		Manager m2=new Manager("자바2", new MyDate(2000,01,01), 50000, "관리자", 2233);
		//EmployeeService service = new EmployeeService();
		//싱글톤 객체를 호출
		EmployeeService service=EmployeeService.getInstance();
		service.AddEmployee(m1);
		service.AddEmployee(m1);
		service.AddEmployee(m2);
		//전부 출력 
		service.getAllEmployee();
		//사원 삭제 
		service.deleteEmployee("자바");
		//사원조회
		ArrayList<Employee> list=service.findEmployee("자바2");
		System.out.println(list);
		
		
	}

}

