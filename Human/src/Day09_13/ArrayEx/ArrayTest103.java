package Day09_13.ArrayEx;

import java.util.Iterator;

public class ArrayTest103 {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		int len=num.length;
		int temp=0;
		
		System.out.println("교환전 배열 요소 값");
		for (int i = 0; i <len; i++) 
			System.out.print(num[i]+"\t");
		
		for (int i = 0; i < len/2; i++) {    // [0]~[4]까지만 반복해주면
			temp=num[i];
			num[i]=num[len-1-i];
			num[len-1-i]=temp;
					
		}
		System.out.println("\n교환후 배열 요소 값");
		for (int i = 0; i < len; i++) 
			System.out.print(num[i]+"\t");
			
	}
}
