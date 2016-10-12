package ch11.homework.p06;

public class BytesToStringExample {
public static void main(String[] args) {
	byte[] bytes = {73, 32, 108, 111, 118, 101, 32, 121, 111, 117};
	//String 생성자를 이용해서 매개값으로 제공해주면된다.
	String str = new String(bytes); 
	System.out.println(str);
}
}
