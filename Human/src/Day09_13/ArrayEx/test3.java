package Day09_13.ArrayEx;

import java.util.Iterator;
import java.util.Scanner;

public class test3 {
	// for(int i=0;,i<arr.length;i++)
	//======================================================
	// 10개의 값을 입력해주세요.
	// 1번째 값: 56
	// 2번째 값 : 87
	// 3번째 값 : 12
	// 4번째 값 : 32
	// 5번째 값 : 53
	// 6번째 값 : 89
	// 7번째 값 : 90
	// 8번째 값 : 92
	// 9번째 값 : 96
	// 10번째 값 : 100
	// ***********************************************
	// Result 
	// 합산 : 707 / 평균 : 70 / 최대값: 100
	// 56 87 12 32 53 89 90 92 96 100
	// ================================================
	// 100 96 92 90 89 87 56 53 32 12
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("배열의 크기를 지정하시오");
//		int N = sc.nextInt();
		
		int[] arr = new int[10];
		int max=0,avg=0,sum=0;
		
		System.out.println("=======================================");
		System.out.println("10개의 값을 입력해주세요");
//		System.out.println(N+"개의 값을 입력해주세요");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 값 : ");
			arr[i] = sc.nextInt();
			sum+=arr[i]; // 합
			if(max<arr[i])
				max=arr[i];
		}
	
		avg = sum/arr.length;
		
		
		System.out.println("\n**********************************\nResult");
		System.out.println("합산 : "+ sum +"/ 평균 : " + avg + "/ 최댓값 :"+max);
		
		for (int i = 0; i < arr.length; i++) 
			System.out.print(arr[i]+ "\t");
		
		System.out.println("\n=======================================");
		
		System.out.print("오름차순 : ");
		// 오름차순
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}	
			}
			System.out.print(arr[i]+"\t");
		}
	System.out.println();
		
	System.out.print("내림차순 : ");
	// 내림차순
		int temp1 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i]<arr[j]) {
					temp1 = arr[i];
					arr[i] = arr[j];
					arr[j] = temp1;
				}	
			}
			System.out.print(arr[i]+"\t");
		}

		}
		
	}


