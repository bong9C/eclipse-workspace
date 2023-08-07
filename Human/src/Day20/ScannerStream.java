package Day20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScannerStream {
	public static void main(String[] args) {
		Scanner sc=null;
		PrintWriter out=null;
		double sum=0;
		try { 
			out=new PrintWriter(new FileWriter("d:\\Temp\\scanner.txt"));
			out.write("9.7");
			out.write("123.456");
			out.flush();
			
			sc= new Scanner(new BufferedReader(new FileReader("d:\\Temp\\scanner.txt")));
			while(sc.hasNext()) { 
				if(sc.hasNextDouble())//hasNext 읽을 데이터가 더 있다. 
					sum+=sc.nextDouble();
				else
					sc.next();
			}
			
			System.out.println("합계:"+sum);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(out!=null)out.close();
				if(sc!=null)sc.close();
			}
		catch (Exception e2) {
	}
	
	}
}
}
