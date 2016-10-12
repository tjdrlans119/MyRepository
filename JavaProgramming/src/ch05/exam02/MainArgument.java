package ch05.exam02;

public class MainArgument {
	public static void main(String[] args) {
		// java MainAtgument 3 4
		String v1 = args[0];
		String v2 = args[1];
		String result = v1 + v2;
		
		int intv1 = Integer.parseInt(v1);
		int intv2 = Integer.parseInt(v2);
		int intResult =intv1 + intv2; 
		
		System.out.println("result= " + result);
		System.out.println("result= " + intv1);
		System.out.println("result= " + intv2);
		System.out.println("result= " +intResult);
		
		System.out.println("-----------의문-------");
		System.out.println("a+b는 되는데 왜 intv2+intv2는 안되는지");
		int a=3;
		int b=2;
		System.out.println(a+b);
		System.out.println("result= " + intv2+intv2);
		System.out.println("------------------");
		
	}

}

