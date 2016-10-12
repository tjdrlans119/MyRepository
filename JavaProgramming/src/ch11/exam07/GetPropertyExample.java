package ch11.exam07;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		String userDir = System.getProperty("user.dir");
		String javaHome = System.getProperty("java.home");

		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);
		System.out.println(userDir);
		System.out.println(javaHome);

		Properties props = System.getProperties();
		Set keys = props.keySet();
		/*
		 * System.out.println(props); System.out.println("--------");
		 * System.out.println(keys);
		 */
		System.out.println("----------------------------------------");
		for (Object objKey : keys) {
			String key = (String) objKey;
			System.out.print(key);
			System.out.print("  : ");
			String value = System.getProperty(key);
			System.out.println(value);
			System.out.println();
		}
	}
}
