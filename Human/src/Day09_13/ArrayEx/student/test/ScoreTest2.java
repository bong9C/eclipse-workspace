package Day09_13.ArrayEx.student.test;

public class ScoreTest2 {
 public static void main(String[] args) {
	 StudentScore ss = new StudentScore();   // 클래스가 다른 클래스꺼를 가져올때 인스턴스는 만들어야 접근가능!! 
	 ss.inputScore();	// 입력호출
	 ss.sum(); // 합계호출
		System.out.println(ss);  //to 스트링이 없으면 주소가 나오고
								// to 스트링이 있으면 오버라이딩에 넣어둔 양식이출력
}
}

