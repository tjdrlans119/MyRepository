package ch18.exam15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputExample {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream("src/ch18/exam15/data.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		Member member2 = new Member("angel", "kim", "12345", 26);
		oos.writeObject(member2);

		oos.flush();
		oos.close();
		fos.close();
		
		System.out.println(member2.getMid());
		System.out.println(member2.getMname());
		System.out.println(member2.getMpassword()); //Transient로 되어있어서 값이 NUll이 나온다
		System.out.println(member2.getMage());
		System.out.println(member2.getNation());	
	}
}
