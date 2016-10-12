package ch11.exam10;

public class StringCharAtExample {
	public static void main(String[] args) {

		String ssn = "920619-1111111";
		char sex = ssn.charAt(7);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("male");
			break;
		case '2':
		case '4':
			System.out.println("female");
			break;
		}
	}
}
