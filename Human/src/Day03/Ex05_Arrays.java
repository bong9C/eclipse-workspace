package Day03;

public class Ex05_Arrays {

	public static void main(String[] args) {

		int arr[][] = new int[2][3];

		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;

		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;

		// arr.length		: 첫번째 차원의 배열요소 개수
		// arr[i].length	: 두번째 차원의 배열요소 개수
		for (int i = 0; i < arr.length; i++) {        //arr.length = 2 이기 때문에 .. 값이 3, 6 제외하고 나옴
			for (int j = 0; j < arr[i].length; j++) {		// arr[0].length가 추가로 넣어야 두번째 어레이 렝스를 구할수있음
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
