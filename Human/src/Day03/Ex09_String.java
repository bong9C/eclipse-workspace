package Day03;

public class Ex09_String {

	public static void main(String[] args) {
		// String 은 참조타입
		String a = "Hello";
		String b = "Java";
		String c = "Hello";
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java");
		
		System.out.println(a == c);				//t
		System.out.println(a == b);				//f (객체를 생성하면 다른 공간의 메모리를 만들어 레퍼런스가 달라지기 때문)
		System.out.println(a.equals(d));		//t

		System.out.println(b == e);				//f (레퍼런스가 다르다!)
		System.out.println(e == f);				//f (다른 메모리 공간에 생성이 되기 때문)
		System.out.println(e.equals(f));		//t 
		
		// ==			: 해당 변수의 레퍼런스(참조정보)를 비교
		// equals() 	: 해당 변수의 문자열 자체를 비교
		
	}
}
