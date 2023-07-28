package Day09_13.Member;

import java.util.Scanner;


	public class MemberMain {
		
		public static void showMenu() {
			 System.out.println("1.회원입력\n2.회원조회\n3.회원삭제\n4.회원변경\n5.전체출력\n6.종료");
			 System.out.print("메뉴선택: ");
		}
		public static void main(String[] args) {
			MemberService ms= new MemberService(); // static 안쓰면 인스턴트를 무조건 생성해줘야함
			int sel =0;				//지역변수 (중괄호 바깥으로 나올 수 없다)
			while(true) {
			
				showMenu();
				//입력받기
				sel = InputScanner.sc.nextInt();
				switch(sel) {
				case 1 : 
					ms.inputData();	// 해당 데이터는 서비스 클래스에 있음 /static일때 클래스명을 표시함! 클래스명  표시되어있으면 static!
				break;
				
				case 2 :
					System.out.println("회원조회");
					ms.searchData();
				break;
				
				case 3 : 
					ms.deleteData();
				break;
				
				case 4 : 
					ms.upData();
				break;
				
				case 5 : 
					ms.totalData();
				break;
				
				case 6:
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					
					InputScanner.sc.close();
					
				}
			}
		}
	

			
		}