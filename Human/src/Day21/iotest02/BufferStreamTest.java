package Day21.iotest02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferStreamTest {
	public static void main(String[] args)throws Exception {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		
		int data=-1;
		long start=0, end=0;
		
		fis=new FileInputStream("d:\\image\\gallery.png");
		fos=new FileOutputStream("d:\\Temp\\gallery.png");
		start=System.currentTimeMillis();
		while((data=fis.read())!=-1) {
			fos.write(data);
		}
		fos.flush();
		fis.close();
		fos.close();
		end=System.currentTimeMillis();
		System.out.println("사용하지 않았을 때:"+(end-start)+"ms");
		
		fis=new FileInputStream("d:\\image\\gallery.png");
		bis=new BufferedInputStream(fis);
		fos=new FileOutputStream("d:\\Temp\\gallery.png");
		bos=new BufferedOutputStream(fos);
		start=System.currentTimeMillis();
		while((data=bis.read())!=-1) {
			bos.write(data);
		}
		bos.flush();
		
	}
}
