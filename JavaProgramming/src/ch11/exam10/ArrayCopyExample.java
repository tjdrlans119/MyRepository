package ch11.exam10;

import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {
		char[] arr1 = { 'J', 'A', 'V', 'A' };

		// 배열복사 방법1
		char[] arr2 = new char[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i]=arr1[i];
		}
		System.out.println(Arrays.toString(arr2));
		/*for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr2[i]);
		}*/
		
		
		//배열복사 방법2
		char[] arr3 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		System.out.println(Arrays.toString(arr2));

		
		//배열복사 방법3
		char[] char4 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		
	}
}
