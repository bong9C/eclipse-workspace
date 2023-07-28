package Day17;

import java.util.Scanner;

public class ExceptionArray2 {

	public static void main(String[] args) {
	 int[]num=new int[2];
	 try {
	 num[0] = 1;
	 num[1] = 2;
	 num[2] = 3;
	 }catch(Exception e) {
		 System.out.println("예외: " + e.getMessage());
		 }
	 
	 System.out.println("프로그램 종료");
		
	}
	
}
