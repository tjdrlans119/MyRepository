package ch13.exam06;

public class Pair<K,V>{
	
	private K Key;
	private V Value;
	
	public Pair(K key, V value) {
		super();
		this.Key = key;
		this.Value = value;
	}

	public K getKey() {
		return Key;
	}

	public void setKey(K key) {
		Key = key;
	}

	public V getValue() {
		return Value;
	}

	public void setValue(V value) {
		Value = value;
	}
	

}
