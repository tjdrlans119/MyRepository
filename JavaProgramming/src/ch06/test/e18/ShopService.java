package ch06.test.e18;

public class ShopService {
	private static ShopService singgleton = new ShopService();
	
	private ShopService(){}
	static ShopService getInstance(){
		return singgleton;
	}
}
