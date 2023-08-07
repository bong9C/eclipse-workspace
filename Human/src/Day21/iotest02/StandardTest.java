package Day21.iotest02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StandardTest {
	public static void main(String[] args) {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(ir);
		String msg = null;
		System.out.println("Exit:crtl-z");
		
		try {
			msg=in.readLine();
			while(msg!=null) {
			System.err.println("읽기:"+msg);
			msg=in.readLine();
			}
			
			in.close();
			ir.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
