package ch11.exam15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd / hh시mm분 ss초");
		String strDate = sdf.format(now);
		System.out.println(strDate);
		System.out.println("------------------------------------");
		
		Calendar cal = Calendar.getInstance();
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH)+1;
		int day=cal.get(Calendar.DAY_OF_MONTH);
		int houre=cal.get(Calendar.HOUR_OF_DAY);
		int minute=cal.get(Calendar.MINUTE);
		int seconde=cal.get(Calendar.SECOND);
		int amPm=cal.get(Calendar.AM_PM);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("Year: "+year);
		System.out.println("month: "+month);
		System.out.println("day: "+day);
		System.out.println("houre: "+houre);
		System.out.println("minute: "+minute);
		System.out.println("seconde: "+seconde);
		System.out.println("amPm: "+amPm);
		System.out.println("week: "+week);

		
		
	}

}
