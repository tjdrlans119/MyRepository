package ch13.exam04;

public class HashMap<K, V> implements map<K, V> {
	// 컴파일러는 class HashMap의 파라미터를 보고 뒤에껏도 결정하기때문에
	// HashMap에도 K,V를 넣어준다.

	private K k;
	private V v;

	@Override
	public void add(K k, V v) {
		this.k = k;
		this.v = v;
	}

	@Override
	public V get(K k) {
		if (this.k == k) {
			return v;
		}
		return null;
	}

}
