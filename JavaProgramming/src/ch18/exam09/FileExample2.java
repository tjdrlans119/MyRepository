package ch18.exam09;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample2 {
	public static void main(String[] args) throws IOException{
		File file = new File("C:/Temp/dir1/dir2/data.txt");
//		File parentDir = file.getParentFile();
//		parentDir.mkdirs(); //dir2까지의 파일을만든다.
		file.getParentFile().mkdirs();  //부모경로까지의 파일을 만든다.
		file.createNewFile();//data.txt을 만든다.

		System.out.println(new Date(file.lastModified()));

		
		SimpleDateFormat sdf = new SimpleDateFormat(" ||yyyy년-MM월-dd일|| \n ||  hh시mm분 ss초  ||");
		String strDate = sdf.format(new Date(file.lastModified()));
		System.out.println(strDate);
		


	}
}

