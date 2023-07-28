package Day17;

import java.util.Scanner;

public class ExceptionEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		try {
		System.out.print("번호 : ");
		num = sc.nextInt();  // 여기서 예외 발생
	}catch(Exception e) {
		System.out.println("예외: "+e.getMessage());
		
	}System.out.println(num);
	
		System.out.println("프로그램 종료");
	}
	
}
