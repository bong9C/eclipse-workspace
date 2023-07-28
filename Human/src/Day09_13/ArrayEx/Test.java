package Day09_13.ArrayEx;

import java.util.Iterator;

public class Test {
	
	// 강사님이 내주신 문제
	// int[] arr={1,3,9,12,15}
	// 합계 : 40
	// 평균 : 8.0
	// 배열크기 10개 선언하고 배열에 값을 1씩 증가값을 대입후 출력
	//		1 2 3 4 5 6 7 8 9 10

	public static void main(String[] args) {
		int[] arr= {1,3,9,23,15};
		int total = 0;
		float avg = 0.0f;
		
		for (int i = 0; i < arr.length; i++) 
			total += arr[i];
		
		 avg = (float)total/arr.length; 
		System.out.println("합계 : " +total);
		System.out.println("평균 : " +avg);
		//////////////////////////////////////////
		int[] arr2=new int[10];
		int v=1;
		for (int i = 0; i < arr2.length; i++) 
			arr2[i]= v++;
			
		for (int i = 0; i < arr2.length; i++) 
			System.out.print(arr2[i]+"\t");
		System.out.println();
		// 값입력:
		// 300
		// 200
		// 600
		// 790
		// 900
		// Maximum Value : 900
		// Minimum Value : 200
		// 
		int arr3[ ] = {300,200,600,790,900};
		int max=arr3[0];
		int min=arr3[0];
		
		for (int i = 0; i < arr3.length; i++) {
				if(max < arr3[i])
				 max = arr3[i];
				if(min>arr3[i]) 
				 min = arr3[i];
		}
		System.out.println("max : " + max + ", min : "+ min );	
							
		
		
		
		}
								
		}
		
		

