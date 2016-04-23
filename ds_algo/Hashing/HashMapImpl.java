package Hashing;

class Entry {
	final String key;
	String value;
	Entry next;

	Entry(String k, String v) {
		key = k;
		value = v;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public void setNext(Entry next) {
		this.next = next;
	}

	public String getKey() {
		return key;
	}
	
	public Entry getNext() {
		return next;
	}
}

public class HashMapImpl { // for simplicity size is taken as 2^4
	private static final int SIZE = 16;
	private Entry table[] = new Entry[SIZE];
	int count=0;

	/**
	 * * User defined simple Map data structure * with key and value. * This is
	 * also used as linked list in case multiple * key-value pairs lead to the
	 * same bucket with same * hashcodes and different keys (collisions) using *
	 * pointer 'next'. * * @author ntallapa
	 */

	/**
	 * * Returns the entry associated with the specified key in the * HashMap.
	 * Returns null if the HashMap contains no mapping * for the key.
	 */
	public Entry get(String k) {
		int hash = k.hashCode() % SIZE;
		Entry e = table[hash]; // if bucket is found then traverse through the
								// linked list and
		// see if element is present
		while (e != null) {
			if (e.key.equals(k)) {
				return e;
			}
			e = e.getNext();
		}
		return null;
	}

	/**
	 * * Associates the specified value with the specified key in this map. * If
	 * the map previously contained a mapping for the key, the old * value is
	 * replaced.
	 */
	public void put(String k, String v) {
		int hash = k.hashCode() % SIZE;
		Entry e = table[hash];
		if(e==null){ // new element in the map, hence creating new bucket
			Entry entryInNewBucket = new Entry(k, v);
			table[hash] = entryInNewBucket;
			count++;
		}
		while (e != null) { // it means we are trying to insert duplicate
			// key-value pair, hence overwrite the current // pair with the old
			// pair
			if (e.key.equals(k)) {
				e.value = v;
				break;
			} else { // traverse to the end of the list and insert new element
				// in the same bucket
				//while (e.getNext() != null) {
				if(e.getNext()==null)
				{
			Entry entryInOldBucket = new Entry(k, v);
			e.setNext(entryInOldBucket);
			count++;
			break;
				}
				else
					e = e.getNext();
				//}
					
			}
		} 
		
	}

	// for testing our own map
	public static void main(String[] args) {
		HashMapImpl mp = new HashMapImpl();
		mp.put("Niranjan", "SMTS");
		mp.put("Ananth", "SSE");
		mp.put("Niranjan", "SMTS1");
		mp.put("Chandu", "SSE");
		Entry e = mp.get("Niranjan");
		if(e!=null)
		System.out.println("" + e.getValue());
		else
			System.out.println("No Entry");
		
		System.out.println(mp.count);
	}

}
