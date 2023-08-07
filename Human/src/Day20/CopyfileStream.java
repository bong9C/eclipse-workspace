package Day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyfileStream {
	public static void main(String[] args) {
		FileInputStream in=null;
		FileOutputStream out=null;
		try {
			in=new FileInputStream("d:\\Temp\\input.ini");
			out=new FileOutputStream("d:\\Temp\\output.ini");
			int c=0;
			while((c=in.read())!=-1) 
			out.write(c);
			// 저장하기 
			in.close();
			out.close();
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(in!=null)in.close();
				if(out!=null)out.close();
			}catch(Exception e2) {
				
	
		}
	

}
	}
}

