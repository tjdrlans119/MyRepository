package ch15.exam01;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
public static void main(String[] args) {
	List <String>list = Arrays.asList("java","JDBC","DataBase");
	//Arrays.asList 로 만들어진 객체는 고정된 항목으로 만 사용될수 있다.
	//list의 구현객체를 만들긴하지만 내부의 배열로 만들기 때문에
	//add, remove, 등등을 사용할 수 없다.
	
	System.out.println(list.size());
	for(String str : list){
		System.out.println(str);
	}
	
}
}
