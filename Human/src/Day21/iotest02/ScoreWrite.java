package Day21.iotest02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ScoreWrite {
	public static void main(String[] args) {
		int count=1;
		String scoreData="";
		String s = null;
		File file=new File("d:\\Temp\\scoreData.txt");
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter out = new PrintWriter(new FileWriter(file,false));
			do {
				System.out.println(count+ "번째 점수를 입력하세요.");
				s= in.readLine();
				if(isRealNumber(s)){ //입력한 데이터가 숫자인지를 체크한다.
					if(count !=10){
					 scoreData+=s+","; 
					}else{
					 scoreData+=s;
					}
					count++;
					 }else{
					System.out.println("숫자만 입력 가능합니다.");
					 }
					 }while (count <= 10) ;
					 
					 out.println(scoreData); 
					 in.close();
					 out.close();
					 }catch (IOException e) {
					 System.out.println("IOException");
					 }
					 System.out.println("시험점수를 파일로 출력합니다.");
					 } 
					 //입력 받은 데이터가 숫자인지를 체크하는 메소드
					 public static boolean isRealNumber(String str){
					 try{
					 Integer.parseInt(str);
					 return true;
					 }catch(NumberFormatException e){
						 
					 return false;
					 }
					 }
}