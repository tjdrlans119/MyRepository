package ch10.homework.p07;

public class WrongPasswordException extends Exception{
public WrongPasswordException(){}
public WrongPasswordException(String message){
	super(message);//부모의 생성자 매개값으로보냄
}
}
