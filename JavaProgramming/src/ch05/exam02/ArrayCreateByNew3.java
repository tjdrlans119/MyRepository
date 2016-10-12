package ch05.exam02;

public class ArrayCreateByNew3 {

	public static void main(String[] args) {
		
		//기본 타입 배열
		int[]arr1=new int[3];
		arr1[0] = 10;
		arr1[1] = 10;
		arr1[2] = 10;
		for(int i=0; i<arr1.length;i++){
			System.out.println("arr1["+i+"]="+arr1[i]);
		}
		
		System.out.println();
		System.out.println()
		;
		
//		참조 타입 배열
		String[] arr2 = new String[3];
		arr2[0] = "성";
		arr2[1] = "기";
		arr2[2] = "문";
		for(int i=0; i<arr1.length;i++){
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
		

		

	}

}
