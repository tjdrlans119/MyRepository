package ch18.exam12;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedReaderExample {
	public static void main(String[] args) throws IOException {

		long start = 0;
		long end = 0;

		FileInputStream fr = new FileInputStream("src/ch18/exam12/NAVER.html");
		start = System.nanoTime();
		while (fr.read() != -1) {}
		end=System.nanoTime();
		System.out.println(end-start);
	
		
		FileInputStream fr2 = new FileInputStream("src/ch18/exam12/NAVER.html");
		BufferedInputStream br = new BufferedInputStream(fr2);
		start = System.nanoTime();
		while (br.read() != -1) {}
		end=System.nanoTime();
		System.out.println(end-start);
		
		
	}
}
