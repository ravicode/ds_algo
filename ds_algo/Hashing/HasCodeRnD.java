package Hashing;


// here the hascodes are  same , still  the hashmap is showing size of 3 .
//it means hashmap is maintaingn a linked list with separate chaining concept for values 
//having same hashcode and different values.

import java.util.HashMap;
import java.util.Map;

public class HasCodeRnD {

	public static void main(String[] args) {

		Map<Hash, String> mp = new HashMap<Hash, String>();
		mp.put(new Hash("abc"), "ravi1");
		mp.put(new Hash("cba"), "ravi2");
		mp.put(new Hash("bca"), "ravi3");
		mp.put(new Hash("cba"), "ravi4");

		System.out.println(mp.size());
		
		System.out.println(mp.get(new Hash("abc")));
		
	//	System.out.println(mp.get(new Hash("cba")));
		
		

	}
}

class Hash {
	String str;

	public Hash(String str) {
		this.str = str;
	}

	@Override
	public int hashCode() {
		char ar[] = str.toCharArray();
		int hashcode = ar[0] + ar[1] + ar[2];
		//System.out.println(hashcode);
		return hashcode;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof Hash) {
			if (this.str.equals(((Hash) obj).str))
				return true;
			else
				return false;
		} else
			return false;

	}

}