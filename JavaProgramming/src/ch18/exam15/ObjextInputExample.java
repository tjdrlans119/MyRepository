package ch18.exam15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjextInputExample {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("src/ch18/exam15/data.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Member member2 = (Member)ois.readObject();
		
		System.out.println(member2.getMid());
		System.out.println(member2.getMname());
		System.out.println(member2.getMpassword()); //Transient로 되어있어서 값이 NUll이 나온다
		System.out.println(member2.getMage());
		System.out.println(member2.getNation());		
	}
}
