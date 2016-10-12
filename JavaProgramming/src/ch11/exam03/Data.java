package ch11.exam03;

import java.util.Calendar;

public class Data {
	@Override
	public String toString() {
		Calendar now = Calendar.getInstance(); //Calendar 라는 static메소드를 호출.
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);  
		//Calendat객체로 접근해서 get이라는 매소드를 호출하고 매개값 상수로day_of_month를 준다
		return year + "-"+month+"-"+day;
		
	}
}
