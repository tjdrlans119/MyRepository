package ch18.exam10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputExample {
	public static void main(String[] args) throws IOException {
	
		//FileInputStream은 꼭 해당 경로에 파일이 존재해야한다.
		FileInputStream fis = new FileInputStream("src/ch18/exam10/Desert.jpg");
		//FileOutputStream은 파일이 존재하지 않아도 된다.
		FileOutputStream fos = new FileOutputStream("src/ch18/exam10/Desert2.jpg");
		
		byte[] values = new byte[1024];
		int byteNum = -1;
		while ((byteNum = fis.read(values)) != -1) {
			//fos.write(values); 이걸 사용하게 되면 
			fos.write(values, 0, byteNum);
		}
		
		fos.flush();
		fos.close();
		fis.close();
	}
}