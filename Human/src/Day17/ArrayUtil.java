package Day17;
//빈 클래스 먼저 생성해두고 main 작성완료 후 호출하자!
public class ArrayUtil  {

	public void call() throws Exception {
		System.out.println("call 메소드 시작");
		int[]num=new int[2];
//		try {
		num[0]= 1;
		num[1]= 2;
		num[2]= 3; //예외 발생
//		}catch(ArrayIndexOutOfBoundsException e) {  //예외내용을 알면 예외내용을 써도됨
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
		System.out.println("call 메소드 종료");
	}

}
