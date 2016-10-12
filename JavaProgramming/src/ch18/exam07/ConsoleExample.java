package ch18.exam07;

import java.io.Console;

public class ConsoleExample {
	public static void main(String[] args) {

		Console console = System.console();
		
		System.out.print("ID: ");
		String id = console.readLine();
		
		System.out.print("PassWord: ");
		char[] values = console.readPassword();
		String password = new String(values);
		System.out.println(id);
		if(password.isEmpty()){
			System.out.println("****");
		}
		System.out.println(password);
	
	}
}