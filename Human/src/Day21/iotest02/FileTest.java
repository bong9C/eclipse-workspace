package Day21.iotest02;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		File file = new File(".", "FileTest.java");
		System.out.println("파일 경로는 ?"+file.getPath());
		System.out.println("파일 이름은 ?"+file.getName());
		System.out.println("파일 상위 디렉토리는 ?"+file.getParent());
		System.out.println("파일 절대경로는 ?"+file.getAbsolutePath());
		System.out.println("파일 경로는 ?"+file.getPath());
		System.out.println("파일이 존재하니 ?"+file.exists());
		boolean b = new File("."+File.separator+"hello").mkdir();
		
		String[] listing = new File(".").list();
		System.out.println("현재 디렉터리 내용은 뭐게?");
		for (int i = 0; i < listing.length; i++) {
			System.out.println(listing[i]);
		}
	}

}
