package Day09_13.ArrayEx.student.test;

import java.util.Scanner;

public class StudentScore {
	private int kor,math,sum;

	public int getKor() {
		return kor;
	}



	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
//	@Override
//	public String toString() {
//		return "StudentScore [kor=" + kor + ", math=" + math + ", sum=" + sum + "]";
//	}
	@Override
	public String toString() {
		return "StudentScore [kor=" + getKor() + ", math=" + getMath() + ", sum=" + getSum() + "]";
	}
	public void inputScore() {
		System.out.print("국어:");
		kor= intValue();
		System.out.print("수학:");
		math= intValue();
	}
//	public void sum() {
//		sum = this.kor+this.math;   // int sum(지역변수) (속성선언 안되었음?)
//	//	System.out.println("합계="+sum);
//	}
//	
//}
	
	public int sum() {
	sum = this.kor+this.math;   // int sum(지역변수) (속성선언 안되었음?)
	return sum;

	}

	public int intValue() {				
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	

	}
	
