package Day06.Ex05_StaticMember;

class Calculator {
	// 아래의 연산 결과를 구하는 메소드를 정의하시오.
	// 1. 절댓값
	// 2. 최댓값
	// 3. 최솟값
	
	public static int abs(int val) {
		return val > 0 ? val : -val;
	}
	
	public static int max(int arr[]) {
		int max = Integer.MIN_VALUE;		
		for (int i : arr) {
			if ( max < i) 
				 max = i;
			}
			return max;
		}
	
	
	public static int min(int arr[]) {
		int min = Integer.MAX_VALUE;
		for (int i : arr) {
			if ( min > i ) 
				 min = i;
		}
	return min;
		}
		
}

public class StaticCalculator {

	public static void main(String[] args) {
		int arr[] = {70, 90, 85, 50, 100};
		
		// 다른 클래스의 static 메소드를 호출하는 방법
		// - 클래스.메소드명() 형태로 메소드를 호출한다.
		System.out.println("abs(-123) : " + Calculator.abs(-123));
		System.out.println("max(arr) : " + Calculator.max(arr));
		System.out.println("min(arr) : " + Calculator.min(arr));
	}
}


// 구글링
//처음 max함수를 호출할때 무조건 초기값이 아닌 값이 리턴되도록 
//int의 최소값을 넣어주는겁니다.
//max는 더 큰수를 리턴하고 모든 int값은 Integer.MIN_VALUE 보다 크니까요.
