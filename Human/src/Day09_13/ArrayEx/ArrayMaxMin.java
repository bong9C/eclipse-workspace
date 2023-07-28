package Day09_13.ArrayEx;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayMaxMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[5];
		
		
		System.out.println("값입력..");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();			// 메모리에 저장하려면 저장하려는 공간이름이 들어가야한다.
		}
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]>max) max=arr[i];
				
			if (arr[i]<min)	min=arr[i];
				
		}
		System.out.printf("max = " + max + ",\nmin = "+ min);
	}
}
