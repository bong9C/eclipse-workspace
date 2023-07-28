package Day09_13.ArrayEx.student;

import java.util.Scanner;

public class Student {

//	Java Programming
//	점수:
//	배열 초기값
//	학생  1:  87
//	학생  2:  68
//	학생  3:  94
//	학생  4: 100
//	학생  5:  83
//	학생  6:  78
//	학생  7:  85
//	학생  8:  91
//	학생  9:  76
//	학생 10:  87
//
//	과목평균84.90
//	최저점수 68
//	최고점수 100
//
//	점수분포:
//	00-09: 
//	10-19: 
//	20-29: 
//	30-39: 
//	40-49: 
//	50-59: 
//	60-69: *
//	70-79: **
//	80-89: ****
//	90-99: **
//	  100: *
	// ArrayChart ac= new ArrauChart();
	// ac.displayMessage(); → java Programming
	// ▶ public void displayMessage(){
	//   System.out.println("Java Programming");
	// } 
	// ac.processGrades();
	// public void processGrades(){
	//	배열 초기값 선언
	//	학생 점수 출력
	//  평균 메소드() → getAverage()
	// getMaximum()
	// getMinimum()
	// 챠트 출력 → outputBarChart();
	// }
	
	// 입력
		
		int arr[] = {87,68,94,100,83,78,85,91,76,87};
		int sum=0;
		int avg=0;
		int max = arr[0];
		int min = arr[0];
		
			
	// 계산
	public void  Score() {
		
		
		for (int i = 0; i < arr.length; i++) {
			sum+= arr[i];
			if(max<arr[i]) max=arr[i];
			if(min>arr[i]) min=arr[i];
		}
		avg = sum/arr.length;
		System.out.println("과목평균 : "+ avg + "\n최저점수 : "+min + "\n최고점수 : "+max);
	}
	
		
	//출력
	public void PrintGrade() {
	for (int i = 0; i < arr.length; i++) {
		System.out.println("학생 "+(i+1)+" : "+ arr[i]);
		
	}
	}
		
	
	
	public static void main(String[] args) {
		Student st = new Student();					//인스턴스 생성먼저(객체. 메소드명)!!! 일단 생성하기전 객체를 먼저 파악하자!!!!
													// 학생이면 가방을 가지고 있다 교복을 입는다 몇학년이다. 정보를 가지고 있는걸 학생이라고 한다.
		st.PrintGrade();
		System.out.println("========================");
		st.Score();
		System.out.println("\n 점수분포 : ");
	}
	
}
	

	
		
		
			
		
			
		
		
		
	
