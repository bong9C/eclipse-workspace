package Day21.iotest02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) {
		File file = new File("d:\\Temp\\write.txt");
		BufferedReader in = new BufferedReader(new FileReader(file));
		String s;
		try {
			s = in.readLine();
			while(s!=null) {
				System.out.println("read:"+s);
				s = in.readLine();
			}
			in.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
