package 연습.Day01;

import java.util.Scanner;

public class 복습 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String subject = "";
		System.out.println("과목을 선택하세요.");
		System.out.println("1.자바 2.JSP 3.AI 4.스프링");
		System.out.println("과목선택 : ");
		int num = sc.nextInt();

		if (num >= 1 && num <= 4) {

			if (num == 1)
				subject = "자바";
			else if (num == 2)
				subject = "JSP";
			else if (num == 3)
				subject = "AI";
			else if (num == 4)
				subject = "스프링";
		} else {
			System.out.println("과목은 1~4까지 선택");
		return;
	}
		System.out.println("과목=" + subject);
	}

}
