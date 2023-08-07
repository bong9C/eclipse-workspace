package Day20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_01 {
	public static void main(String[] args) {
		
		FileReader in=null;
		int n=0;
		try {
			in = new FileReader("c:\\Windows\\system.ini");
			// in 은 filereader 객체임
			while((n=in.read())!=-1) {
				System.out.print((char)n);
			}
			// 아스키 코드를 문자로 표현 하려면 char  을 붙인다. 근데 너무 많으면 while  사용
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("해당 경로에 파일이 없음"+e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일 입력 오류:"+e.getMessage());
			e.printStackTrace();
		}
	

}
}
