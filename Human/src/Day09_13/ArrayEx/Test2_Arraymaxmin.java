package Day09_13.ArrayEx;

import java.util.Scanner;

public class Test2_Arraymaxmin {
	
	// 값입력:
			// 300
			// 200
			// 600
			// 790
			// 900
			// Maximum Value : 900
			// Minimum Value : 200
			// 
	
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("배열크기 : ");
	 
	 
	 int N = sc.nextInt();
	  
	 
	 int arr[] = new int[N];	
		
		System.out.println("값 : ");
		
		for (int i = 0; i < arr.length; i++) 
			arr[i] = sc.nextInt();
			
	 int max1 = arr[0];
	 int min1 = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if(max1 < arr[i])
				max1 = arr[i];
			if(min1 > arr[i])
				min1 = arr[i];
		}
		System.out.println("max : "+max1 + ", min : " + min1);
}
		
	
}
