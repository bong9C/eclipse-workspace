package Day21.iotest02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) {
		File file = new File("d:\\Temp\\write.txt");
		FileReader fr = null;
		
			try {
				fr = new FileReader(file);
				int readChar;
				while((readChar = fr.read()) !=-1) {
					System.out.print((char)readChar);
				}	
					
			} catch (IOException ie) {
				// TODO Auto-generated catch block
				ie.printStackTrace();
			}finally {
				try {
					if(fr !=null) fr.close();
				}catch(IOException ie) {
					ie.printStackTrace();
				}
				
				
		
			}
		}
	}


