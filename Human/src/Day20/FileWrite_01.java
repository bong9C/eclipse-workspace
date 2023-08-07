package Day20;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWrite_01 {
	public static void main(String[] args) {
		InputStreamReader in =new InputStreamReader(System.in);//sysout 붙이면 아스키 코드값을 문자 타입으로 출력하겠다.
		FileWriter fout=null;
		int c=0; //변수 선언
		try {
			fout=new FileWriter("d:\\Temp\\test.txt"); //경로 지정을 안하면 
			while((c=in.read())!=-1)
				fout.write(c);
			in.close();
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
