package Day09_13.ArrayEx.student;


public class ddd {
	
	
	public static void main(String[] args) {
		int[] arr = {87,68,94,100,83,78,85,91,76,87};
		String[] num = new String[11];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = (i*10) + "-" + (i*10+9) + ":";
		}
		num[10] = "100 : "; 
		
		int N=0;
		
//		System.out.print("70-79 : ");
		
		for (int i = 0; i <= 100; i+=10) {
//			if(arr[i]>=70 && arr[i]<79) {
//				arr[i] = N;
//				N = arr.length/10;
			
			for (int j = 0; j < 10; j++) {
				if(arr[j] >= i && arr[j] <= i+9) {
					num[i/10] += "*";
		}
			
		}
		}

		for (int i = 0; i < 11; i++) {
			System.out.println(num[i]);
		}
		}
}
		
