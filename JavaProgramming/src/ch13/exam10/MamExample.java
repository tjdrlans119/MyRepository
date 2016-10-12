package ch13.exam10;

import java.util.HashMap;

public class MamExample {
	public static void main(String[] args) {
		HashMap<Key,Value> map1 = new HashMap<Key, Value>();
		HashMap<ChidKey, ChildValue> map2 = new HashMap<ChidKey,ChildValue>();
		
		map1.putAll(map2);
//		map2.putAll(map1);// Key가 childKey의 자식이 아니기때문이다.
		 
		
	}
}


class Key{}
class ChidKey extends Key{}
class Value{}
class ChildValue extends Value{}
