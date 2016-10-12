package ch13.exam07;

public class Util {

	/*public static int compare(int t1, int t2){}
	public static int compare(String t1, String t2){}
	public static int compare(Date t1, Date t2){} //메소드오버로딩 */
	
	//T extends Number --> Number 가 상속된다.
	public static <T extends Number>int compare(T t1, T t2){
		double v1 = t1.doubleValue();
		double v2 = t1.doubleValue();
		
	/*	if(v1<v2) return -1;
		else if(v1==v2) return 0;
		else return 1;*/
		return Double.compare(v1, v2);
	}
	
}
