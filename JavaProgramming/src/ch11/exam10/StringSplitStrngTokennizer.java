package ch11.exam10;

import java.util.StringTokenizer;

public class StringSplitStrngTokennizer {
	public static void main(String[] args) {
		String data = "홍길동,이수홍,박연수,감자바,최명호";

		String[] dataArray = data.split(",");
		System.out.println(dataArray.length);
		for (String name : dataArray) {
			System.out.println(name);
		}
		StringTokenizer st = new StringTokenizer(data, ",");
		System.out.println(st.countTokens());// 몇개로나뉘는

		data = "홍길동&이수홍,박연수,잠자바-최명호";
	
		dataArray = data.split("&|.,-|");
		while (st.hasMoreTokens()) { // hasMoreTokens, 는 항상 가져올게잇는경우 true가 계속나온다
			String name = st.nextToken();
			System.out.println(name);
		}
	}

}
