package ch18.exam10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterExample {
	public static void main(String[] args) throws IOException {
		
		//FileInputStream은 꼭 해당 경로에 파일이 존재해야한다.
		FileReader fr = new FileReader("src/ch18/exam10/NAVER.html");

		//FileOutputStream은 파일이 존재하지 않아도 된다.
		FileWriter fw = new FileWriter("src/ch18/exam10/NAVER2.html");
		
		char[] values = new char[1024];
		int charNum;
		while ((charNum = fr.read(values)) != -1) {
			//fos.write(values); 이걸 사용하게 되면 
			fw.write(values, 0, charNum);
		}
		
		fw.flush();
		fw.close();
		fr.close();
		
		

	}

}
