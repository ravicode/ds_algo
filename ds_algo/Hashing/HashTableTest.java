package Hashing;

import java.util.Hashtable;

public class HashTableTest {

	int a;

	public HashTableTest(int a) {
		this.a = a;
	}

	public static void main(String[] args) {

		Hashtable<HashTableTest, String> hs = new Hashtable<HashTableTest, String>();
		hs.put(new HashTableTest(1), "abc");
		hs.put(new HashTableTest(2), "cba");

		System.out.println(hs.size());
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub

		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}
}
