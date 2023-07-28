package Day09_13.ArrayEx;

public class ArrayTest98 {
	public static void main(String[] args) {
		int[] num;
		int total=0;
		num=new int[10];
		
		for(int i=0; i<num.length;i++) {
			num[i]=i+1;
			
		}
		for(int i=0;i<num.length;i++)
			total+=num[i];
		
	System.out.println("num 배열 요소값들의 합은"+total);
	total=0;
	
	for (int i = 0; i < num.length; i++) {
		if(i%2==0)
			total+=num[i];
			}
	System.out.println("num 배열의 짝수 번째 요소값들의 합은"+total);
	}
	
	}
