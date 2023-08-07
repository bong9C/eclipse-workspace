/*바이너리 파일에서 읽기 위해: FileInputStream 사용
 * 1.파일 입력 스트림 생성(파일 열기)
 * FileInputStream fin=new FileInputStream("d\\Temp\\test.out");
 * 2.파일 읽기 
 * int c = 0, n=0;
 * while((c=fin.read())!=-1){
 * b[n]=(byte)c;
 * n++;
 * }
 */




package Day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StreamBinaryInput {
	public static void main(String[] args) {
		byte[] b=new byte[7];
		FileInputStream fin=null;
		try {
			fin=new FileInputStream("d:\\Temp\\test.out");
			int n= 0,c;
			try {
				while((c=fin.read())!=-1) {
				b[n]=(byte)c;
				n++;
				}
				System.out.println("배열 b의 내용을 출력한다.");
				for(int i=0;i<b.length;i++)
					System.out.println(b[i]+" ");
				
				System.out.println();
				fin.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
