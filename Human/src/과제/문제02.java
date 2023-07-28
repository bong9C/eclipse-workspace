package 과제;

import java.util.Iterator;
import java.util.Scanner;

// 1+3+5+7+9=??
// 2+4+6+8+10=??
// 1 2 3 6

public class 문제02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		
		// 홀수 반복
		for (int i = 1; i <= N; i+=2) {
			sum1 += i;
			System.out.print(i);
			if( i == N || i+1 ==N   )
				System.out.print("=");
			else
				System.out.print("+");
			}
		System.out.println(sum1);
		
		// 짝수 반복
		
	
		for (int i = 2; i <= N; i+=2) {
			sum2 += i;
			System.out.print(i);
			if( i == N || i+1 ==N )
				System.out.print("=");
			else
			System.out.print("+");
			}
		System.out.println(sum2);
		
		// 약수
		for (int i = 1; i <= N; i++) {
			if( N % i == 0 )
				System.out.print(i+ " ");
		}
		
	}
}


	
	
	
	
	

