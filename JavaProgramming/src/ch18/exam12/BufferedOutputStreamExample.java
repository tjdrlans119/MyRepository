package ch18.exam12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
	public static void main(String[] args) throws IOException {
		
		long start = 0, end =0;

		//----------------------버퍼 사용안할때-------------------------------------------
		FileInputStream fis = new FileInputStream("src/ch18/exam10/Desert.jpg");
		FileOutputStream fos = new FileOutputStream("src/ch18/exam10/Desert2.jpg");
		
		int value;

		start = System.currentTimeMillis();
		
		while ((value = fis.read()) != -1) {
			fos.write(value);
		}
		
		end = System.currentTimeMillis();
		
		System.out.println("버퍼사용안할때 복사시간: "+(end-start));
		
		fos.flush();
		fos.close();
		fis.close();
		//--------------------------------------------------------------------------------------
		//----------------------버퍼 사용할때-------------------------------------------
		FileInputStream fis2 = new FileInputStream("src/ch18/exam10/Desert.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		FileOutputStream fos2 = new FileOutputStream("src/ch18/exam10/Desert2.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		start = System.currentTimeMillis();
		while ((value = bis.read()) != -1) {
			bos.write(value);
		}
		end = System.currentTimeMillis();
		System.out.println("버퍼사용할때 복사시간: "+(end-start));
		bos.flush();
		bos.close();
		bis.close();
		

	}

}
