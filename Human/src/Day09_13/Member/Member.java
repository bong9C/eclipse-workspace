package Day09_13.Member;
// dto(data transfer objec), vo(value object)
public class Member {				

//	private String		// 가장 폐쇄적이다.
//	protected String	// 상속 시 부모의 멤버변수
//	public String  // 접근 범위가 가장 큼
	private int memberNo;					 	// id, pwd, name,email 한번에 전달
	private String id;					 	// id, pwd, name,email 한번에 전달
	private String pwd;			
	private String name;		
	private String email;
	
 
	public Member() {						//오버로딩(Member 여러번 사용가능) //반환타입이 없다.  
//		System.out.println("생성자 메소드");		// 매개변수가 없는 기본 생성자 메소드
//		System.out.println("id="+id);			// 메소드는 매개변수 전달을 다 한다.
//		System.out.println("pwd="+pwd);
//		System.out.println("name="+name);
//		System.out.println("email="+email);
		
	}
	// 생성자메소드가 초기화 시켜준다.(객체 초기화)
	// 생성자와 메소드가 없으면 컴파일러가 초기화시켜준다.
	
	// 입력이나 저장할때는 : void  / set : 저장 
	public Member(String id,String pwd) {
		this.id=id;
		this.pwd=pwd;
	}
	
	// 데이터 타입이 다르고 갯수는 동일하더라도 에러X ex) String 위에는 2개이지만, 아래는 String,int 타입이 다른 2개로 사용가능!)

	public Member(String id,String pwd,String email) { 
	// 데이터 타입이 같으면 에러 ex) String이 2개 밑에는 3개면 쓸수 있지만 2개 2개면 못씀 
		this.id=id;
		this.pwd=pwd;
		this.email=email;
	}

	
	public void setId(String id) {		//private는 누군가를 통해서 접근
		this.id = id;
			} 
	public String getId() {
		return id;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
			}
	
	public String getPwd() {
		return pwd;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
		
//	@Override
//	public String toString() {
//		return "Member [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + "]";
//	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", email=" + email + "]";
	}
	public  void printMember() {
		System.out.println("ID:"+id);
		System.out.println("PWD:"+pwd);
		System.out.println("EMAIL:"+email);	}
	
	// 주소는 집합체
	// Member은 주소를 가진다    = 홍길동은 주소를 가지고 있다(포함관계/상속관계XX)
	// 주소 : 시 구 동 구성		  =
	
	// class Member
	// Address address;		 선언만 한것 / 언제 인스턴스를 만들거냐?     
	// 
	//	
	//	
	//	
//
//	public void setNama(String name) {
//		this.name = name;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setEmail(String email) {
//	this.email = email;
//	}
//
//	public String getEmail() {
//	return email;
//	}
//	
//	
//	

}
