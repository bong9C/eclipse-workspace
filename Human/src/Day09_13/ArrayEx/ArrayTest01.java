package Day09_13.ArrayEx;

public class ArrayTest01 {
	public static void main(String[] args) {
//		배열 선언하기
		int[] num = new int[5];
//		메모리에 공간 5개가 만들어진 것(초기화가 자동으로 된것) // 위치에 값이 입력되기 전에는 초기화값 0이 들어간다.
		int[] values = {1,2,3,4,5,6,7,8,9,10};	// 초기값 설정하는 방법
//		char[] ch=new char[5];
		char[] ch= {'a','b','c','d','e'};
//		ch[0]='a';			// 문자는 작은 따옴표를 사용 (')
//		ch[1]='b';
//		ch[2]='c';
//		ch[3]='d';
//		ch[4]='e';
		
		for (int i=0;i<ch.length;i++) 
		System.out.println("ch["+i+"]=" + ch[i]);
		
		
		num[0]=100;		// int num1=100; 이것과 같다
		num[1]=200;		// int num2=200;     int sum=num1+num2;
//		num[1]=12.345F;	// 정수형으로 선언했는데, 실수(float)인 더 큰 데이터를 입력하니 오류!(반대의 경우에는 가능함)
		num[1]=(int)12.345F;	// num[1]이 2번 쓰여졌기때문에 데이터가 덮어쓰기되어서, 뒤에 내용이 남아서 저장됨
//		num[2]=300;		//오류 문구 : ArrayIndexOutOfBoundsException:Index 2 out of bounds for length 2
						//크기가 정해져 있기때문에 실행시, 오류뜸(new int[2];) / 3번째 인덱스공간이 없기때문
						// Exception(예외) : 사용자 부주위로 일어나는 경우
		System.out.println("num[0]=" +num[0]);
		System.out.println("num[1]=" +num[1]);
//		System.out.println("num[1]=" +num[2]);
		int sum=num[0]+num[1];
		System.out.println("합="+sum);
		int add=num[0]+100;
		int sub=num[0]-50;
		int mul=num[0]*num[1];
		System.out.println("Add="+add+",Sub="+sub+",Mul="+mul);
		
		//배열의 개수
		int len=num.length;
		System.out.println("배열의 개수:"+len);
		
		for(int i=0;i<num.length;i++) {
			System.out.println("num:"+num[i]);
		}
	}

}
