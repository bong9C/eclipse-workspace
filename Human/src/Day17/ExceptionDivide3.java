package Day17;

public class ExceptionDivide3 {
	public static void main(String[] args) {
		int num2=0;
		try {
		int num1=100;
		num2=num1/0;
//		num2=num1/10;   예외의 경우가 아님으로 예외문구 뜨지 않고 바로 실행됨
		num2=num1*100;
		}catch(ArithmeticException e) {
//			System.out.println("예외: "+ e.getMessage());
			System.out.println("0으로 나눌 수 없다.");
		}
		System.out.println(num2);
		System.out.println("프로그램 종료");
	}
}
