package ch18.exam09;

import java.io.File;

public class FileExample {
	public static void main(String[] args) {
		File file = new File("C:/Temp/aaa");

		if (file.exists()) {
			
			if (file.isDirectory()) {
				System.out.println("디렉토리 존재");
			} else if (file.isFile()) {
				System.out.println("파일 존재");
			}
			
		} else {
			System.out.println("아무것도 없습니다.");
		}

		File dir = new File("C:/Temp/dir1/dir2/dir3");
//		dir.mkdir(); dir 1과 dir2가 없기 때문에 dir3이 생성되지 않는다
		dir.mkdirs(); //dir1과dir2가 없어도 경로의 모든 디렉토리를 생성한다.
		
		dir.delete(); //dir 3삭제
	
	}
}