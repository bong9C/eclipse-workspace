package Day09_13.ArrayEx.student.test;

import java.util.Scanner;

public abstract class ScoreTests {

	static Scanner sc = new Scanner(System.in);//전역 변수처럼 사용한다.
	
	public static void main(String[] args) {
		
		//과목점수 입력 				//속성 : 국어, 수학
		System.out.print("국어:");
//		int kor=sc.nextInt();
		int kor= intValue();
		System.out.print("수학:");
//		int math=sc.nextInt();
		int math= intValue();
		scorePrint(kor,math); //1번
		// 점수 합계 계산
		sum(kor,math);
		int sum=sumReturn(kor,math);
		System.out.println("main()메소드에 있는 sum()="+sum);
		
		
	}
		
		
//		inputScore(); // 2번
	// 과목 점수 출력
	// scorePrint();	
	//	int sum=kor+math;
	// System.out.println("합계:"+sum);
	
	public static void inputScore() { // ()가 있는건 동작하는것을 의미, {}
		System.out.print("국어:");
		int kor=sc.nextInt();
		System.out.print("수학:");
		int math=sc.nextInt();
		//scorePrint(kor,math);
	}
		public static void scorePrint(int kor,int math) {
		System.out.println("국어 :"+kor +"\n수학 :" +math);
		System.out.println("합계(scorePrint()메소드="+(kor+math));
	}
	// 입력 객체 sc가 중복이 발생하기 때문에 입력 메소드를 작성한다.
		public static int intValue() {				
			Scanner sc = new Scanner(System.in);
			return sc.nextInt();
		}
		public static void sum(int kor, int math) {
			int sum=kor+math;
		System.out.println("합계(sum()메소드)="+sum);
		}
		public static int sumReturn(int kor,int math) {
			return kor+math;
		}
}
	
