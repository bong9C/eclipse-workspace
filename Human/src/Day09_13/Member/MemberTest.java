package Day09_13.Member;

import java.util.Scanner;

public class MemberTest {
	// 속성, 메소드
	public static void main(String[]args) {
		
		//객체생성
		/* Member member = new Member();		// 객체는 유일성(하나밖에 없다!/한번만쓰기!)
//		클래스    객체		번지	생성자메소드(멤버변수를 초기화한다.) 
						// 모든 클래스는 생성자메소드가 있다.
		System.out.println("1번:"+member.toString());		//Heap 할당 //toString = 오버라이딩 되는것 
//		member.name="java";				// 은닉화(private 선언한 id는
//										// member.id로 접근 불가
//		System.out.println(member.name); // 중괄호 안에 있는 건 무조건 지역변수
		String name= "자바";		
		System.out.println(name);
		// //////////////////////////////////
		member.setId("자바...");				// 자바를 ATM 입금
		member.setPwd("자바");
		System.out.println("2번:"+member);	// toString 생략가능 
		String id = member.getId();			// 자바만큼 ATM 출금가능 
		System.out.println(id);				// 자바만큼 출금했다는 표시(통장 출금내역)
		Member member2= new Member("java","java"); //set메소드와 같다(멤버ex의 String id, pw에 데이터가 들어감.) 인터넷뱅킹으로 이미 입금된 상태

		String id2 = member2.getId();			  //  출금가능
		String pwd2 = member2.getPwd();			  // set메소드 this가 set소드 안에 있음으로 >출력시엔 get
		System.out.println("id="+id2+",pwd="+pwd2);				  //  출금내역  표시 
		System.out.printf("id=%10s,pwd=%10s\n\n",id2,pwd2);		//%10 앞에공백 10칸/ %-10 뒤에 공백 10칸
		///////////////////////////////////////////////
		Address address = new Address("서울","영등포구","영등");
		Member mem = new Member("javamem","javamem","javamem",address);
		System.out.println("주소 :"+ address);
		//System.out.println("주소 :"+ address.toString());			// 클래스안에 toSting이 있으면
		System.out.println("Member" +mem);
	*/
		//키보드로부터 id,pwd를 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("ID:");
		String id=sc.next();
		System.out.print("PWD:");
		String pwd=sc.next();
		// 입력후 Member클래스의 생성자 메소드(==setXXX())로 전달하여 출력한다.
		Member member = new Member(id,pwd);		//생성자 메소드에 전달 > 저장후 get메소드를 불러와라■ 값을 생성하자마자 인스턴스를 만들어버린다
		String id2 = member.getId();	//member.getId()는 String id2="java" 와 동일
		String pwd2 = member.getPwd();
		System.out.println("ID:"+id2+" PWD:"+pwd2);
		// 입력 값을 set메소드(setXXX())로 전달하여 출력하시오.
		member.setId(id2);				//객체(member)는 메소드를 사용할수있다(객체는 반드시 동작한다)
		member.setPwd(pwd2);			// member라는 객체 안에 id와 pwd가 있다
		String id3=member.getId();
		String pwd3=member.getPwd();
		System.out.println("ID:"+id3+" PWD:"+pwd3);
		//값 변경
		member.setId("computer");
		System.out.println("ID:"+member.getId()+" PWD:"+pwd3);
		//값 조회
		id3=member.getId();
		pwd3=member.getPwd();
		System.out.println("ID:"+id3+" PWD:"+pwd3);
	}
}
