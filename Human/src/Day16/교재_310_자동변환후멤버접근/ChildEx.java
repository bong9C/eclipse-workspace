package Day16.교재_310_자동변환후멤버접근;

public class ChildEx {

	public static void main(String[] args) {
		Child ch = new Child();
		
		
		Parent p = ch;
		p.method1();
		p.method2();
//		p.method3();
	
		
		

	}
}
