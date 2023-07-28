package Day09_13.Member;

import java.util.Iterator;

// 외부에서 요청 처리
public class MemberService {
	final int MAX_CNT = 5;
	Member[] member = new Member[MAX_CNT];
	int cnt = 0; // cnt라는 속성을 쓰기때문에 inputData는 static을 쓰지 않음

	public void inputData() {
		System.out.println("회원입력");
		System.out.println("ID:");
		String id = InputScanner.sc.next();
		System.out.println("PWD:");
		String pwd = InputScanner.sc.next();
		System.out.println("EMAIL:");
		String email = InputScanner.sc.next();
		// 입력한 내용을 객체로 생성후 배열에 저장한다

		member[cnt++] = new Member(id, pwd, email); 
		System.out.println("데이터 입력이 완료되었습니다.");

	}

	public void searchData() {
		// 이름으로 검색한다.
		// 검색 : compareTo() 메소드 사용한다. (compareto = 검색한다)
		// 삭제,변경 사용시 자료를 검색한다
		// 공통 메소드를 작성(search(Strin name);)
		System.out.println("데이터 검색합니다.");
		System.out.println("ID:");
		String id = InputScanner.sc.next();  // nextLine으로 넣으면 다음줄로 넘어가 버려서 값을 입력못함
		int index = search(id); // 위치를 가져오는것 // search는 메소드명일뿐 // index : 몇번째 ?
		if (index < 0) // 배열의 인덱스가 정수임으로 배열에 데이터가 없으면 0임
			System.out.println("데이터가 없음"); // 0보다 작으면 데이터 없는것
		else {
			// 해당 검색 데이터를 출력한다.
//			member[index].printMember();
			System.out.println(member[index].toString()); // 나는 고집부리며 tostring을 쓰고말고거야! 하면! 이렇게도 사용가능! 
			System.out.println("데이터 검색 완료"); // 0보다 같거나 크면
		//
		}
	}

	private int search(String id) {  // 공개안하고 다른 외부인이 쓸필요가 없다.
			//매개변수 id과 배열에 있는 이름 비교
			for(int i =0;i<cnt;i++) {  // cnt는 입력 저장된 배열값만 불러오게 해줌
			Member mem = member[i];  //객체타입 (해당 주소에 가면 입력한 값을 볼수있다)/해당번지를 찾았어! 그 번지가 mem이 가지고있다.
			if(id.compareTo(mem.getId())==0)   // id : 매개변수 / 배열에 들어있는 id값을 불러온다
			  return i;   // 데이터가 있는경우 [i]번째로 ! 출력!!
			}
			return -1;  // 해당 위치의 값은 없으면 -1
	}

	public void deleteData() {    // static 있으면 search 오류남 ! 
		System.out.println("데이터를 삭제합니다.");
		System.out.print("ID :");
		String id=InputScanner.sc.next();
		int index = search(id);  // id로 검색 > id의 값이 있는 위치값(객체)
		if(index<0)
			System.out.println("데이터가 없음");
		else {
			for (int i = 0; i < cnt; i++) {
				member[i] = member[i+1];	
			}
			cnt--;  		// null인 칸을 없앰!!
//			member[i] = member[i+1];	
//		}
//		cnt--;  		// null인 칸을 없앰!!
		}
		
			System.out.println("삭제가 완료되었습니다.");
		}
		
		

	public void upData() {
		System.out.println("데이터를 수정합니다.");
		System.out.println("ID :");
		String id=InputScanner.sc.next();
		int index = search(id);
		if(index<0)
			System.out.println("데이터가 없음");
		else {
						
			System.out.println("회원입력");
			System.out.println("ID:");
			String id1 = InputScanner.sc.next();
			System.out.println("PWD:");
			String pwd = InputScanner.sc.next();
			System.out.println("EMAIL:");
			String email = InputScanner.sc.next();

			member[cnt++] = new Member(id1, pwd, email); 
			System.out.println("데이터 수정이 완료되었습니다.");
			
		}

	}

	public void totalData() {
		System.out.println("#회원 관리 목록");
		
		for (int i = 0; i < cnt; i++) 
			System.out.println(member[i]);
		}
	}
