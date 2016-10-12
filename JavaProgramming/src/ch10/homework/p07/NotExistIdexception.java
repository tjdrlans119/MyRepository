package ch10.homework.p07;

public class NotExistIdexception extends Exception{//exception상속
public NotExistIdexception(){}
public NotExistIdexception(String message){
	super(message);//부모의 생성자 매개값으로보냄
}
}
