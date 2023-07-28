package Day17;

import java.util.Scanner;

public class ExceptionArray4 {

	public static void main(String[] args) {
	 int[]num=new int[2];
	 try {
	 num[0] = 100;
	 num[1] = 200;
//	 num[2] = 300;		// 이걸 주석달거나
	 num[1] = 100/0;	// 이걸 주석달면 둘중 하나만 달면 각각의 예외내용이 나옴
	 System.out.println("Hello~~~");
	 }catch(ArrayIndexOutOfBoundsException e) {
//		 System.out.println("예외: " + e.getMessage());
		 e.printStackTrace();
	 }catch(Exception e) {
	 	e.printStackTrace();
	 }
	 
	 System.out.println("프로그램 종료");
		
	}
	
}
