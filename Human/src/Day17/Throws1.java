package Day17;

public class Throws1 {

	public static void main(String[] args) {
		ArrayUtil t= new ArrayUtil();
		try {
		t.call();		//최초 호출한 곳 !
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Hello");
		System.out.println("World");
	}
}
