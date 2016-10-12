package ch13.exam03;

public class ProductExample {
public static void main(String[] args) {
	Product<String,String> p1 = new Product<>();
	
	p1.setKind("Tv");
	p1.setModel("Smart");
	String kind = p1.getKind();  
	String model = p1.getModel();
	//원래 오브젝트파일 이라서 타입변환을 해야하는데.
	//제네릭을 사용했기 때문에 타입변환이 필요없다
	
	Product<Tv, String> p2 = new Product<>();
	
	p2.setKind(new Tv());
	p2.setModel("wild");
	Tv kind2 = p2.getKind();
	String model2 = p2.getModel();
	
	
	
	
	
}
}
