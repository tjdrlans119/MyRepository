package ch11.exam14;

import java.util.Arrays;

public class MathExample {
public static void main(String[] args) {
	double v1 = Math.ceil(5.3); //5.3의 최상
	double v2 = Math.floor(5.3);//5.3의 바닥
	System.out.println(v1);
	System.out.println(v2);
	
	double v3 = Math.max(5, 2);
	double v4 = Math.min(5, 3);
	System.out.println(v3);
	System.out.println(v4);
	
	int[] lotto = new int[7];
	for (int i = 1; i <=lotto.length; i++) {
		lotto[i] = (int)(Math.random()*45)+1;
	}
	System.out.println(Arrays.toString(lotto));
	
	
}
}
