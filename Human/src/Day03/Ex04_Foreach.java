package Day03;

public class Ex04_Foreach {

	public static void main(String[] args) {
		String []week = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
		for (int i = 0; i < week.length; i++) {     //i++ >> i+=2로 조건 추가시 해당 조건에 맞게 가능(조건 반복은 for만가능)
																// foreach는 단순 전체 반복(조건 걸수없음) 
			System.out.print(week[i] + " ");
			
		}
		System.out.println();
		
		//foreach : ctrl + space
		// foreach 문
		// - 배열 또는 컬렉션의 모든 요소를 순서대로 반복하는 반복문
		// for( 자료형 요소명 : 배열) { }
		for (String day : week) {
			System.out.print(day + " ");	 		// day : week[i]
		}
		System.out.println();
		}
	}

