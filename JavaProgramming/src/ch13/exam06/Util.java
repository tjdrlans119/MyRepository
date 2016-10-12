package ch13.exam06;

public class Util {
	public static <K,V>boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean ValueCompare2 = p1.getKey().equals(p2.getKey());
		return keyCompare && ValueCompare2;
	}
	
	public static <K,V>Pair max(Pair<K,V> p1, Pair<K, V> p2){
		return p2;		
	}
}
