package Day21.iotest02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class WriteFile {
	public static void main(String[] args) {
		File file = new File("d:\\Temp\\write.txt");
		try {
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new FileWriter(file,true));
		String msg = null;
		
		while((msg=in.readLine())!=null) {
			out.println(msg);
		}
		in.close();
		out.close();
	}catch(IOException e) {
		e.printStackTrace();
	}

}
}